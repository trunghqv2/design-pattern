// Prototype Interface
interface Prototype {
    Prototype clone();
    void score();
}

// Concrete Prototype
class FifaOnline implements Prototype {
    private String name;
    private String team;
    private String position;
    private int goals;

    public FifaOnline(String name, String team, String position, int goals) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.goals = goals;
    }

    // Clone method
    @Override
    public FifaOnline clone() {
        return new FifaOnline(this.name, this.team, this.position, this.goals);
    }

    // Method to increase goals
    public void score() {
        this.goals++;
    }

    // Getters and Setters (optional)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
}

// Usage
public class PrototypeExample {
    public static void main(String[] args) {
        // Creating prototype instance
        FifaOnline prototypePT = new FifaOnline("CR7", "Al", "Test", 0);

        // Cloning prototypes
        FifaOnline cr7 = prototypePT.clone();
        FifaOnline m10 = prototypePT.clone();

        // Modifying cloned instances
        m10.setName("Messi");
        m10.setTeam("Hihi");

        // Incrementing goals for cr7
        cr7.score();

        // Output
        System.out.println(cr7.getName());      // Output: CR7
        System.out.println(m10.getPosition());  // Output: Test
    }
}
