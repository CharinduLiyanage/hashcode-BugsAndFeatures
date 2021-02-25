import java.io.*;
import java.util.ArrayList;

public class InputFile {
    private int timeDuration;
    private int noOfIntersections;
    private int noOfStreets;
    private int noOfCars;
    private int bonus;
    ArrayList<Street> streets = new ArrayList<>();
    ArrayList<Vehicle> vehicles = new ArrayList<>();


    public static InputFile read(String fileName) throws IOException {
        File file = new File(fileName);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String[] dataList = bufferedReader.readLine().split(" ");

        InputFile inputFile = new InputFile(
                Integer.parseInt(dataList[0]),
                Integer.parseInt(dataList[1]),
                Integer.parseInt(dataList[2]),
                Integer.parseInt(dataList[3]),
                Integer.parseInt(dataList[4])
        );

        for (int i = 0; i <inputFile.getNoOfStreets(); i++) {

            String[] streetInput = bufferedReader.readLine().split(" ");

            int start = Integer.parseInt(streetInput[0]);
            int ends = Integer.parseInt(streetInput[1]);
            String name = streetInput[2];
            int duration = Integer.parseInt(streetInput[3]);

            Street street = new Street(start, ends, name, duration);
            inputFile.addStreet(street);
        }

        for (int i = 0; i <inputFile.getNoOfCars(); i++) {

            String[] carInput = bufferedReader.readLine().split(" ");
            int numOfStreets = Integer.parseInt(carInput[0]);

            Vehicle vehicle = new Vehicle(numOfStreets);

            for(int j = 1; j <numOfStreets; j++){
                for (Street street: inputFile.getStreets()) {
                    if (street.getName().equals(carInput[j])) {
                        vehicle.addStreet(street);
                    }
                }
            }
            inputFile.addVehicle(vehicle);
        }
        return inputFile;
    }

    private InputFile(int timeDuration, int noOfIntersections, int noOfStreets, int noOfCars, int bonus) {
        this.timeDuration = timeDuration;
        this.noOfIntersections = noOfIntersections;
        this.noOfStreets = noOfStreets;
        this.noOfCars = noOfCars;
        this.bonus = bonus;
    }

    public void addStreet(Street street) {
        this.streets.add(street);
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    @Override
    public String toString() {
        return "InputFile{" +
                "\n\ttimeDuration=" + timeDuration +
                ",\n\t noOfIntersections=" + noOfIntersections +
                ",\n\t noOfStreets=" + noOfStreets +
                ",\n\t noOfCars=" + noOfCars +
                ",\n\t bonus=" + bonus +
                ",\n\t streets=" + streets +
                ",\n\t vehicles=" + vehicles +
                "\n}";
    }

    public ArrayList<Street> getStreets() {
        return streets;
    }

    public void setStreets(ArrayList<Street> streets) {
        this.streets = streets;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public int getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(int timeDuration) {
        this.timeDuration = timeDuration;
    }

    public int getNoOfIntersections() {
        return noOfIntersections;
    }

    public void setNoOfIntersections(int noOfIntersections) {
        this.noOfIntersections = noOfIntersections;
    }

    public int getNoOfStreets() {
        return noOfStreets;
    }

    public void setNoOfStreets(int noOfStreets) {
        this.noOfStreets = noOfStreets;
    }

    public int getNoOfCars() {
        return noOfCars;
    }

    public void setNoOfCars(int noOfCars) {
        this.noOfCars = noOfCars;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
