import java.util.*;

public class TestEmployeee1
{
  static Scanner input = new Scanner(System.in);
  static boolean hired = false;
  static int option;
  static int frequency, counter, location;
  static String employeeId, idNumber, job, date, start, end;
  static Employee[] hiringEmployees = new Employee[100];
  static int numOfEmployees;
  public static void main(String[]args)
  {
    //Employee's already registered in system
    hiringEmployees[0] = new Employee();
    hiringEmployees[0].Employee("9876543222", "Driver", "15/12/2020", "16:00", "22:00", true, 1);
    hiringEmployees[1] = new Employee();
    hiringEmployees[1].Employee("9876543211", "Cleaning Worker", "15/12/2020", "08:00", "16:00", true, 4);
    hiringEmployees[2] = new Employee();
    hiringEmployees[2].Employee("1234567899", "Cleaning Worker", "N/A", "N/A", "N/A", false, 0);
    hiringEmployees[3] = new Employee();
    hiringEmployees[3].Employee("2234567891", "Cleaning Worker", "17/12/2020", "08:00", "13:00", true, 2);
    hiringEmployees[4] = new Employee();
    hiringEmployees[4].Employee("1334567892", "Driver", "11/12/2020", "10:00", "15:00", true, 1);
    hiringEmployees[5] = new Employee();
    hiringEmployees[5].Employee("4412356789", "Cleaning Worker", "05/12/2020", "12:00", "15:00", true, 10);
    hiringEmployees[6] = new Employee();
    hiringEmployees[6].Employee("3114567894", "Driver", "N/A", "N/A", "N/A", false, 2);
    hiringEmployees[7] = new Employee();
    hiringEmployees[7].Employee("8876543221", "Driver", "19/12/2020", "08:00", "14:00", true, 1);
    hiringEmployees[8] = new Employee();
    hiringEmployees[8].Employee("7776543267", "Cleaning Worker", "N/A", "N/A", "N/A", false, 3);
    hiringEmployees[9] = new Employee();
    hiringEmployees[9].Employee("1176543266", "Cleaning Worker", "02/12/2020", "17:00", "21:00", true, 12);
    numOfEmployees = 10;
  
    do
    {
     System.out.println("Menu\n1- Add new employee\n2- Start a hiring contract\n3- End a hiring contract\n4- Display employee information\n5- Display HRS system status \n6- Exit");
     option = input.nextInt(); 
      switch(option)
      {
 case 1:
 {
if( numOfEmployees == hiringEmployees.length)    
{
System.out.println("list is full"); 
break; 
}
System.out.println("Please enter the employee's ID:"); 
String id = input.next(); 

boolean found = false ;   
for( int i = 0 ;i < numOfEmployees  ;  i++)
if( hiringEmployees[i].getId() .equals( id )  ) 
{
System.out.println("Sorry, this ID number already exists in the system."); 
found = true; 
} 

if( found == true)    

break ; 

System.out.println("Now enter the job title of the employee:"); 
input.nextLine();
String jop = input.nextLine(); 

hiringEmployees[numOfEmployees] = new Employee( ) ;   
hiringEmployees[numOfEmployees].setId( id ); 
hiringEmployees[numOfEmployees].setJobtitle(jop); 
hiringEmployees[numOfEmployees].setEmployee();
hiringEmployees[numOfEmployees].setHired(false);
hiringEmployees[numOfEmployees].setFrequency(0);
numOfEmployees++; 
System.out.println("New employee is added successfully and ready to be hired.");
break; 
}
        
case 2:
{
System.out.println("Please enter the employee's ID:");
String id2 = input.next(); 

int index = -1 ; 
for( int i = 0 ; i < numOfEmployees ; i++)
if( hiringEmployees[i].getId() .equals(id2))
index = i ; 


if( index == -1 )
{
System.out.println("Sorry, can't find this ID number.");
break; 
}

if( hiringEmployees[index].getHired() ==  true )
{
System.out.println("Error, this employee is already hired.");
break; 
}

System.out.println("Now enter the contract date format dd/mm/yyyy:");
 String contractDate = input.next();
 System.out.println("Enter the start time:");
 String startTime = input.next();
 System.out.println("Enter the end time:");
 String endTime = input.next();
 hiringEmployees[index].Employee(contractDate, startTime, endTime);
 hiringEmployees[index].updateFrequency();
 hiringEmployees[index].setHired(true);
 System.out.println("This employee now is hired.");
hiringEmployees[index].displayInfo();
break;
}
        
        case 3:
        System.out.println("Please enter the employee's ID:");
        idNumber = input.next();
        
        int index = -1;
        for(int count = 0; count < numOfEmployees; count++)
        if(idNumber.equals(hiringEmployees[count].getId()))
        index = count;
        
        if(index == -1)
        {
          System.out.println("Sorry, can't find this ID number.");
          break;
        }
        if( hiringEmployees[index].getHired() ==  false )
        {
        System.out.println("Error, this employee is already unhired.");
        break; 
        }
        
        
            hiringEmployees[index].displayInfo();
            System.out.println("\rThe total duration is " + hiringEmployees[index].calculateDuration() + " hours.");
            hiringEmployees[index].setHired(false);
            hiringEmployees[index].setEmployee();

            break;
      
                
        case 4:
        System.out.println("Please enter the employee's ID:");
        idNumber = input.next();
        index = -1;
        for(int count = 0; count < numOfEmployees; count++)
        if(idNumber.equals(hiringEmployees[count].getId()))
        index = count;
        
        if(index == -1)
        {
          System.out.println("Sorry, can't find this ID number.");
          break;
        }
        
        else
        hiringEmployees[index].displayInfo();
        System.out.println();
        break;
        
        case 5:
        if(numOfEmployees == 0)
         {
          System.out.println ("Error, no employees were added to system.");
          break ;
         }
        else
        {
        int hired2 = 0, noAvailable = 0;
        for(int i=0; i < numOfEmployees; i++)
        
        if(hiringEmployees[i].getHired() == true)
        hired2++;
        else 
        noAvailable++;
        
        int max = 0; 
        for(int i =1; i< numOfEmployees; i++)
        if(hiringEmployees[i].getFrequecy()> hiringEmployees[max].getFrequecy())
        max = i;
        
        System.out.println("The number of current employees in the system " + numOfEmployees + " employees") ;
        System.out.println("The number of hierd employees: " + hired2) ;
        System.out.println("Number of available employees: " + noAvailable) ;
        System.out.println("The ID of the employee with the highst frequency: " + hiringEmployees[max].getId()) ;
        System.out.println("The list of employees in table ");
        System.out.printf("|%-12s|%15s|%10s|%10s|%8s|%-5s|%-9s|", "ID", "Job", "Date", "Start time", "End time", "Hired", "Frequency");
        System.out.println();
        
        for(int i = 0; i < numOfEmployees; i++) 
        {
          hiringEmployees[i].displayInfo();
          System.out.println();
        }
        break;
        
        }
        
        case 6:
        System.out.println("All info will be lost.\rAre you sure you want to exit? (Yes/No)");
        String x = input.next();
        
        if (x.equalsIgnoreCase("yes"))
        System.out.println("Thank you, have a nice day :)" ) ;
        else if ( x.equalsIgnoreCase("no"))
        option=0;
        else if ( !x.equalsIgnoreCase("yes") || x.equalsIgnoreCase("no")){
        System.out.println("Only (Yes/No) is accepted!");
        option=0;}
        break;
        
        default:
        System.out.println("Not a valid selection!");
        break;
      }
      
     }while(option != 6);
     
     System.out.println();
     System.out.println("List of Tasks to Be Preformed:");
     System.out.println("1st Task");
    String mf= maximumFrequency(hiringEmployees[1],hiringEmployees[2]);
    if (mf.equals("-1"))
    System.out.println("Employees have diffrent job titles!");
    else 
    System.out.println("Employee with the ID number: (" + mf + ") can take a break during the weekend");
    
    System.out.println("2nd Task");
    String md= minimumDuration(hiringEmployees[0],hiringEmployees[1]);
    if(hiringEmployees[0].calculateDuration() < hiringEmployees[1].calculateDuration())
    location = 0;
    else
    location = 1;
    if (md.equals("Dates are Mismatched"))
    System.out.println("Employees worked in a different dates.");
    else
    System.out.println("Employee with the ID number: (" + md + ") worked less on (" + hiringEmployees[location].getContracData() + ")");
    
    System.out.println("3rd Task");
    String mf1= maximumFrequency(hiringEmployees[1],hiringEmployees[0]);
    if (mf1.equals("-1"))
    System.out.println("Employees have diffrent job titles!");
    else 
    System.out.println("Employee with the ID number: (" + mf1 + ") can take a break during the weekend"); 
    
    System.out.println("4th Task");
    String md1 = minimumDuration(hiringEmployees[1],hiringEmployees[3]);
    if(hiringEmployees[1].calculateDuration() < hiringEmployees[3].calculateDuration())
    location = 1;
    else
    location = 3;
    if (md1.equals("Data are Mismatched"))
    System.out.println("Employess worked in a different date");
    else
    System.out.println("Employee with the ID number: (" + md1 + ") worked less on (" + hiringEmployees[location].getContracData() + ")");
}
  
  
  public static String maximumFrequency(Employee one ,Employee two)
  {
  
  if( one.getJobtitle().equals(two.getJobtitle()) ) 
  if ( one.getFrequecy() > two.getFrequecy()) 
  return one.getId();
  else 
  return two.getId();
  
  return "-1" ;
    }  
  
  public static String minimumDuration(Employee one, Employee two)
  {
  if ( one.getContracData().equalsIgnoreCase(two.getContracData()) ) 
    if ( one.calculateDuration() < two.calculateDuration()) 
      return one.getId();
      
      else 
      return two.getId();
  
  return "Data are Mismatched";
  }
  
  
}