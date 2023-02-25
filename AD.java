import java.util.ArrayList;

public class AD extends People
{
    ArrayList<Report> customerReports;
    ArrayList<Request> meetingRequests;

    public AD(String firstName, String lastName, String email, String phoneNum, int id,
              ArrayList<Report> customerReports, ArrayList<Request> meetingRequests)
    {
        super(firstName, lastName, email, phoneNum, id);
        this.customerReports = customerReports;
        this.meetingRequests = meetingRequests;
    }

    public ArrayList<Report> getCustomerReports()
    {
        return customerReports;
    }
    public void addCustomerReports(Report report)
    {
        this.customerReports.add(report);
    }

    public ArrayList<Request> getMeetingRequests()
    {
        return meetingRequests;
    }
    public void addMeetingRequests(Request meetingRequest)
    {
        this.meetingRequests.add(meetingRequest);
    }
}
