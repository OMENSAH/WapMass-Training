import gettersandsetters.Car;

class Main{
    public static void main(String[] args) {
        // PublicAccessModifier paAccessModifier = new PublicAccessModifier("Oliver", 25);
        // System.out.println(paAccessModifier.age);

        Car car = new Car();
        car.setMake("Uber");
        car.setName("Uber 2910");
        car.setRegNo(2344);

        System.out.println(car.getMake());
    }
}