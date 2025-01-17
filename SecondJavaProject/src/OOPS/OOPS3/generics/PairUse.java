package OOPS.OOPS3.generics;

public class PairUse {
    public static void main(String[] args) {
        Pair<String, String> p = new Pair<String,String>("a" ,"b");
        p.setFirst("Rajesh");
        System.out.println(p.getFirst());

//        Pair<int> p1 = new Pair<int>(1,2); // cant work because we can create obj only by the subclasses(actual obj)
        Pair<Integer, String> p1 = new Pair<Integer, String>(1,"temp"); // Integer(class) is same as int(primitive data type)
        p1.setSecond("Raj");
        System.out.println(p1.getSecond());

        // Every primitive data type have their superficial class
        // int -> Integer
        // char -> Character
        // boolean -> Boolean

        Pair<Character, Character> p2 = new Pair<>('a', 'b');

        int a = 10;
        int b = 20;
        int c = 30;
        Pair<Integer, Integer> internal = new Pair<>(a, b);
        Pair<Pair<Integer, Integer>, Integer> p3 = new Pair<>(internal, c);
        System.out.println(p3.getSecond()); // c = 30
        System.out.println(p3.getFirst().getSecond()); // b = 20
    }
}
