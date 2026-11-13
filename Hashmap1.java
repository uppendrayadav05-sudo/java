import java.util.HashMap;

public class Hashmap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "john");
        students.put(102, "Alice");
        students.put(103, "David");
        students.put(104, "Robert");

        System.out.println("HashMap: " + students);
        System.out.println("Student 101: " + students.get(101));

        // Updates the value for existing key 102
        students.put(102, "petter");
        
        // Removes the entry with key 103
        students.remove(103);

        System.out.println("Contains key 101: " + students.containsKey(101));
        System.out.println("Contains value 'john': " + students.containsValue("john"));
        System.out.println("Size: " + students.size());
    }
}

