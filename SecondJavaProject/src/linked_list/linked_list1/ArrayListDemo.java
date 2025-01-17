package linked_list.linked_list1;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1.size());
        list1.add(15);
        list1.add(5);
        list1.add(10);
        list1.add(1,1);
        System.out.println(list1.get(1));
        System.out.println(list1.size());
        System.out.println(list1.get(2));
        for (int i=0; i<list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        //list1.remove(0);
        list1.set(0,100);
//        for (int i=0; i<list1.size(); i++) {
//            System.out.print(list1.get(i) + " ");
//        }
        for (int elem : list1) {
            System.out.print(elem + " ");
        }
    }
}
