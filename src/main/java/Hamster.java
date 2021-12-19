import java.util.Objects;

public class Hamster extends Animal{

    public Hamster(String name, String color, int age) {
        super(name, color, age);
        this.runningSpeed = 3;
    }

    @Override
    public void voice() {
        System.out.println(this.getName() + " пищит!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamster hamster = (Hamster) o;
        return age == hamster.age &&
                Objects.equals(name, hamster.name) &&
                Objects.equals(color, hamster.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }

}
