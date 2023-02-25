public class Request
{
    String type;
    MT mt;
    AD admin;
    CSR csr;

    // Three types of request:

    // 1- Request system changes (RSC) from Maintenance Team (MT)
    public Request(String type, MT mt)
    {
        this.type = type;
        this.mt = mt;
    }

    // 2- Request a meeting (RM) from Admin (AD)
    public Request(String type, AD admin)
    {
        this.type = type;
        this.admin = admin;
    }

    // 3- Request assistance (RA) to Customer Service Representative (CSR)
    public Request(String type, CSR csr)
    {
        this.type = type;
        this.csr = csr;
    }

    //Getter and setter for type of request
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
}

