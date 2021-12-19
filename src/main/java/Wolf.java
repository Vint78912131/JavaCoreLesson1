public class Wolf extends Animal implements CanSwim {
    private int swimmingSpeed;

    public Wolf(String name, String color, int age) {
        super(name, color, age);
        this.runningSpeed = 7;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void voice() {
        System.out.println(this.getName() + " воет!");
    }

    public double swim(Pool pool) {
        System.out.println("Я " + this.getName() + ", я плыву!");
        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }

}