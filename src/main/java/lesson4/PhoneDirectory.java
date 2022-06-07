package lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory{
    private Map<String, List<String>> phoneDirectory=new HashMap<>();
    private List<String> number;

    public void add(String name, String phoneNumber){
        if( phoneDirectory.containsKey(name)){
            number = phoneDirectory.get(name);
            number.add(phoneNumber);
            phoneDirectory.put(name, number);
        } else{
            number=new ArrayList<>();
            number.add(phoneNumber);
            phoneDirectory.put(name, number);
        }
    }

    public List<String>get(String surname){
        return phoneDirectory.get(surname);
    }
}
