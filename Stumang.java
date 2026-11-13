
import java.util.TreeSet;

class Stumang{
    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<>();

        // Store marks
        marks.add(75);
        marks.add(90);
        marks.add(65);
        marks.add(85);
        marks.add(95);
        marks.add(75);
        marks.add(80);

        // Display all marks
        System.out.println("Marks: " + marks);

        // Display the lowest mark
        System.out.println("Lowest mark: " + marks.first());

        // Display the highest mark
        System.out.println("Highest mark: " + marks.last());

        // Remove mark 65
        marks.remove(65);
        System.out.println("Marks after removing 65: " + marks);

        // Check whether mark 90 exists
        System.out.println("Is 90 present? " + marks.contains(90));

        // Display the number of unique marks
        System.out.println("Number of unique marks: " + marks.size());
    }
}
