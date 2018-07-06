class Car {
  //properties
  String name;
  String color;
  String manufacturer;
  int year_made;
  double speed;
  
  // constructor
  // Constructor name should be the same as class name 
  Car(String name, String color, String manufacturer, int year_made,double speed){
    this.name = name;
    this.color = color;
    this.manufacturer = manufacturer;
    this.year_made  = year_made;
    this.speed = speed;    
  }
  
  
  //methods
  double accelerate() {
    speed = speed +10;
    return speed;
  }
  
  void changeColor(String newColor){
    color = newColor;
  }
  
  public static void main(String[] args){
    //  now we can create objects from our car; The process is called instantiation. 
    // Creating a new car called BMW
    
    Car bmw = new Car("BMW", "White", "Toyota", 2018, 200.90);
    // bmw as object of car  now has access to all the properties and methods of car class
    
    // Access properties and methods with dot operator.
    System.out.println("BMW Color:" + bmw.color);
    System.out.println("BMW name:" + bmw.name);
    System.out.println("BMW Speed:" + bmw.speed);
    
     Car corolla = new Car("Corolla", "Red", "Kantanka", 2016, 100);
    // corolla as object of car  now has access to all the properties and methods of car class
    
    // Access properties and methods with dot operator.
    corolla.changeColor("Green");
    corolla.accelerate();
    System.out.println("Corolla Color:" + corolla.color);
    System.out.println("Corolla name:" + corolla.name);
    System.out.println("Corolla Speed:" + corolla.speed);
    
    
  }
}