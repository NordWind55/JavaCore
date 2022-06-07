package lesson3;

import java.util.ArrayList;

public class Box<T>{
    ArrayList<T> myFruits = new ArrayList();
    private float weight = 0.0f;

    public <T> Box(float weight) {
        this.weight= weight;
    }

    public float getWeight(){
        return myFruits.size() * weight;
    }

    //Сравнение
    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }

    //Добавление фруктов
    public void addFruits(T fruit) {
        myFruits.add(fruit);
    }
    //Перемещение фруктов
    public void moveFruits(Box<T> box){
        myFruits.addAll(box.myFruits);
        box.myFruits.clear();
    }
}

