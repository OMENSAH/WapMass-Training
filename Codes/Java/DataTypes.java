class DataTypes {
  public static void main(String[] args){
    // All data types have some operations that can be performed on them 
    
    // 1. String 
    String info = "My name is Oliver ";
    System.out.println(info);
    //operations on string
    // Concatenation: for joining strings
    info = info + " and email is olivermensah96@gmail.com";
    System.out.println(info);
    System.out.println(info.toUpperCase());
    
    // 2. int 
    int a = 4;
    //operations
    a = a + 5;
    System.out.println(a);
    a = a - 2;
    System.out.println(a);
    a = a / 3;
    System.out.println(a);
    a = a * 4;
    System.out.println(a);
    //modulus operator: find the remainder after division;
    a = a % 2 ;
    System.out.println(a);
    
    
    //  Casting Data types: Converting one data type to the other.
    //1. int to string 
    int b = 4;
    String c = String.valueOf(b);
    System.out.println("1"+ c);
   
    
    //2. int to double 
    double d = (double) b;
    System.out.println(d);
    
    
    
  }
}