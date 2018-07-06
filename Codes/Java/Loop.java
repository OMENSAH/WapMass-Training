class Loop {
  public static void main(String[] args){
    // printing just numbers without loops
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
    System.out.println(4);
    System.out.println(5);
    
    //with loops 
    // Loop is a construct for repeatedly doing something
    
    // using for loop: for(initialization, condition, increment){}
    for(int i = 1; i <=5; i = i+ 1){
      System.out.println( "for " + i);
    }
    
    // while : initialization is outside the loop, condition with while() and increment is in {}
    int i = 1 ;
    while(i <=5){
      System.out.println("while " + i);
     i = i+ 1;
    }
    
    //do while 
    // Works differently from the others by doing once before checking for condition
    int j = 1 ;
    do {
     System.out.println("do while " + j);
      j = j + 1;
    } while(j <=5);
    
  }
}