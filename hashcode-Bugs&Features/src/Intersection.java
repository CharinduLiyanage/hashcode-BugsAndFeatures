import java.util.ArrayList;

public class Intersection {
    private int name;
    private int noOfIncomingStreets = 0;
    private ArrayList<IncomingStreet> incomingStreets = new ArrayList<>();

    public Intersection(int name) {
        this.name = name;
    }

    public void addIncomingStreets(IncomingStreet incomingStreet) {
        this.incomingStreets.add(incomingStreet);
        this.noOfIncomingStreets++;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(name).append("\n");
        output.append(noOfIncomingStreets).append("\n");

        for (IncomingStreet incomingStreet: incomingStreets) {
            output.append(incomingStreet).append("\n");
        }
        output.deleteCharAt(output.length()-1);

        return output.toString();
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getNoOfIncomingStreets() {
        return noOfIncomingStreets;
    }

    public void setNoOfIncomingStreets(int noOfIncomingStreets) {
        this.noOfIncomingStreets = noOfIncomingStreets;
    }

    public ArrayList<IncomingStreet> getIncomingStreets() {
        return incomingStreets;
    }

    public void setIncomingStreets(ArrayList<IncomingStreet> incomingStreets) {
        this.incomingStreets = incomingStreets;
    }
}
