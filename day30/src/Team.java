public class Team {
    @Anno("中国队")
    private  String teamName;

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                '}';
    }
}
