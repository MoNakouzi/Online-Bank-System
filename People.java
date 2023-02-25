public class People
{
    // This class is the parent class for all the following classes:
    // 1- Client with account (includes recipients) (CA)
    // 2- Admin (AD)
    // 3- Maintenance Team (MT)
    // 4- Customer Service Representative (CSR)

    String firstName;
    String lastName;
    String email;
    String phoneNum;
    int id;

    public People(String firstName, String lastName, String email, String phoneNum, int id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.id = id;
    }

    // Getter and setter for email
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    // Getter and setter for phoneNum
    public String getPhoneNum()
    {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }

    // Getter for remaining variables
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getId()
    {
        return id;
    }
}
