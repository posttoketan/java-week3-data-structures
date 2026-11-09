import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Ketan");
        students.add("Aman");
        students.add("Rahul");

        System.out.println("Original Linked List: " + students);

        students.addFirst("Adarsh");
        students.addLast("Rohit");

        System.out.println("After Adding Elements: " + students);

        students.removeFirst();

        System.out.println("After Removing First Element: " + students);
    }
}
