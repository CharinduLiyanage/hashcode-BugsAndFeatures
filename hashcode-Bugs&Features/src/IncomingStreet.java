public class IncomingStreet {
    private String name;
    private int greenDuration;

    public IncomingStreet(String name, int greenDuration) {
        this.name = name;
        this.greenDuration = greenDuration;
    }

    @Override
    public String toString() {
        return name + ' ' + greenDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGreenDuration() {
        return greenDuration;
    }

    public void setGreenDuration(int greenDuration) {
        this.greenDuration = greenDuration;
    }
}
