import Classes.Animal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Village<T extends Animal> implements Iterable<T>, Serializable {
    ArrayList<T> animals = new ArrayList<T>();
    int maxId;
    Models models = new Models(this);

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>();
    }
    public void createVillage(){models.createVillage();}
    public T getAnimalFromId(int id) {return (T) models.getAnimalFromId(id);}
    public void add(T item){models.add(item);}
    public T removeFromId(int id){return (T) models.removeFromId(id);}
    public void printList(ArrayList<String[]> types, ArrayList<String[]> colors){
        models.printList(types,colors);
    }

    class MyIterator<T> implements Iterator<T>{
    int index = 0;
    @Override
    public boolean hasNext() {

        return (animals.size()>index);
    }

    @Override
    public T next() {
        if (hasNext()){
            return (T) animals.get(index++);
        }
        return null;
    }
}
}
