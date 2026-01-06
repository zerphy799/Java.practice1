public class Game {
   private String gamename="英雄联盟";
   private String plyer="李白";

 static Computer computer=new Computer();

    public Game(String station,int a) {
          computer.setStation(station);
          computer.setRunningMemory(a);
    }
    public void judge(){
        if("独立显卡".equals(computer.getStation())){
            if(computer.getRunningMemory()>=4){
                System.out.println("可以玩这个游戏");
            }
            else{
                System.out.println("运存不够");
            }
        }
        else{
            System.out.println("不是独立显卡，不可以玩");
        }
    }

    public String getGamename() {
        return gamename;
    }

    public String getPlyer() {
        return plyer;
    }
}
