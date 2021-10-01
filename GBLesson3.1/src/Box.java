import java.util.ArrayList;
import java.util.List;


public class Box<T extends Fruit> implements Comparable<Box<? extends Fruit>> {
    private List<T> fruits = new ArrayList<>();

    public List<T> getFruits() {

        return fruits;
    }

    public void add(T fruit) {

        fruits.add(fruit);
    }

    public void add(List<T> fruits) {

        this.fruits.addAll(fruits);
    }

    public float getWeight() {
        if (fruits.size() > 0) {
            return fruits.get(0).getWeight() * fruits.size();
        }
        return 0.0F;
    }

    public boolean compare(Box<? extends Fruit> other) {
        return Math.abs(getWeight() - other.getWeight()) > 0.0001;
    }

    @Override
    public int compareTo(Box<? extends Fruit> other) {

        return Float.compare(getWeight(), other.getWeight());
    }

    public void merge(Box<T> other) {
        fruits.addAll(other.getFruits());
        other.getFruits().clear();
    }

}