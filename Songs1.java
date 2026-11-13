import java.util.LinkedList;

class Songs1{
    public static void main (String[] args){
        LinkedList<String> song=new LinkedList<>();
        song.add("a");
        song.add("b");
        song.add("c");
        song.add("d");
        System.out.println("LinkedList:"+ song);
        System.out.println("First element:"+song.get(0));
        song.set(1,"e");
        song.remove("c");
        song.addFirst("g");
        song.addLast("f");
        System.out.println("Updated LinkedList:"+ Song);
        System.out.println("Size:"+song.size());
    }
}