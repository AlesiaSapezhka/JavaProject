package PreparationsForInterview.FirstJavaProject;

public class Car {
    String brand;
    int mileage;

    public Car (String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

   public void drive(int km) {
       mileage += km;
       System.out.println("Drive " + km + " km");
   }
}
