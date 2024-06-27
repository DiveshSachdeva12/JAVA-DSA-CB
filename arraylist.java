import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());

        list.add(20);
        System.out.println(list);
        System.out.println(list.size());

        list.add(30);
        System.out.println(list);
        System.out.println(list.size());

        list.add(40);
        System.out.println(list);
        System.out.println(list.size());
        
        
        
        // for accessing element in the list uset .get method
        // System.out.println(list.get(3));
        System.out.println(list.remove(2));
        System.out.println(list);


    }
}
