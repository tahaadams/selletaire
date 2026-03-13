package phaser.card

import com.definitelyscala.phaser.{ BitmapData, Image }
import models.card.{ Rank, Suit }
import models.settings.CardLayout

class CardRender(
  layout: CardLayout,
  blank: Image,
  suitImages: IndexedSeq[Image] = IndexedSeq.empty,
  suitRankImages: Map[(Int, Int), Image] = Map.empty,
  faceCardImages: Map[(Int, Int), Image] = Map.empty,
  cardWidth: Double = 400,
  cardHeight: Double = 600) {
  private[this] val rankWidths = IndexedSeq(0.8, 0.8, 0.8, 0.8, 0.8, 0.8, 0.8, 0.8, 1.0, 0.9, 0.9, 0.9, 0.9)

  def renderEmptyPile(tex: BitmapData, opaque: BitmapData) = {
    tex.fill(0, 0, 0, 0)
    tex.alphaMask(opaque, blank)
  }

  def renderCardBack(back: Image, tex: BitmapData) = {
    tex.fill(0, 0, 0, 0)
    tex.draw(blank, 0, 0)
    tex.draw(back, 0, 0)
  }

  def renderCard(s: Suit, r: Rank, tex: BitmapData) = {
    tex.draw(blank, 0, 0)

    val suitImage = suitImages(s.index)
    val rankImage = if (r == Rank.Unknown) {
      throw new IllegalStateException(s"Attempt to render unknown rank for card [$r$s].")
    } else {
      suitRankImages((s.index, r.index))
    }

    // Look up the PNG face image for this specific suit + rank
    val faceImage = faceCardImages((s.index, r.index))

    // Draw the face image filling the entire card
    tex.draw(faceImage, cardWidth / 2, cardHeight / 2, cardWidth, cardHeight)

    layout match {
      case CardLayout.A =>
        val rIdx = r.index - 2
        val rankWidth = rankWidths(rIdx)
        tex.draw(rankImage, 60 * rankWidth, 60, 80, 80)
        tex.draw(suitImage, (60 * rankWidth) + 60, 60, 50, 50)
        tex.draw(suitImage, 60 * rankWidth, 130, 50, 50)
      case CardLayout.B =>
        tex.draw(rankImage, 35, 45, 50, 50)
        tex.draw(suitImage, 35, 95, 50, 50)
        rankImage.angle = 180
        suitImage.angle = 180
        tex.draw(rankImage, 365, 565, 50, 50)
        tex.draw(suitImage, 365, 515, 50, 50)
        rankImage.angle = 0
        suitImage.angle = 0
      case _ => throw new IllegalStateException("?: " + layout)
    }
    tex
  }
}