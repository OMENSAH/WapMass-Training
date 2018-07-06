class Methods{
  
  // any action to be performed is an method
  
  void myFirstMethod(){
    //all do something should happen here
    System.out.println("Hey run");
  }
  
  //what methods should entail 
  // 1. They can contain parameters, accepting outside data to work with 
  void mySecondMethod(String name) {
     System.out.println(name + " : some message");
  }
  
  //2. They can return something. If they are returning values , prefix them with return value data type
  int calculateNewAge() {
    
    int age = 4;
    
    int newAge = age + 10;

    
    return age;
  }
  
  //3. If the method does not return anything, it must be prefixed with void

}