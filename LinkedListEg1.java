import java.util.LinkedList;

public class LinkedListEg1{
    public static void main (String[] args){

        // creating a LinkedList
        LinkedList<String> names=new LinkedList<>();

        //Adding elements
        names.add("john");
        names.add("Alice");
        names.add("David");
        names.add("Robert");
        //Displaying the list
        System.out.println("LinkedList:"+names);
        //Accesing an element
        System.out.println("First Element:" +names.get(0));
        //Updating an element
        names.set(1,"peter");
        //Removing an element
        names.remove("David");
        //Upadting an element
        names.set(1,"peter");
        //Removing an element
        names.remove("David");
        //Ading element  at first position
        names.addFirst("Sam");
        //Adding element at last position
        names.addLast("Tom");
        //Size of LinkedList
        System.out.println("Size:" +names.size());
    }
}