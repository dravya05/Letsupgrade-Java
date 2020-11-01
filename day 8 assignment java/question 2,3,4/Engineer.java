import java.util.Scanner;
public class Engineer extends Employee{
   Scanner sc=new Scanner(System.in);
  String companyname;
  String speciality;
   
  public void getproperties(){
  System.out.println("Enter company name");
  companyname=sc.nextLine();
  System.out.println("Enter speciality");
  speciality=sc.next();
  }
  public void displayproperties(){
  System.out.println(companyname+" "+speciality);
  }
}
