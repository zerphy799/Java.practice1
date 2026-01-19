import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test extends playingCard{
    public static void main(String[] args) {
        playingCard playingcard=new playingCard();
        Collections.shuffle(cards);
        List<playingCard> player1=new ArrayList<>();
        List<playingCard> player2=new ArrayList<>();
        List<playingCard> player3=new ArrayList<>();
        List<playingCard> card=new ArrayList<>();
        for (int i = 0; i < 17; i++) {
            player1.add(cards.get(i));
        }
        for (int i = 17; i < 34; i++) {
            player2.add(cards.get(i));
        }
        for (int i = 34; i < 51; i++) {
            player3.add(cards.get(i));
        }
        for (int i = 51; i < 54; i++) {
            card.add(cards.get(i));
        }

        Collections.sort(player1,new Comparator<playingCard>(){
            @Override
            public int compare(playingCard o1, playingCard o2) {
                if(o1.getType()==null||o2.getType()==null){
                    return -1;
                }
                return o1.getType().compareTo(o2.getType());
            }
        });
        Collections.sort(player2,new Comparator<playingCard>(){
            @Override
            public int compare(playingCard o1, playingCard o2) {
                if(o1.getType()==null||o2.getType()==null){
                    return -1;
                }
                return o1.getType().compareTo(o2.getType());
            }
        });
        Collections.sort(player3,new Comparator<playingCard>(){
            @Override
            public int compare(playingCard o1, playingCard o2) {
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
