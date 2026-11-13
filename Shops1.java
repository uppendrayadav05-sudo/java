
import java.util.HashSet;

class Shops1 {
    public static void main(String[] args) {

        HashSet<String> Shopping = new HashSet<>();

        Shopping.add("Laptop");
        Shopping.add("Mobile");
        Shopping.add("Headphones");

        System.out.println("HashSet: " + Shopping);

        Shopping.remove("Headphones");
        Shopping.add("Tablet pc");

        System.out.println("Contains Mobile: " + Shopping.contains("Mobile"));
        System.out.println("Size: " + Shopping.size());
        System.out.println("Is Empty: " + Shopping.isEmpty());
        System.out.println("HashSet: " + Shopping);
    }
}
