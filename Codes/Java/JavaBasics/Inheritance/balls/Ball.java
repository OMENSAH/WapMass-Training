public class Ball { // blueprint

    //Properties or instance variables
    protected String color;
    protected String name;
    protected int capacity;
    protected int bounceRate;
    
    //final helps to prevent our properties or methods from  being overwritten;
    final protected boolean inflated = false;



    //constructor function with no parameters. This is called default constructors
    protected Ball() {
        //default
    }
    protected Ball(String mColor, String mName, int mCapacity, int mBounceRate) {
        color = mColor;
        name = mName;
        capacity = mCapacity;
        bounceRate = mBounceRate;
    }

    //Methods
    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getCapacity() {
        return capacity;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    protected int getBounceRate() {
        return bounceRate;
    }

    protected void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }

    protected void showColor() {
        System.out.println(color);
    }

    protected  void showName() {
        System.out.println(name);
    }
    protected void bounce(){
        System.out.println("Bouncing");
    }

    public void deflate(){
        System.out.println("Deflating...");
    }

    protected void inflates(){
        System.out.println("Inflating...");
    }
}
