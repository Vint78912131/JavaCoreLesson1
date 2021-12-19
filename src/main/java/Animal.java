import java.text.DecimalFormat;

public abstract class Animal implements CanRun{
    protected String name;
    protected String color;
    protected int age;
    protected int runningSpeed;

    public Animal(String name, String color, int age) {
        this.setName(name);
        this.setColor(color);
        this.setAge(age);
    }

    public int getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(int runningSpeed) {
        this.runningSpeed = runningSpeed;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double run(Course course) {
        double time = 0;
        System.out.println("Я " + this.getName() + ", я бегу! Моя скорость: " + this.getRunningSpeed());
        for (int o : course.getObstacles()) {
            time+=((double) o / this.getRunningSpeed());
        }
        System.out.println("Затратил " + new DecimalFormat().format(time));
        return time;
    }

    public abstract void voice();
}