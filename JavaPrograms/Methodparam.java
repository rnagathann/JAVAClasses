class Methodparam {
 private static void title(String name,int age)//default method
 {
 System.out.println("name:"+name+",Age:"+age);
 }
public static void title1(String name,double price)
 {
  System.out.println("name:"+name+",Price:"+price);
  } 
public static void main(String[] args)
 {
   System.out.println("Main Starts");
   title("Ayesha",23);
   title1("testing",238.99);
   
   
   java.util.Scanner scn=new java.util.Scanner(System.in);
   System.out.println("Enter the title");
   String title=scn.next();
   System.out.println("Enter price");
   double d=scn.nextDouble();
   title1(title,d);
   System.out.println("Main Ends");
 }
}