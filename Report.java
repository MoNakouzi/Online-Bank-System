public class Report
{
    String firstName;
    String lastName;
    String email;
    int cardNum;

    public Report(String firstName, String lastName, String email, int cardNum)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cardNum = cardNum;
    }

    //Getter and setter for firstName
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String fName)
    {
        this.firstName = fName;
    }

    //Getter and setter for lastName
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lName)
    {
        this.lastName = lName;
    }

    //Getter and setter for email
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    //Getter for cardNum
    public int getCardNum()
    {
        return cardNum;
    }
}
