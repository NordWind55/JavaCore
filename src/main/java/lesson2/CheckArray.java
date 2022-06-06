package lesson2;

public class CheckArray {
    private String[][] testArr;
    private int sumArr = 0;
    private int iArr;
    private int jArr;

    public CheckArray(String[][] testArr) {
        this.testArr = testArr;
    }

    //Проверяем оба исключения
    public void doubleCheckArray(String[][] testArr) {
        try {
            checkSizeArray(testArr);
            checkDataArray(testArr);
        } catch (MyArraySizeException sizeEx) {
            System.out.println(sizeEx.getMessage());
        } catch (MyArrayDataException dataEx) {
            System.out.println(dataEx.getMessage());
        }
    }

    //Проверяем размер массива
    public static void checkSizeArray(String[][] testArr) throws MyArraySizeException{
        int i=0;
        do{
            if (testArr.length!=4 || testArr[i].length!=4){
                throw new MyArraySizeException("Массив не корректного размера.\n");
            }
            i++;
        } while (i<testArr.length);
        System.out.println("Массив корректного размера.");
    }

    //Проверяем данные в массиве
    public void checkDataArray(String[][] testArr) throws MyArrayDataException{
        if (checkCorrectDataArr(testArr)==true){
            System.out.println("Сумма всех элементов массива равна "+sumArr+"\n");
        }
        else{
            throw new MyArrayDataException("Oops... В ячейке ["+iArr+"]["+jArr+"] лежат неверные данные\n");
        }
    }

    //Находим адрес ячейки с неверными данными.
    //Если данные коректны, находим сумму элементов массива.
    public boolean checkCorrectDataArr(String[][] testArr){
        for (iArr=0; iArr<testArr.length; iArr++){
            for (jArr=0; jArr<testArr.length; jArr++){
                try{
                    sumArr+=Integer.parseInt(testArr[iArr][jArr]);
                }
                catch(NumberFormatException dataEx){
                    return false;
                }
            }
        }
        return true;
    }
}