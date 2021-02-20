
import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.values.add(value);
    }

    public boolean isInPipe() {
        return !this.values.isEmpty();
    }

    public T takeFromPipe() {
        if (this.values.isEmpty()) {
            return null;
        }

        T previouslyInPipe = this.values.get(0);
        this.values.remove(0);

        return previouslyInPipe;
    }
}
