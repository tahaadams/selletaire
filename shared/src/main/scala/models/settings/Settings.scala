package models.settings

object Settings {
  val default = Settings()
}

case class Settings(
  backgroundColor: String = "#926f9c",
  backgroundPattern: Option[String] = Some("black-felt"),
  cardSet: CardSet = CardSet.Default,
  cardBack: CardBack = CardBack.A,
  cardBlank: CardBlank = CardBlank.A,
  cardLayout: CardLayout = CardLayout.A,
  cardRanks: CardRanks = CardRanks.A,
  cardSuits: CardSuits = CardSuits.A,
  menuPosition: MenuPosition = MenuPosition.Top,
  tilt: Boolean = true,
  autoFlip: Boolean = true,
  audio: Boolean = false,
  language: Language = Language.English)
