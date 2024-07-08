// Chiến thuật (Strategy interface)
interface Strategy {
    int execute(int a, int b);
}

// Chiến thuật cộng (Add strategy)
class AddStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

// Chiến thuật trừ (Subtract strategy)
class SubtractStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

// Chiến thuật nhân (Multiply strategy)
class MultiplyStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}

// Chiến thuật chia (Divide strategy)
class DivideStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}

// Đối tượng sử dụng chiến thuật (Context)
class Calculator {
    private Strategy strategy;

    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}

// Sử dụng Calculator với các chiến thuật khác nhau
public class StrategyExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddStrategy());
        int result = calculator.executeStrategy(10, 5);
        System.out.println("Kết quả (Add): " + result); // Kết quả: 15

        calculator.setStrategy(new SubtractStrategy());
        result = calculator.executeStrategy(10, 5);
        System.out.println("Kết quả (Subtract): " + result); // Kết quả: 5

        calculator.setStrategy(new MultiplyStrategy());
        result = calculator.executeStrategy(10, 5);
        System.out.println("Kết quả (Multiply): " + result); // Kết quả: 50

        calculator.setStrategy(new DivideStrategy());
        result = calculator.executeStrategy(10, 5);
        System.out.println("Kết quả (Divide): " + result); // Kết quả: 2
    }
}
