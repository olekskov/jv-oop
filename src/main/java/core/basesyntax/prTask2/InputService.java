package core.basesyntax.prTask2;

import java.util.Scanner;

public class InputService {
    private final Scanner scanner;

    public InputService(Scanner scanner) {
        this.scanner = scanner;
    }

    public String stringInput() {
        return scanner.nextLine();
    }

    public Position positionInput() {
        return Position.valueOf(scanner.nextLine().trim().toUpperCase());
    }

    public double doubleInput() {
        return Double.parseDouble(scanner.nextLine());
    }

    public int intInput() {
        return Integer.parseInt(scanner.nextLine());
    }
}
