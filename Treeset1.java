import java.util.TreeSet;

class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        
        // Adding elements (duplicates are ignored and elements are auto-sorted)
        names.add("john");
        names.add("Alice");
        names.add("David");
        names.add("Robert");
        names.add("john");
        
        System.out.println("TreeSet: " + names);
        
        // Removing an element
        names.remove("David");
        
        // Checking set properties
        System.out.println("Contain Alice: " + names.contains("Alice"));
        System.out.println("Size: " + names.size());
        System.out.println("Is Empty: " + names.isEmpty());
    }
}
