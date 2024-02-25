import java.util.*;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        Queue<Integer> l3 = new ArrayDeque<>();

        System.out.println(getLength(l1));
    }

    public static int getLength(Collection<?> list) {
        return list.size();
    }

//    public static int getLength(ArrayList<?> list) {
//        return list.size();
//    }
//
//    public static int getLength(LinkedList<?> list) { // Нарушается Open-Closed Principle
//        return list.size();
//    }
}
