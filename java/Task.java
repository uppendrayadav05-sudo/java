class Laptop{
    String company="Hp";
    String ramsize="8";
    String price="10000";
    void bootup(){
        System.out.println("laptop is starting");
    }
}
class Task{
    public static void main(String[] args){
        Laptop mylaptop=new Laptop();
        System.out.println(mylaptop.company);
        System.out.println(mylaptop.ramsize);
        System.out.println(mylaptop.price);
        mylaptop.bootup();
    }
}
    




    