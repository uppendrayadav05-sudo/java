class Dog{
    String color="Red";
    String height="2.3";
    String weight="23";
}
class Terminal{
    public static void main (String[] args){
        Dog dog=new Dog();
        System.out.println(dog.color);
        System .out.println(dog.height);
        System.out.println(dog.weight);
    }
}
