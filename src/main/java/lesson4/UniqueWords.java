package lesson4;

import java.util.HashMap;
import java.util.Map;

public class UniqueWords {
    private String[] numbers;

    public UniqueWords(String[] numbers){
        this.numbers = numbers;
    }

    public void getUniqueWords(){
        Map<String, Integer> num = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (num.containsKey(numbers[i]))
                num.put(numbers[i], num.get(numbers[i]) + 1);
            else
                num.put(numbers[i], 1);
        }
        System.out.println(num);
    }
}