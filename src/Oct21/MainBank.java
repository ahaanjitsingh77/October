package Oct21;

public class MainBank {
    public static void main(String[] args) {
        BankOfCanada bankOfCanada = new PragraBank();
        bankOfCanada.primerate();
        System.out.println(" Bank of Canada " + bankOfCanada.rateOfInterest());
        BankOfCanada bankOfCanada1 = new Scotiabank();
        bankOfCanada.primerate();
        System.out.println(" Scotiabank " + bankOfCanada1.rateOfInterest());
        BankOfCanada bankOfCanada2 = new Bmo();
        bankOfCanada.primerate();
        System.out.println(" Bmo " + bankOfCanada2.rateOfInterest());
        BankOfCanada bankOfCanada3 = new Td();
        bankOfCanada.primerate();
        System.out.println(" Td " + bankOfCanada3.rateOfInterest());
        BankOfCanada bankOfCanada4 = new PragraBank();
        bankOfCanada.primerate();
        System.out.println(" pragrabank " + bankOfCanada4.rateOfInterest());
    }
}
