import Classes.Animal;
import Classes.Cat;
import Classes.Cow;
import Classes.Wolf;

import java.io.Serializable;
import java.util.ArrayList;

public class Models <T extends Animal> implements Serializable {
    Village village;
    Models(Village village1){
        this.village = village1;
    }
    public void createVillage() {
        village.maxId = 0;
        Animal wolf = new Wolf(true,10,2,"Акелла");
        Animal cat = new Cat(true,4,1,"Васька");
        Animal cow = new Cow(false,7,3,"Зорька");
        Animal wolf1 = new Wolf(false,9,1,"Ирма");
        Animal cat1 = new Cat(false,3,0,"Мурка");
        Animal cow1 = new Cow(true,6,3,"Гвидон");
        village.add(wolf);
        village.add(cat);
        village.add(cow);
        village.add(wolf1);
        village.add(cat1);
        village.add(cow1);
    }
    public T getAnimalFromId(int id) {
        for (Object item1:village) {
            T item = (T) item1;
            if (item.getId()==id){return item;}
        }
        return null;
    }
    public void add(T item){
        village.maxId++;
        item.setId(village.maxId);
        village.animals.add(item);
    }
    public boolean checkHasId(int id){
        T animal;
        boolean flag = false;
        for (Object item:village) {
            animal = (T) item;
            if (animal.getId()==id){flag = true;}
        }
        return flag;
    }
    public T removeFromId(int id) {
        int index = -1;
        T retAnimal = (T) village.animals.get(0);
        if (checkHasId(id)) {
            ArrayList<T> newAnimals = new ArrayList<T>();

            for (int i = 0; i < village.animals.size(); i++) {
                T animal = (T) village.animals.get(i);
                if (animal.getId()!=id)
                    {newAnimals.add((T) village.animals.get(i));}
                else {
                    index = i;
                    if (i!=village.animals.size()-1)
                        {newAnimals.add((T) village.animals.get(++i));}}
            }
            retAnimal = (T) village.animals.get(index);
            village.animals.clear();
            for (T item:newAnimals) {village.animals.add(item);}
        }
        else {return null;}
        return retAnimal;
    }
    public void printList(ArrayList<String[]> types, ArrayList<String[]> colors){
        for (Object item:village) {
            Animal animal = (Animal) item;
            System.out.println(animal.myString(types,colors));
            animal.activity();System.out.println();
        }
    }
}
