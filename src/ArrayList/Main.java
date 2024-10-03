package ArrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    record GroceryItem(String name,String type, int count){
        public GroceryItem(String name) {
            this(name,"DAIRY",1);
        }

        @Override
        public String toString() {
           return String.format("%d %s in %s",count, name.toUpperCase(),type);
        }
    }

    public static void main(String[] args) {
        String[] items = {"Apple","Banan","Oranges","Pineapple"};
        List<String> list = List.of(items);


        ArrayList<String> arrayList = new ArrayList<>(list);

        System.out.println(arrayList);
        arrayList.retainAll(List.of("Oranges","Banan"));
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
        if (arrayList.isEmpty()){
            System.out.println("Array is empty");
        }
    }


}
