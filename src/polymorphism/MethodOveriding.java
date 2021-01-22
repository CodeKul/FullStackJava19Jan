package polymorphism;

public class MethodOveriding {

    public static void main(String[] args) {

        SBI sbi = new SBI();
        sbi.interest(1);
        ICICI icici = new ICICI();
        icici.interest();
        BOI boi =new BOI();
        boi.interest();
    }
}
class Bank{

    public void interest(int i){
        System.out.println("default interest is 10");
    }
}

class SBI extends Bank{

    public void interest(){
        System.out.println("interest is 20");
    }
}

class ICICI extends  Bank{
    public void interest(){
        System.out.println("interest is 30");
    }
}


class BOI extends Bank{
    public void interest(){
        System.out.println("interest is 40");
    }
}