public class Street {
    private int start;
    private int end;
    private String name;
    private int duration;

    public Street(int start, int end, String name, int duration) {
        this.start = start;
        this.end = end;
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Street{" +
                "start=" + start +
                ", end=" + end +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
