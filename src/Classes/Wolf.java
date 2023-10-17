package Classes;

import java.io.Serializable;

public class Wolf extends Animal implements Serializable {
    public Wolf(boolean gender, int age, int color, String name){
        super.type = 1;
        super.gender = gender;
        super.age = age;
        super.color = color;
        super.name = name;
    }
    @Override
    public void activity(){
        if (gender) {
            System.out.println("Wooow!!! I'm ready to hunt!!!");}
        else {
            System.out.println("Wooow!!! I'm ready to learn my childrens!!!");
        }
    }

}
