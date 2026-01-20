import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
      //  playingCard playingcard=new playingCard();
        Collections.shuffle(PlayingCard.getCards());
        List<PlayingCard> player1=new ArrayList<>();
        List<PlayingCard> player2=new ArrayList<>();
        List<PlayingCard> player3=new ArrayList<>();
        List<PlayingCard> card=new ArrayList<>();
        for (int i = 0; i < 17; i++) {
            player1.add(PlayingCard.getCards().get(i));
        }
        for (int i = 17; i < 34; i++) {
            player2.add(PlayingCard.getCards().get(i));
        }
        for (int i = 34; i < 51; i++) {
            player3.add(PlayingCard.getCards().get(i));
        }
        for (int i = 51; i < 54; i++) {
            card.add(PlayingCard.getCards().get(i));
        }

        Collections.sort(player1,new Comparator<PlayingCard>(){
            @Override
            public int compare(PlayingCard o1, PlayingCard o2) {
                if(o1.getType()==null||o2.getType()==null){
                    return -1;
                }
                return o1.getType().compareTo(o2.getType());
            }
        });
        Collections.sort(player2,new Comparator<PlayingCard>(){
            @Override
            public int compare(PlayingCard o1, PlayingCard o2) {
                if(o1.getType()==null||o2.getType()==null){
                    return -1;
                }
                return o1.getType().compareTo(o2.getType());
            }
        });
        Collections.sort(player3,new Comparator<PlayingCard>(){
            @Override
            public int compare(PlayingCard o1, PlayingCard o2) {
                if(o1.getType()==null||o2.getType()==null){
                    return -1;
                }
                return o1.getType().compareTo(o2.getType());
            }
        });
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(card);

    }
}
