public class BankTest {

    public static void main(String[] args) {
       Bank myBank = new Bank("Citi Bank");
       System.out.println(myBank.bankName);

        Bank acc= new Bank("TD Bank", 2000825323);
        System.out.println("Bank name:" + acc.getBankName() + ", " + "Account Number: " + acc.getAccNo());

    }
}
