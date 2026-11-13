class RBI{
    void rules(){
        System.out.println("RBI Rules");
    }
 }   
 class SBI extends RBI{
    SBI(){
        System.out.println("SBI Bank");
    }
}
class HDFC extends SBI{
    HDFC(){
        System.out.println("HDFC Bank");
    }
}
class Bank1{
    public static void main(String[] args){
        HDFC obj=new HDFC();
        obj.rules();
     }
}

