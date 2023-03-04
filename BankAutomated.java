import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class BankAutomated extends JPanel implements Runnable
{

    Thread bankThread;
    static final int PANEL_WIDTH = 1200;
    static final int PANEL_HEIGHT = 650;
    static final Dimension SCREEN_SIZE = new Dimension(PANEL_WIDTH, PANEL_HEIGHT);

    public BankAutomated()
    {
        this.setFocusable(true);
        this.addKeyListener(new AL());
        this.addMouseListener(new ML());
        this.addMouseMotionListener(new ML());


        this.setPreferredSize(SCREEN_SIZE);
        this.setMinimumSize(new Dimension(BankAutomated.PANEL_WIDTH, BankAutomated.PANEL_HEIGHT));
        this.setMaximumSize(new Dimension(BankAutomated.PANEL_WIDTH, BankAutomated.PANEL_HEIGHT));

        bankThread = new Thread(this);
        bankThread.start();
    }

    @Override
    public void run()
    {

    }

    // This allows a CA to log in to the system, and authenticates this user
    public void login(String email, String password)
    {

    }

    // This allows a new client to register for an account by inputting their details
    public void createAccount(String firstName, String lastName, String email, String phoneNum, int id,
                              String address, int cardNum) throws FileNotFoundException, IOException
    {
        CA customerAccount = new CA(firstName, lastName, email, phoneNum, id, address);
        customerAccount.generateCard();

    }

    // Allows customers to create a report about any suspicious activity, one for customers without
    // accounts, and one for logged in customers
    public void makeReport(String customerFName, String customerLName, String email)
    {

    }
    public void makeReport(CA customer)
    {

    }

    // Depending on request type, this gets the correct receiver and adds the customer request to their
    // correct argument (Request arraylist)
    public void makeRequest(String type)
    {

    }

    // Allow users to transfer between chequing and savings accounts
    public void transferFunds(int transferAmount, String fromAccount, String toAccount)
    {

    }

    // Allow users to etransfer from their account to another user with using the receiver's email
    public void etransfer(int amount, String receiverEmail)
    {

    }

    // Allow users to make a bank transfer from their account to another user using the receiver's
    // bank account number
    public void bankTransfer(int amount, String receiverAcc)
    {

    }

    // Change the customer's details in the settings tab. Customers can change their address, email,
    // and phone number
    public void changeSettings(CA customer)
    {

    }

    public class AL extends KeyAdapter
    {

    }

    public class ML extends MouseAdapter
    {

    }
}
