package lesson1;
public  class Team{

    private static String teamName;

    public Team(String teamName){
        this.teamName=teamName;
    }

    //массив из четырех участников.
    static Participants[] membersArr=new Participants[4];

    public static String getTeamName() {
        return teamName;
    }

    //метод вывода информации обо всех членах команды.
    static void showMembers(Participants[] membersArr) {
        System.out.println("Команда-" + Team.getTeamName()+":\n");
        for (int i = 0; i < 4; i++) {
            System.out.println("Участник № " + (i + 1) + " - " +
                    Team.membersArr[i].getNameMember() + " // Уровень выносливости - " +
                    Team.membersArr[i].getPowerMember());
        }
    }

    //метод для вывода информации о членах команды, прошедших дистанцию.
    static void showResults(Participants[] membersArr){
        System.out.println("Участники прошедшие полосу препятствий:");
        for(int i=0; i<4; i++)
           if (Team.membersArr[i].getPowerMember()>=0){
               System.out.println("Участник № " + (i + 1) + " - " + Team.membersArr[i].getNameMember());
           }
    }
}
