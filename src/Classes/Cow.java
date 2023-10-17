package Classes;

import java.io.Serializable;

public class Cow extends Animal implements Serializable {
    public Cow(boolean gender, int age, int color, String name){
        super.type = 0;
        super.gender = gender;
        super.age = age;
        super.color = color;
        super.name = name;
    }
    @Override
    public void activity(){
        if (!gender) {
            System.out.println("Muuuu!!! I'm ready to give milk!!!");}
        else{
            System.out.println("Muuuu!!! I'm ready to love my beauty cow!!!");}

    }
    }


