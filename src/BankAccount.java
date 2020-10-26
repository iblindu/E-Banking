import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
    private User accountOwner;
    private String accountNumber;
    private String cardNumber;
    private Date cardExpiryDate;
    private String CVV;
    private int balance;

    public BankAccount(User accountOwner, String accountNumber, String cardNumber, Date cardExpiryDate,
                       String CVV, int balance, ArrayList<Transaction> transactions)
    {
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.cardNumber = cardNumber;
        this.cardExpiryDate = cardExpiryDate;
        this.CVV = CVV;
        this.balance = balance;
    }

    public User getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(User accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(Date cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}