public class Manager {
    private String bookname1="java基础";
    private String bookname2="mysql数据库";
    private String bookname3="java编程思想";
    private  static char type;
    static LibaryCard libraryCard01=new LibaryCard();
    public Manager(char type ) {
        this.type=type;
        libraryCard01.setType(type);
    }



    public void brow(){
        if(libraryCard01.getType()=='A'){
            System.out.println("你可以借"+bookname1);
        }
        else if(libraryCard01.getType()=='B'){
            System.out.println("你可以借"+bookname2);
        }
        else if(libraryCard01.getType()=='C'){
            System.out.println("你可以借"+bookname3);
        }
        else{
            System.out.println("错误");
        }

    }

}
