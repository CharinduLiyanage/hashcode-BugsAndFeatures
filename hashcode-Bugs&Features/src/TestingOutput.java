import java.io.IOException;
import java.util.ArrayList;

public class TestingOutput {
    public static void main(String[] args) {
        IncomingStreet street = new IncomingStreet("street-name-1", 2);
        IncomingStreet street2 = new IncomingStreet("street-name-2", 4);

        ArrayList<IncomingStreet> streets = new ArrayList<>();
        streets.add(street);
        Intersection intersection = new Intersection(
                1,
                1,
                streets
        );

        ArrayList<IncomingStreet> streets2 = new ArrayList<>();
        streets2.add(street);
        streets.add(street2);
        Intersection intersection2 = new Intersection(
                0,
                2,
                streets2
        );

        ArrayList<Intersection> intersections = new ArrayList<>();
        intersections.add(intersection);
        intersections.add(intersection2);
        OutputFile outputFile  = new OutputFile(2, intersections);

        try {
            outputFile.write("Outputs/test_output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
