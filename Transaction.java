public class Transaction
{
    String sender;
    String receiver;
    int amount;

    public Transaction(String sender, String receiver, int amount)
    {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    //Getter for sender, receiver, and amount
    public String getSender()
    {
        return sender;
    }
    public String getReceiver()
    {
        return receiver;
    }
    public int getAmount()
    {
        return amount;
    }
}
