package abstraction;

public abstract class Bank {

    public abstract void interest();
    public void rule(){
        System.out.println("Minimum 100 rs required");
    }

}


class SBI extends Bank {


    @Override
    public void interest() {
        System.out.println("Interest is 9%");
    }

    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.interest();
        sbi.rule();
    }
}

class HDFC extends  Bank{

    @Override
    public void interest() {
        System.out.println("Interest is 9%");
    }

    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.interest();
        hdfc.rule();
    }
}

class Kotak extends Bank{

    @Override
    public void interest() {
        System.out.println("Interest id 5%");
    }

    public static void main(String[] args) {
        Kotak kotak = new Kotak();
        kotak.interest();
    }
}