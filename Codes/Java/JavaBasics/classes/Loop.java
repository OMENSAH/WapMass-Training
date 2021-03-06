class Loop {
  public static void main(String[] args) {
    //Printing numbers from 1 to 10 
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
    System.out.println(4);
    System.out.println(5);
    System.out.println(6);
    System.out.println(7);
    System.out.println(8);
    System.out.println(9);
    System.out.println(10);
    
    // for loop: for( initialization; condition; increment){}
    for( int i = 1; i < 11; i++)  System.out.println("Loop: " + i);
    //Even no
    for( int i = 1; i <= 20; i++){
      if( i % 2 == 0) {
        System.out.println("Even: " + i);
      }
    }
    //Odd No
    for( int i = 1; i <= 20; i++){
      if( i % 2 == 1) {
        System.out.println("Odd: " + i);
      }
    }
    
    // combined Code for old and even 
    for( int i = 1; i <= 20; i++){
      if( i % 2 == 0) {
        System.out.println("Even: " + i);
      }else{
        System.out.println("Old: " + i);
      }
    }
      
      /* while:
       * is outside, condition is in while loop and increment is in the block
       */
      int age = 5;    
      while( age < 20) {
        System.out.print(age);
        age++;
      }
      
      /*do{statements}while(condition)
       * 
       */
      int iVal = 150;
      do {
        System.out.print(iVal);
         iVal *= 2;
        System.out.println(" *=2: " + iVal);
        System.out.println(iVal);
      } while(iVal < 100);
    }
}