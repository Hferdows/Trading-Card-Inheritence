/* PROGRAM 3
** TradingCard - general class for trading cards
** 02/19/23
** @HANNAHFERDOWS
 */

public class TradingCard {
    String cardName;
    String cardImage;

    // default constructor for TradingCard, to be later referenced in all of its sub classes.
    public TradingCard(String name, String image) {
        cardName = name;
        cardImage = image;
    }

    public String getName() { // retrieves name of a general trading card.
        return cardName;
    }
    public String getImg() { // retreives image of a general trading card.
        return cardImage;
    }
    @Override
    public String toString() { // toString() method which overrides the Object class' toString().
        return "" + getName();
    }


}