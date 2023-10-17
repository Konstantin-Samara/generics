package Classes;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Animal implements Serializable {
    int id;

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    int type;

    public int getType(){
        return this.type;
    }
    boolean gender;
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public boolean getGender(){
        return this.gender;
    }
    String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    int age;
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    int color;
    public void setColor(int color) {
        this.color = color;
    }
    public int getColor(){
        return this.color;
    }
    public void activity(){}
    public String myString(ArrayList<String[]> types, ArrayList<String[]> colors){
        String genderStr="";
        if (gender){genderStr = "Муж.";}
        else {genderStr = "Жен.";}
        String t = types.get(this.getType()) [this.getGender() ? 1:0];
        String c = colors.get(this.getColor()) [this.getGender() ? 1:0];
        return "ID : "+id+"; Животное : "+t+"; Возраст (лет) : "+age+"; Пол : "+genderStr+
                "; Цвет : "+c+"; Имя : "+name+"; Класс : "+this.getClass().getName();
    }

}
