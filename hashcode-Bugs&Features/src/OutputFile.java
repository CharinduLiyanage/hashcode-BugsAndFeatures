import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OutputFile {
    private int noOfIntersections;
    private ArrayList<Intersection> intersections;

    public void write(String fileName) throws IOException {
        FileWriter myWriter = new FileWriter(fileName);
        myWriter.write(this.toString());
        myWriter.close();
    }

    public OutputFile(int noOfIntersections, ArrayList<Intersection> intersections) {
        this.noOfIntersections = noOfIntersections;
        this.intersections = intersections;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(noOfIntersections).append("\n");

        for (Intersection intersection: intersections) {
            output.append(intersection).append("\n");
        }
        output.deleteCharAt(output.length()-1);

        return output.toString();
    }

    public int getNoOfIntersections() {
        return noOfIntersections;
    }

    public void setNoOfIntersections(int noOfIntersections) {
        this.noOfIntersections = noOfIntersections;
    }

    public ArrayList<Intersection> getIntersections() {
        return intersections;
    }

    public void setIntersections(ArrayList<Intersection> intersections) {
        this.intersections = intersections;
    }
}
