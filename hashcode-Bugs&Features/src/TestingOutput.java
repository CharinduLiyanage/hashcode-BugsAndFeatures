import java.io.IOException;
import java.util.ArrayList;

public class TestingOutput {
    public static void main(String[] args) {
        IncomingStreet street = new IncomingStreet("street-name-1", 2);
        IncomingStreet street2 = new IncomingStreet("street-name-2", 4);

        Intersection intersection = new Intersection(1);
        intersection.addIncomingStreets(street);


        Intersection intersection2 = new Intersection(0);
        intersection2.addIncomingStreets(street);
        intersection2.addIncomingStreets(street2);



        OutputFile outputFile  = new OutputFile();
        outputFile.addIntersection(intersection);
        outputFile.addIntersection(intersection2);


        try {
            outputFile.write("Outputs/test_output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
