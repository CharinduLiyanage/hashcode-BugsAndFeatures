import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

    }
    public static InputFile readInputFile(String fileName) throws IOException {
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
}
