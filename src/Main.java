import Classes.Cow;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//    Village village = new Village();
//    village.createVillage();

    /* Загружаем данные из трех файлов, имитируем структуру реляционной БД */
    Village village = (Village) WriteRead.read("./src/Data/village.out");
    ArrayList<String[]> colors = (ArrayList<String[]>) WriteRead.read("./src/Data/colors.out");
    ArrayList<String[]> types = (ArrayList<String[]>) WriteRead.read("./src/Data/types.out");

    /* Выводим полный список животных с указанием всех характеристик, класса, демонстрацией активностей */
    System.out.println("\n---------- Полный список, загруженный из 3-х файлов -------------\n");
    village.printList(types,colors);

    /* Выводим животное, возвращенное методом удаления */
    int n=3;
    System.out.println("\n---------- удалим животное с ID : "+n+" -------------\n");
    System.out.println(village.removeFromId(n).myString(types,colors));

    /* Выводим список животных, после удаления */
    System.out.println("\n---------- Список после удаления животного с ID : "+n+" -------------\n");
    village.printList(types,colors);

    /* Добавляем двух новых коров, вместо удаленной и выводим обновленный список */
    Cow cow1 = new Cow(false,6,0,"Белка");
    Cow cow2 = new Cow(false,5,1,"Ночка");
    village.add(cow1);
    village.add(cow2);
    System.out.println("\n---------- Список после добавления двух коров помоложе -------------\n");
    village.printList(types,colors);
    }
}