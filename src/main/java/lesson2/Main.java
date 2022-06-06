package lesson2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException {
        String[][] myFirstArr = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String[][] mySecondArr = {{"1","2","3","4"},{"1","2","q","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String[][] myThirdArr=new String[4][5];
        String[][] myFourthArr=new String[0][4];

        CheckArray firstCheck=new CheckArray(myFirstArr);
        firstCheck.doubleCheckArray(myFirstArr);

        CheckArray secondCheck=new CheckArray(mySecondArr);
        secondCheck.doubleCheckArray(mySecondArr);

        CheckArray thirdCheck=new CheckArray(myThirdArr);
        thirdCheck.doubleCheckArray(myThirdArr);

        CheckArray fourthCheck=new CheckArray(myFourthArr);
        fourthCheck.doubleCheckArray(myFourthArr);
    }
}