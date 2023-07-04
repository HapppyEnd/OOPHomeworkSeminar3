public class Box {

    private int weight;
    private int number;
    static int count = 0;

    public Box() {
        this.weight = (int) (Math.random() * 10);
        this.number = ++count;

    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return String.format(
                "Box № %d. Weight: %d.", this.number, this.weight);
    }
}
