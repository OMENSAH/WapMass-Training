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
  }
}
      