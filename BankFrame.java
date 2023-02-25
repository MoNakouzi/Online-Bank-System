import javax.swing.*;
import java.awt.*;

public class BankFrame extends JFrame
{
    BankAutomated panel;

    public BankFrame()
    {
        panel = new BankAutomated();
        this.setTitle("Bank of Computer Science (BCS)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setBackground(Color.white);
        this.getContentPane().setBackground(Color.white);

        this.setResizable(true);
        this.setLayout(new GridBagLayout());
        this.add(panel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
