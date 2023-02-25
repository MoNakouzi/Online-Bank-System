public class BankSystem
{
    public static void main(String[] args)
    {
        try
        {
            new BankFrame();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
