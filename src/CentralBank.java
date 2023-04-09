public class CentralBank {

    int getInterrestRate(){
        return 0;

    }
}
class BOC extends CentralBank{
    @Override
    int getInterrestRate() {
        return 8;

    }
}
class PeoplesBank extends CentralBank{
    @Override
    int getInterrestRate() {
        return 10;

    }
}
class CommercialBank extends CentralBank{
    @Override
    int getInterrestRate() {
        return 12;

    }
}
class TestOverriding {
    public static void main(String[] args) {
        BOC b = new BOC();
        PeoplesBank p = new PeoplesBank();
        CommercialBank c = new CommercialBank();
        System.out.println("Interest Rate:- " + b.getInterrestRate() + "%");
        System.out.println("Interest Rate:- " + p.getInterrestRate() + "%");
        System.out.println("Interest Rate:- " + c.getInterrestRate() + "%");
    }
}