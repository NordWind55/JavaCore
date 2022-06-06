package lesson1;

public class Course {

    private String nameObstacle;
    private int levelDifficulty;

    public String getNameObstacle() {
        return nameObstacle;
    }

    public int getLevelDifficulty() {
        return levelDifficulty;
    }

    public Course(String nameObstacle, int levelDifficulty){
        this.nameObstacle=nameObstacle;
        this.levelDifficulty=levelDifficulty;
    }

    //массив препятствий;
    static Course[] obstacleCourse=new Course[3];

    //метод, который просит команду пройти всю полосу.
    static public void doIt(Participants[] membersArr, Course[] obstacleCourse){
        for(int i=0;i<4; i++){
            int x=0;
            for(int j=0; j<3; j++) {
                x=Team.membersArr[i].getPowerMember()-Course.obstacleCourse[j].getLevelDifficulty();
            }
            Team.membersArr[i].setPowerMember(x);
        }
    }

    static public void difficultyObstacles(){
        System.out.println("Сложность полосы препятствий:");
        for(int i=0; i<3; i++){
            System.out.println(Course.obstacleCourse[i].getNameObstacle()+"-"+
                    Course.obstacleCourse[i].getLevelDifficulty());
        }
        System.out.println();
    }

    static public void line(){
        System.out.println("\n------------------------------------------------\n");
    }

}
