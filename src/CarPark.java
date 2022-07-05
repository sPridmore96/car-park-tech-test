import java.util.ArrayList;
import java.util.List;

public class CarPark {


    private int totalCarSpaces;
    private int totalMotorBikeSpaces;
    private int totalSpaces;

    private boolean isCarParkFull;


    private static final List<Vehicle> currentVehicles = new ArrayList<>();

    public CarPark() {
        this.totalCarSpaces = 40;
        this.totalMotorBikeSpaces = 10;
        this.totalSpaces = this.totalCarSpaces + this.totalMotorBikeSpaces;
    }

    static {

        for (int i = 0; i < 2; i++) {
            currentVehicles.add(new Car());
            currentVehicles.add(new Van());
            currentVehicles.add(new Motorcycle());
        }
    }

    public void removeSpaces(int amount) {
        this.totalSpaces = this.totalSpaces - amount;
    }

    public void addCarToCarPark() {
        if(totalSpaces == 0) {
            System.out.println("theres no space left for Cars");
        } else {
        this.totalCarSpaces = this.totalCarSpaces - 1;
        currentVehicles.add(new Car());
        }
    }

    public void setTotalCarSpaces(int totalCarSpaces) {
        this.totalCarSpaces = totalCarSpaces;
    }

    public int getTotalMotorBikeSpaces() {
        return totalMotorBikeSpaces;
    }

    public int getTotalCarSpaces() {
        return totalCarSpaces;
    }

    public void addMotorcycleToCarPark() {
        if(this.totalMotorBikeSpaces == 0 || totalSpaces == 0) {
            System.out.println("All MotorBike Spots are Taken");
            this.totalCarSpaces = totalCarSpaces - 1;
        } else {
            this.totalMotorBikeSpaces = totalMotorBikeSpaces -1;
        }
        currentVehicles.add(new Motorcycle());
    }

    public void addVanToCarPark() {
        if(this.totalSpaces < 3) {
            System.out.println("There no Room left for a Van");
        } else {
        this.totalCarSpaces = this.totalCarSpaces - 3;
        currentVehicles.add(new Van());
        }
    }

    public void getCarParkInfo() {
         System.out.printf("The total Spots that are left are : %d\nMotorBike Spots : %d\nCar Spots : %d%n", getTotalSpaces(), getTotalMotorBikeSpaces(), getTotalCarSpaces());
    }

    public void showAllVehicles() {

        for (int i = 0; i < currentVehicles.size(); i++) {
            Vehicle vehicle = currentVehicles.get(i);
            vehicle.printType();
        }
    }

    public int getTotalSpaces() {
        return totalSpaces;
    }
}
