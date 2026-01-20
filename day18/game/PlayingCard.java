import java.util.ArrayList;
import java.util.List;

public class PlayingCard {
    public static List<PlayingCard> cards = new ArrayList<>();
    private  String number;
    private  String type;
    private String suit;
    private static String[] name = {"黑桃", "红桃", "梅花", "方块"};
    private static String[] number1 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public PlayingCard(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public PlayingCard(String suit) {
        this.suit = suit;
    }

    public PlayingCard() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        if (suit == null) {
            return "playingCard{" +
                    type +
                    number +
                    '}';
        }
        return "playingCard{" +
                suit +
                '}';
    }
    public static List<PlayingCard> getCards() {

        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 13; k++) {
                cards.add(new PlayingCard(number1[k], name[j]));
            }
        }
        cards.add(new PlayingCard("大王"));
        cards.add(new PlayingCard("小王"));
        return cards;
    }
}
