class Main {
  public static void main(String[] args) {
    Avenger[]  a=new Avenger[5];
  
    for(int i=0;i<5;i++)
    {
      a[i]=new Avenger();
      a[i].getdetails();
      
    }
    
    for(int i=0;i<5;i++)
    {
      a[i].displaydetails();
    }   
  }
}