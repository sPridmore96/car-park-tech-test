public class VehicleCommands extends Commands{
    public VehicleCommands() {
        super(new String[]{"Car", "Van", "MotorBike", "Show List of Vehicles"}, "addVehicle");
    }
    @Override
    public void run() {

        CarPark CarPark = new CarPark();

        printCommands();
        printGreeting();
        CarPark.getCarParkInfo();

        Boolean isActive = true;

        while (isActive) {
            int userInput = getIntInput(4);
            switch (userInput) {
                case 1:
                    CarPark.addCarToCarPark();
                    CarPark.removeSpaces(new Car().getSpaceTaken());
                    CarPark.getCarParkInfo();
                    break;
                case 2:
                    CarPark.addVanToCarPark();
                    CarPark.removeSpaces(new Van().getSpaceTaken());
                    CarPark.getCarParkInfo();
                    break;
                case 3:
                    CarPark.addMotorcycleToCarPark();
                    CarPark.removeSpaces(new Motorcycle().getSpaceTaken());
                    CarPark.getCarParkInfo();
                    break;
                case 4 :
                    CarPark.showAllVehicles();
                default:
                    break;
            }
        }
    }
}
