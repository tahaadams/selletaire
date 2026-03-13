package phaser.card

import com.definitelyscala.phaser.Image
import models.card.{ Rank, Suit }
import models.settings.Settings
import phaser.PhaserGame

class CardImages(game: PhaserGame, settings: Settings) {
  private[this] val blank = new Image(game, 0, 0, "card-blank", 0)
  private[this] val back = new Image(game, 0, 0, "card-back", 0)

  private[this] val suitImages = IndexedSeq(0, 1, 2, 3).map { i =>
    val ret = new Image(game, 0, 0, "card-suits", i)
    ret.anchor.x = 0.5
    ret.anchor.y = 0.5
    ret
  }

  // 4 rows of rank images (one per suit: Hearts=0, Spades=1, Diamonds=2, Clubs=3)
  // Each row has 13 ranks. Frame index = (suitIndex * 13) + (rank.index - 2)
  private[this] val suitRankImages: Map[(Int, Int), Image] = (for {
    s <- Suit.standard
    r <- Rank.all
  } yield {
    val frameIndex = (s.index * 13) + (r.index - 2)
    val ret = new Image(game, 0, 0, "card-ranks", frameIndex)
    ret.anchor.x = 0.5
    ret.anchor.y = 0.5
    (s.index, r.index) -> ret
  }).toMap

  // Loads all 52 card face images (13 ranks x 4 suits)
  // Sprite sheet layout: 13 columns (A,2,3,4,5,6,7,8,9,10,J,Q,K) x 4 rows (H,S,D,C)
  // Frame index = (suit.index * 13) + columnIndex
  private[this] val faceCardImages: Map[(Int, Int), Image] = (for {
    s <- Suit.standard
    r <- Rank.all
  } yield {
    val colIndex = r match {
      case Rank.Ace => 0
      case _ => r.index - 1 // Two(2)->1, Three(3)->2, ..., King(13)->12
    }
    val frameIndex = (s.index * 13) + colIndex
    val ret = new Image(game, 0, 0, "card-faces", frameIndex)
    ret.anchor.x = 0.5
    ret.anchor.y = 0.5
    (s.index, r.index) -> ret
  }).toMap

  private[this] val renderer = new CardRender(
    settings.cardLayout, blank, suitImages, suitRankImages, faceCardImages,
    settings.cardSet.w.toDouble, settings.cardSet.h.toDouble)

  val textures = Suit.standard.flatMap { s =>
    Rank.all.map { r =>
      val tex = game.add.bitmapData(settings.cardSet.w.toDouble, settings.cardSet.h.toDouble)
      r.value.toString + s.value -> renderer.renderCard(s, r, tex)
    }
  }.toMap

  val cardBack = {
    val tex = game.add.bitmapData(settings.cardSet.w.toDouble, settings.cardSet.h.toDouble)
    renderer.renderCardBack(back, tex)
    tex
  }

  val emptyPile = {
    val tex = game.add.bitmapData(settings.cardSet.w.toDouble, settings.cardSet.h.toDouble)
    val opaque = game.add.bitmapData(settings.cardSet.w.toDouble, settings.cardSet.h.toDouble)
    opaque.fill(0, 0, 0, 1)
    renderer.renderEmptyPile(tex, opaque)
    tex
  }
}