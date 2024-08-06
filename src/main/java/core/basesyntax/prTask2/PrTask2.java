package core.basesyntax.prTask2;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PrTask2 {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static final RandomGenerator randomGenerator = new RandomGenerator(random);
    private static final OutputService outputService = new OutputService();
    private static final InputService inputService = new InputService(scanner);
    private static final MapService MAP_SERVICE = new MapService(randomGenerator, outputService, inputService);
    private static final ProgramInterface programInterface = new ProgramInterface(outputService, inputService, MAP_SERVICE);

    public static void main(String[] args) {
        Map<Integer, Employee> employees = MAP_SERVICE.fillMapWithEmployeeInfo();
        programInterface.programMenu(employees);
    }
}