import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class CA extends People
{
    String address;
    int cardNum;
    int chequing;
    int savings;
    ArrayList<Transaction> chequingHist;
    ArrayList<Transaction> savingsHist;
    ArrayList<Report> reportSus;
    ArrayList<Request> requests;


    public CA(String firstName, String lastName, String email, String phoneNum, int id, String address,
              int cardNum, int chequing, int savings, ArrayList<Transaction> chequingHist,
              ArrayList<Transaction> savingsHist, ArrayList<Report> reportSus, ArrayList<Request> requests)
    {
        super(firstName, lastName, email, phoneNum, id);
        this.address = address;
        this.cardNum = cardNum;
        this.chequing = chequing;
        this.savings = savings;
        this.chequingHist = chequingHist;
        this.savingsHist = savingsHist;
        this.reportSus = reportSus;
        this.requests = requests;
    }

    // Setter and getter for address
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String Address)
    {
        this.address = address;
    }

    // Getter for card number, chequing funds, and savings funds
    public int getCardNum()
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
