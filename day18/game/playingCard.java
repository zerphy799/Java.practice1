import java.util.ArrayList;
import java.util.List;

public class playingCard {
    public static List<playingCard> cards = new ArrayList<>();
    private String number;
    private String type;
    private String suit;
    private String[] name = {"黑桃", "红桃", "梅花", "方块"};
    private String[] number1 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public playingCard(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public playingCard(String suit) {
        this.suit = suit;
    }

    public playingCard() {

        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 13; k++) {
                cards.add(new playingCard(number1[k], name[j]));
            }
        }
        cards.add(new playingCard("大王"));
        cards.add(new playingCard("小王"));
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
}
