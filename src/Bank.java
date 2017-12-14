public class Bank {
    long AccNo;
    String bankName;


    //Defult constructor
    public Bank() {}

    public Bank (String bankName){
      System.out.println("1st constructor starting here...");
        this.bankName = bankName;
    }

    public Bank (String bankName, long AccNo){
        System.out.println("2nd constructor strating here...");
        this.bankName = bankName;
        this.AccNo = AccNo;
    }

    //Methods
    public void setAccNo(long accNo) {
        this.AccNo = accNo;
    }
    public long getAccNo() {
        return AccNo;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBankName() {
        return bankName;
    }

}

