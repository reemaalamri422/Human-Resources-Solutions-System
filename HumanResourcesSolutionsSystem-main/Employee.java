import java.util.*;

public class Employee
{
  private String id;
  private String jobTitle;
  private String contractDate;
  private String startTime;
  private String endTime;
  private boolean hired;
  private int frequency, totalEmployees;
  
  public void Employee()
  {
    id = " ";
    jobTitle = " ";
    contractDate = " ";
    startTime = " ";
    endTime = " ";
    hired = true;
    frequency = 0;
  }
  
  public void Employee(String id, String jobTitle, String contractDate, String startTime, String endTime, boolean hired, int frequency)
  {
    this.id = id;
    this.jobTitle = jobTitle;
    this.contractDate = contractDate;
    this.startTime = startTime;
    this.endTime = endTime;
    this.hired = hired;
    this.frequency = frequency;
  }
  
  public void Employee(String contractDate, String startTime, String endTime)
  {
   this.contractDate = contractDate;
   this.startTime = startTime;
   this.endTime = endTime;
  }
  
  public void setEmployee()
  {
    contractDate = "N/A";
    startTime = "N/A";
    endTime = "N/A";
  }
   
  public int calculateDuration()
  {
    int duration;
    int postion = startTime.indexOf(':');
    String startHours = startTime.substring(0,postion);
    int startHour = Integer.parseInt(startHours);
    
    postion = endTime.indexOf(':');
    String endHours = endTime.substring(0,postion);
    int endHour = Integer.parseInt(endHours);
    
    duration = endHour - startHour;
    
    return duration;
  }
  
  public void updateFrequency()
  {
    frequency++;
  }
  
  public void displayInfo()
  {
  System.out.printf("|%-12s|%15s|%10s|%10s|%8s|%-5s|%-9d|",id,jobTitle,contractDate,startTime,endTime,(hired ? "Yes":"No"),frequency);
  }
  
  public String getId()
  {
    return id;
  }
  public void setId(String id)
  {
    this.id=id;
  }
   
  public String getJobtitle()
  {
  return jobTitle;
  }
   public void setJobtitle(String jobTitle)
  {
  this.jobTitle=jobTitle ;
  }
  
  public int getFrequecy()
  {
  return frequency;
  }
  
  public String getContracData()
  {
  return contractDate;
  }
   public void setContracData()
  {
  this.contractDate=contractDate;
  }
  
  
  public boolean getHired()
  {
  return hired;
  }
  
  public void setHired(boolean hired)
  {
   this.hired = hired;
  }
  public void setFrequency(int frequency) 
  {
  this.frequency= frequency;
  }
  
  
  
}