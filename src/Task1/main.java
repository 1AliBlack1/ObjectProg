package Task1;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat(); //экземпляр класса
        cat.setName("barsic");
        System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("chumka"),"Peter", LocalDate.of(3,12, 21));
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        dog.getIllness().heall();
        //dog.toWakeUp("13:00");
        ArrayList<Animals> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        dog.liveCycle();
    }
}
