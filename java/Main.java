class Main{
    public static void main(String[] args){
        int a =10;
        int b = 20;
        int c = 30;
        if(a>b && a>c){
        System.out.println("A is big");
        }
        if(a<b && a<c){
        System.out.println("A is small");
        }
        if (b>a && b>c){
        System.out.println("B is big");
        }
        if(b<a && b<c){
        System.out.println("B is small");
        }
        if(c>a && c>b){
        System.out.println("C is big");
        }
        if(c<a && c<b){
        System.out.println("C is small");
        }
    }
}