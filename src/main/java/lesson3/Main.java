package lesson3;

public class Main{
    public static void main(String[] args){

        //Задание 1
        System.out.println("\nЗадание 1");
        String[] myFirstArr={"1","2","3","4"};
        String[] mySecondArr=new String[7];

        ChangeTwoElementsArray firstChange = new ChangeTwoElementsArray(0, 3,myFirstArr);
        firstChange.changeArr();

        ChangeTwoElementsArray secondChange=new ChangeTwoElementsArray(7, 6,mySecondArr);
        secondChange.changeArr();

        //Задание 2
        System.out.println("\nЗадание 2");
        Box<Apple> firstAppleBox = new Box<Apple>(1);
        Box<Orange> firstOrangeBox = new Box<Orange>(1.5f);
        Box<Apple> secondAppleBox = new Box<Apple>(1);

        firstAppleBox.addFruits(new Apple());
        firstAppleBox.addFruits(new Apple());
        firstOrangeBox.addFruits(new Orange());
        firstOrangeBox.addFruits(new Orange());
        firstOrangeBox.addFruits(new Orange());
        secondAppleBox.addFruits(new Apple());

        System.out.println("Вес первой коробки с яблоками: " + firstAppleBox.getWeight());
        System.out.println("Вес первой коробки с апельсинами: " + firstOrangeBox.getWeight());
        System.out.println("Вес второй коробки с яблоками: " + secondAppleBox.getWeight());
        System.out.println("Коробка с яблоками и коробка с апельсинами равны? - "+ firstAppleBox.compare(firstOrangeBox));

        firstAppleBox.moveFruits(secondAppleBox);
        System.out.println();
        System.out.println("Вес первой коробки после пересыпания яблок: " + firstAppleBox.getWeight());
        System.out.println("Вес второй коробки после пересыпания яблок: " + secondAppleBox.getWeight());
    }
}

