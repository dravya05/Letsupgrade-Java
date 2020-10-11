import java.util.Scanner;

class Main {
  public static void main(String[] args) {
int m1,m2,m3,m4,m5,sum;
double  percentage;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter marks of subject 1 :");
     m1=sc.nextInt();
    System.out.println("Enter marks of subject 2:");
 m2=sc.nextInt();
System.out.println("Enter marks of subject 3:");
m3=sc.nextInt();
System.out.println("Enter marks of subject 4:");
m4=sc.nextInt();
System.out.println("Enter marks of subject 5:");
m5=sc.nextInt();
sum=m1+m2+m3+m4+m5;
percentage=sum*100/500;
System.out.println("your percentage is "+percentage);
if(percentage>=90){
System.out.println("Your grade is A");
}
else if(percentage<90 && percentage>=80){
System.out.println("Your grade is B");
}
else if(percentage<80 && percentage>=70){
System.out.println("Your grade is C");
}
else if(percentage<70 && percentage>=60){
System.out.println("Your grade is D");
}
else{
System.out.println("You are failed");
}

    
  }
}