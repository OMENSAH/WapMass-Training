class CompAssign {
  public static void main(String[] args) {
    int a = 4;
    a = a - 3; // adding 3 to a and storing the result in a
    //a -= 3 ;


    // have a variable with value of 5 and add 10 to it
    int b = 5;
    b += 10;

    System.out.println(a);
    System.out.println(b);


    // use case of compound assignment
    int [] ages = {10, 15, 20};
    for(int index = 0; index < ages.length; index +=1){
      System.out.println(ages[index]);
    }
  }


}