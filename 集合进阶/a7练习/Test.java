package 集合进阶.a7练习;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
    }
    public static void keepPet (ArrayList<? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
