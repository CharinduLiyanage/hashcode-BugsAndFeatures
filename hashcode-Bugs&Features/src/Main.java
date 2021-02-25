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

            String[] streets = bufferedReader.readLine().split(" ");

            int intersection = Integer.parseInt(streets[0]);
            int endsAt = Integer.parseInt(streets[1]);
            String streetName = streets[2];
            int duration = Integer.parseInt(streets[3]);

        }

        for (int i = 0; i <inputFile.getNoOfCars(); i++) {

            String[] cars = bufferedReader.readLine().split(" ");
            int numOfStreets = Integer.parseInt(cars[0]);

             for(int j = 0; j <numOfStreets; j++){
                 
             }

        }
        return null;
    }
}
