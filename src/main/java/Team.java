import java.text.DecimalFormat;

public class Team {
    private String teamName;
    private double courseTime;
    private Animal [] team;

    public Team(String teamName, Animal a1, Animal a2, Animal a3, Animal a4) {
        this.teamName = teamName;
        this.setTeam(new Animal []{a1,a2,a3,a4});
        courseTime = 0;
    }

    public double getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(double courseTime) {
        this.courseTime = courseTime;
    }

    public Team() {
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeam(Animal[] team) {
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public Animal[] getTeam() {
        return team;
    }

    public void showResults() {
        if (this.courseTime == 0)
            System.out.println("Команда " + this.teamName + " ещё не бегала.");
        else
            System.out.println("Команда " + this.teamName + " преодолела полосу препятствий за " + new DecimalFormat().format(courseTime) + " секунд.");
    }

    @Override
    public String toString() {
        String result = "";
        for (Animal a: team) {
            result+=a + "\n";
        }
        result+="\n";
        return result;
    }

}
