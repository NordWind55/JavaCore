package lesson1;

public class Main {
    public static void main(String[] args){
        //название команды.
        Team newTeam = new Team("Белые тигры");

        //массив из четырех участников.
        Team.membersArr[0]=new Participants("Коля",26);
        Team.membersArr[1]=new Participants("Петя",12);
        Team.membersArr[2]=new Participants("Рома",27);
        Team.membersArr[3]=new Participants("Дима",18);

        //массив препятствий.
        Course.obstacleCourse[0]=new Course("Бег", 12);
        Course.obstacleCourse[1]=new Course("Плавание", 15);
        Course.obstacleCourse[2]=new Course("Преодоление стены", 18);

        Course.line();
        Team.showMembers(Team.membersArr);
        Course.line();
        Course.difficultyObstacles();
        Course.doIt(Team.membersArr, Course.obstacleCourse);
        Team.showResults(Team.membersArr);

    }

}
