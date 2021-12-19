import java.text.DecimalFormat;

public class Course {
    private int length; //количество препятствий
    private int [] obstacle; //время прохождения каждого препятствия

    public Course(int length) { //генерируем случайное время прохождения каждого препятствия
        obstacle = new int[length];
        for (int i = 0; i < length; i++) {
            obstacle[i] = (int) (Math.random() * 10 + 1);
        }
    }

    public int[] getObstacles() {
        return obstacle;
    }

    public double getAllTime() {
        double time = 0;
        for (int o : obstacle) {
            time+=o;
        }
        return time;
    }

    public void printObstacles() {
        System.out.print("\nПолоса препятствий: ");
        for (int o : obstacle) {
            System.out.print("\'" + o + "\' ");
        }
        System.out.println("\nОбщая дистанция: " + new DecimalFormat().format(this.getAllTime()) + "\n");
    }

    public void doIt(Team team) {
        for (Animal a: team.getTeam()) {
            double time = this.getTimeToOvercomeCourse(a);
            team.setCourseTime(team.getCourseTime() + time);
            System.out.println(a.getName() + " преодолел полосу препятствий за " + new DecimalFormat().format(time) + " секунд");
        }
        System.out.println(team.getTeamName() + " завершила беготню.\n");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getTimeToOvercomeCourse(CanRun runner) {
        return runner.run(this);
    }
}
