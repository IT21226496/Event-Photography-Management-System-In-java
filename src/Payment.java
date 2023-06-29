import java.util.Date;

public class Payment{
    private String cardNumber;
    private String cardType;
    private String cardName;
    private Date expire;
    private int cvv;

    public Payment(String cardNumber, String cardType, String cardName, Date expire, int cvv) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.cardName = cardName;
        this.expire = expire;
        this.cvv = cvv;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    public String getCardType()
    {
        return cardType;
    }

    public void setCardType(String cardType)
    {
        this.cardType = cardType;
    }

    public String getCardName()
    {
        return cardName;
    }

    public void setCardName(String cardName)
    {
        this.cardName = cardName;
    }

    public Date getExpire()
    {
        return expire;
    }

    public void setExpire(Date expire)
    {
        this.expire = expire;
    }

    public int getCvv()
    {
        return cvv;
    }

    public void setCvv(int cvv)
    {
        this.cvv = cvv;
    }

    public void payment()
    {
        // Placeholder code for payment processing
        System.out.println("Payment processed successfully!");
    }

    public void displayPaymentDetails()
    {
        System.out.println("Card Number: " + this.cardNumber);
        System.out.println("Card Type: " + this.cardType);
        System.out.println("Card Name: " + this.cardName);
        System.out.println("Expiration Date: " + this.expire);
        System.out.println("CVV: " + this.cvv);
    }
}