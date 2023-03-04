import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Random;

// customer account
public class CA extends People
{
    String address;
    String cardNum;
    int chequing;
    int savings;
    ArrayList<Transaction> chequingHist;
    ArrayList<Transaction> savingsHist;
    ArrayList<Report> reportSus;
    ArrayList<Request> requests;


    public CA(String firstName, String lastName, String email, String phoneNum, int id, String address)
    {
        super(firstName, lastName, email, phoneNum, id);
        this.address = address;
    }

    public void generateCard()
    {
        Random random = new Random();
        
        // Generate the first 11 digits of the new credit card number
        StringBuilder stringObject = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            stringObject.append(random.nextInt(10));
        }
        
        // Calculate the check digit using the Luhn algorithm
        int checkDigit = calculateCheckDigit(stringObject.toString());
        
        // Append the check digit to the credit card number
        stringObject.append(checkDigit);
        
        cardNum = stringObject.toString();
    }
    
    // Luhn algorithm
    private static int calculateCheckDigit(String cardNumber) {
        int sum = 0;
        boolean alternate = false;
        
        // Generate 12 unique DIGITS
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
            alternate = !alternate;
        }
        int mod = sum % 10;
        return mod == 0 ? 0 : 10 - mod;
    }

    // Setter and getter for address
    public String getAddress()
    {
        return this.address;
    }
    public void setAddress(String Address)
    {
        this.address = Address;
    }

    // Getter for card number, chequing funds, and savings funds
    public String getCardNum()
    {
        return cardNum;
    }
    public int getChequing()
    {
        return chequing;
    }
    public int getSavings()
    {
        return savings;
    }

    // Getter and setter for chequing transaction history
    public ArrayList<Transaction> getChequingHist()
    {
        return chequingHist;
    }
    public void addChequing(Transaction chequingTransaction)
    {
        this.chequingHist.add(chequingTransaction);
    }

    // Getter and setter for savings transaction history
    public ArrayList<Transaction> getSavingsHist()
    {
        return savingsHist;
    }
    public void addSaving(Transaction savingTransaction)
    {
        this.savingsHist.add(savingTransaction);
    }

    // Getter and setter for suspicious activity reports
    public ArrayList<Report> getReportSus()
    {
        return reportSus;
    }
    public void addReport(Report suspiciousReport)
    {
        this.reportSus.add(suspiciousReport);
    }

    // Getter and setter for request history
    public ArrayList<Request> getRequests()
    {
        return requests;
    }
    public void addRequests(Request request)
    {
        this.requests.add(request);
    }
}
