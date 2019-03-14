public class Account {
    public static final int WITHDRAW_TRANSACTION = 1;
    public static final int DEPOSIT_TRANSACTION = 2;

    private static final String MESSAGE_WITHDRAW_SUCCESSFUL = "Withdraw was successful, your new balance is ";
    private static final String MESSAGE_DEPOSIT_SUCCESSFUL = "Deposit was successful, your new balance is ";
    private static final String MESSAGE_TRANSACTION_UNSUCCESSFUL = "Error: No sufficient balance for withdrawal";
    private static final String MESSAGE_INVALID_NUMBER = "Error: The number you entered was invalid";
    private static final String MESSAGE_INVALID_TRANSACTION = "Error: The transaction you entered was invalid";

    private String accountNumber;
    private double balance;
    private Person owner;

    public Account() {
        this.accountNumber = "";
        this.balance = 0;
        this.owner = null;
    }

    public Account(String accountNumber, double balance, Person owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public Account(String name, String surname, String phone, String accountNumber, double balance) {
        this.owner = new Person(name,surname,phone);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getNumber() {
        return accountNumber;
    }

    public void setNumber(String number) {
        this.accountNumber = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance>0) {
            this.balance = balance;
        }else
        {
            this.balance = 0;
        }
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public boolean checkAccountNumber(){
        return accountNumber.matches("([0-9]){6}");
    }

    public String doTransaction(double amount, int transactionType){
        String transactionResult="";

        if (amount<=0){
            return MESSAGE_INVALID_NUMBER;
        }

        switch (transactionType){
            case WITHDRAW_TRANSACTION:
                if (balance-amount<0) {
                    return MESSAGE_TRANSACTION_UNSUCCESSFUL;
                }else{
                    balance -=amount;
                    transactionResult = MESSAGE_WITHDRAW_SUCCESSFUL + balance;
                }
                break;
            case DEPOSIT_TRANSACTION:
                balance += amount;
                transactionResult = MESSAGE_DEPOSIT_SUCCESSFUL + balance;
                break;

                default:
                    return MESSAGE_INVALID_TRANSACTION;
        }

        return  transactionResult;
    }

    public String toString(){
        return owner.toString() + ", account number:" + accountNumber + " balance:"+ balance;
    }
}
