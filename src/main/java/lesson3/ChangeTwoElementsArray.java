package lesson3;

import java.util.Arrays;

public class ChangeTwoElementsArray{
    private int firstElementArr;
    private int secondElementArr;
    private String[] myArr;

    public ChangeTwoElementsArray(int firstElementArr, int secondElementArr, String... myArr){
        this.firstElementArr=firstElementArr;
        this.secondElementArr=secondElementArr;
        this.myArr=myArr;
    }

    public void changeArr(){
        try{
            if(firstElementArr>=myArr.length){
                throw new MyArraySizeException("Первый введенный элемент находится за диапазоном массива.");
            }
            if(secondElementArr>=myArr.length){
                throw new MyArraySizeException("Второй введенный элемент находится за диапазоном массива.");
            }
            else{
                System.out.println("Before - "+Arrays.toString(myArr));
                String firstArr = myArr[firstElementArr];
                myArr[firstElementArr] = myArr[secondElementArr];
                myArr[secondElementArr] = firstArr;
                System.out.println("After  - "+Arrays.toString(myArr)+"\n");
            }
        }
        catch(MyArraySizeException sizeEx){
            System.out.println(sizeEx.getMessage());}
    }
}
