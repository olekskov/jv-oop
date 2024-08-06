package core.basesyntax.prTask2;

import java.util.Random;

public class RandomGenerator {
    private final Random random;

    public RandomGenerator(Random random) {
        this.random = random;
    }

    public int createId() {
        return random.nextInt(1000);
    }

    public String createName() {
        return EmployeeName.values()[random.nextInt(EmployeeName.values().length)].toString();
    }

    public Position createPosition() {
        return Position.values()[random.nextInt(Position.values().length)];
    }

    public int createDate() {
        return random.nextInt(1964, 2024);

    }

    public double createSalary() {
        return random.nextDouble(1000);
    }
}
