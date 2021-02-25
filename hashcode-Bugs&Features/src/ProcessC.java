import java.io.IOException;
import java.util.HashSet;
import java.util.function.Predicate;

public class ProcessC {
    public static void main(String[] args) {
        try {

            String fileName = "d";

            InputFile inputFile = InputFile.read("Data/"+fileName+".txt");
            OutputFile outputFile = process(inputFile);

            outputFile.write("Outputs/"+fileName+"_out.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static OutputFile process(InputFile inputFile) {
        OutputFile outputFile = new OutputFile();

        for (int i = 0; i < inputFile.getNoOfIntersections(); i++) {
            Intersection intersection = new Intersection(i);
            outputFile.addIntersection(intersection);
        }


        for (Intersection intersection: outputFile.getIntersections()) {
            for (Street street: inputFile.getStreets()) {
                if (intersection.getName() == street.getEnd()) {
                    // Adding default of 1 second
                    intersection.addIncomingStreets(new IncomingStreet(street.getName(), 1));
                }
            }
        }

        HashSet<Intersection> usedIntersections= new HashSet<>();
        for (Vehicle vehicle: inputFile.getVehicles()) {
            for (int i = 0; i < vehicle.getNoOfStreets()-1; i++) {
                usedIntersections.add(new Intersection(vehicle.getStreets().get(i).getEnd()));
            }
        }


        for (int i = 0; i < outputFile.getIntersections().size(); i++) {
            boolean isUsed = false;
            for (Intersection used: usedIntersections) {
                if (outputFile.getIntersections().get(i).getName() == (used.getName())) {
                    isUsed = true;
                    break;
                }
            }
            if (!isUsed){
                outputFile.removeIntersection(outputFile.getIntersections().get(i));
            }
        }


        return outputFile;
    }
}