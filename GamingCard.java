public class GamingCard extends TradingCard{
    String gamingCardGame; // both gamingCardGame and gamingCardCategory are fields in addition to those of TradingCard
    String gamingCardCategory;
    public GamingCard(String name, String image, String category, String game) {
        super(name, image); // sets the parameters up for gamingCard through utilizing the parent class' default constructor
        gamingCardCategory = category;
        gamingCardGame = game;
    }
    public String getGame() { // retrieves what game the card is from
        return gamingCardGame;
    }
    public String getCategory() { // retrieves what type of gaming card it is
        return gamingCardCategory;
    }
    // toString() method overrides TradingCard's toString() in order to be better suited to gaming cards.
    @Override
    public String toString() {
        return super.toString() + ": " + getGame() + " character";
    }
}

