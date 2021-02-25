import java.util.ArrayList;

public class Vehicle {
    private int noOfStreets;
    private ArrayList<Street> streets = new ArrayList<>();

    public Vehicle(int noOfStreets) {
        this.noOfStreets = noOfStreets;
    }

    public void addStreet(Street street) {
        this.streets.add(street);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "noOfStreets=" + noOfStreets +
                ", streets=" + streets +
                '}';
    }

    public int getNoOfStreets() {
        return noOfStreets;
    }

    public void setNoOfStreets(int noOfStreets) {
        this.noOfStreets = noOfStreets;
    }

    public ArrayList<Street> getStreets() {
        return streets;
    }

    public void setStreets(ArrayList<Street> streets) {
        this.streets = streets;
    }
}
