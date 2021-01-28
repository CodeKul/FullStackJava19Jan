package interface_demo;

class SBI implements Bankinterface,BankRule{

    @Override
    public void interest() {
        System.out.println("Interest is 10%");
    }

    @Override
    public void rule() {

    }
}

public interface Bankinterface {

    public void interest();
}

interface  BankRule{

    public void rule();

}