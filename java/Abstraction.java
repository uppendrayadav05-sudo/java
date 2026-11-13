abstract class parent{
    abstract void loan();
    void printing(){
        System.out.println("Welcome to RBI");
    }
}
class Child extends parent{
    void loan(){
        System.out.println("loan Accepted!!");
    }
}
class Abstraction{
    public static void main (String[] args){
        Child ch=new Child();
        ch.loan();
        ch.printing();
    }
}
