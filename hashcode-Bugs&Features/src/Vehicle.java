import java.util.ArrayList;

public class Vehicle {
    private int noOfStreets;
    private ArrayList<String> streets;

    public Vehicle(int noOfStreets, ArrayList<String> streets) {
        this.noOfStreets = noOfStreets;
        this.streets = streets;
    }

    public int getNoOfStreets() {
        return noOfStreets;
    }

    public void setNoOfStreets(int noOfStreets) {
        this.noOfStreets = noOfStreets;
    }

    public ArrayList<String> getStreets() {
        return streets;
    }

    public void setStreets(ArrayList<String> streets) {
        this.streets = streets;
    }
}
