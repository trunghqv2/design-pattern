// Subsystem A
class SubsystemA {
    public String operationA() { // hoạt động A
        return "Subsystem A";
    }
}

// Subsystem B
class SubsystemB {
    public String operationB() {
        return "Subsystem B";
    }
}

// Subsystem C
class SubsystemC {
    public String operationC() {
        return "Subsystem C";
    }
}

// Facade
class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
        this.subsystemC = new SubsystemC();
    }

    public String operation() {
        StringBuilder result = new StringBuilder();
        result.append(subsystemA.operationA());
        result.append(" | ");
        result.append(subsystemB.operationB());
        result.append(" | ");
        result.append(subsystemC.operationC());
        return result.toString();
    }
}

// Usage of Facade to interact with complex subsystems
public class FacadeExample {
    public static void main(String[] args) {
        Facade facade = new Facade();
        String result = facade.operation();
        System.out.println(result); // Kết quả: "Subsystem A | Subsystem B | Subsystem C"
    }
}
