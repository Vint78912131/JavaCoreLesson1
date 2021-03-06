public class Turtle extends Animal implements CanSwim{
    private int swimmingSpeed;

    public Turtle(String name, String color, int age, int swimmingSpeed) {
        super(name, color, age);
        this.swimmingSpeed = swimmingSpeed;
        this.runningSpeed = 1;
    }

    public Turtle(String name, String color, int age) {
        super(name, color, age);
        this.runningSpeed = 1;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }


    @Override
    public void voice() {
        System.out.println(this.getName() + " шипит KAWABANGAAA!");
    }

    public double swim(Pool pool) {
        System.out.println("Я " + this.getName() + ", я плыву!");
        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }

}