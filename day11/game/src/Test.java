public class Test {
    public static void main(String[] args) {
        Game game = new Game("独立显卡",5);
        System.out.println(game.getPlyer()+"用惠普笔记本玩"+game.getGamename());
        game.judge();
        Game game01= new Game("独立显卡",3);
        System.out.println(game01.getPlyer()+"用惠普笔记本玩"+game01.getGamename());
        game.judge();

    }
}
