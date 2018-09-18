public class Thing implements Comparable {

    String name;
    boolean completed;

    Thing(String name) {
        this.name = name;
    }

    void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Object o) {
        return Boolean.compare(this.completed, ((Thing) o).completed);
    }

}
