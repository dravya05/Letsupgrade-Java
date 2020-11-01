import java.util.Scanner;
public class Pilot extends Employee{
   Scanner sc=new Scanner(System.in);
  String airlinesname;
  String speciality;
   
  public void getproperties(){
  System.out.println("Enter airlines  name");
  airlinesname=sc.nextLine();
  System.out.println("Enter speciality");
  speciality=sc.next();
  }
  public void displayproperties(){
  System.out.println(airlinesname+" "+speciality);
  }
}
