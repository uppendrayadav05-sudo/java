abstract class Bank {
    abstract void moneyBalance();
}

class SBI extends Bank {
    void moneyBalance() {
        System.out.println("SBI Bank Balance: 50000");
    }
}

class Abstraction1{
    public static void main(String[] args) {
        SBI obj = new SBI();
        obj.moneyBalance();
    }
}