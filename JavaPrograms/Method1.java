class Method1
 {
  //Create a method
  public static void method1()
  {
   //statements
   String name ="Ayasha";
   System.out.println("My name is "+name);
  }
   
   public static void main(String[] args)
     {
      System.out.println("Main Starts");
      method1();
      method1();
      method2();
      System.out.println("Main Ends");
      }
    static void method2()
       {
        //method body or method implementation.....
        System.out.println("Method2 in a class");
       }


  }