package Classes;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    public Cat(boolean gender, int age, int color, String name){
        super.type = 2;
        super.gender = gender;
        super.age = age;
        super.color = color;
        super.name = name;
    }
    @Override
    public void activity(){
        if (gender){
            System.out.println("Meeow!!! I'm ready to kill mouses!!!");}
        else {
            System.out.println("Meeow!!! I'm ready to play!!!");}
    }
}
