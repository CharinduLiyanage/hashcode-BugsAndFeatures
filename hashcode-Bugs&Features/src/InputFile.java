import java.util.ArrayList;

public class InputFile {
    private int timeDuration;
    private int noOfIntersections;
    private int noOfStreets;
    private int noOfCars;
    private int bonus;
    ArrayList<Street> streets = new ArrayList<>();
    ArrayList<Vehicle> vehicles = new ArrayList<>();


    public InputFile(int timeDuration, int noOfIntersections, int noOfStreets, int noOfCars, int bonus) {
        this.timeDuration = timeDuration;
        this.noOfIntersections = noOfIntersections;
        this.noOfStreets = noOfStreets;
        this.noOfCars = noOfCars;
        this.bonus = bonus;
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
