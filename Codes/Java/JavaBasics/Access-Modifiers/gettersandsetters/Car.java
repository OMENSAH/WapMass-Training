package gettersandsetters;
public class Car {
  private String name;
  private String make;
  private int regNo;

  public void setName(String name){
    this.name = name;
  }

  public String getName() {
    return this.name;
  }


  public void setMake(String make){
    this.make = make;
  }

  public String getMake() {
    return this.make;
  }

  public void setRegNo(int regNo){
    this.regNo = regNo;
  }

  public int getRegNo() {
    return this.regNo;
  }


}