class ConditionalLogic {
  public static void main(String[] args) {
    int legalAge = 20;
    
    if( legalAge > 20 ){
      System.out.println("Hey I am more than 20");
    }
    else if(legalAge < 20 ){
        System.out.println("Hey I am less than 20");
    }
    else{
        System.out.println("Hey my age is exact");
    }


    // switch construct is another way of dealing with conditional logic
    int age = 30;
    switch (age) {
      case 10:
        System.out.println("The age is " + age);
        break;
      case 20:
        System.out.println("The age is " + age);
        break;
      default:
        System.out.println("The default age is " + age);
        break;
    }
  }
}
      