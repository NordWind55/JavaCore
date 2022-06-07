package lesson4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String[] numbersArr = {"one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "one", "five", "six"};

        UniqueWords unique = new UniqueWords(numbersArr);
        unique.getUniqueWords();

        System.out.println("-----------------");

        System.out.println("Задание 2");
        PhoneDirectory myDirectory = new PhoneDirectory();
        myDirectory.add("Иванов", "8922762321");
        myDirectory.add("Петров", "8922762322");
        myDirectory.add("Сидоров", "8922762323");
        myDirectory.add("Григорьев", "8922762324");
        myDirectory.add("Иванов", "8922762325");
        myDirectory.add("Смирнов", "8922762326");

        System.out.println(myDirectory.get("Петров"));
        System.out.println(myDirectory.get("Иванов"));
    }
}
