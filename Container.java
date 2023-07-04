import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Comparable<Container>, Iterable<Box> {
    private int number;
    static int count = 0;
    List<Box> boxes = new ArrayList<>();

    public Container() {
        this.number = ++count;
    }

    public int getSumWeight() {
        int sumWeight = 0;
        for (Box box : boxes) {
            sumWeight += box.getWeight();
        }
        return sumWeight;
    }

    public int countBox() {
        return boxes.size();
    }

    public void addBox(Box box) {
        this.boxes.add(box);
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }

    @Override
    public int compareTo(Container o) {
        return this.getSumWeight() - o.getSumWeight();
    }

    @Override
    public String toString() {
        return String.format("Container № %d. \n" +
                "Total weight of boxes: %d. \n" +
                "Number of boxes: %d.\n",
                this.number, this.getSumWeight(), this.countBox());
    }

}
