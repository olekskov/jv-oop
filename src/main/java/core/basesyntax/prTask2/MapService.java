package core.basesyntax.prTask2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparing;

public class MapService {
    private final RandomGenerator randomGenerator;
    private final OutputService outputService;
    private final InputService inputService;

    public MapService(RandomGenerator randomGenerator, OutputService outputService, InputService inputService) {
        this.randomGenerator = randomGenerator;
        this.outputService = outputService;
        this.inputService = inputService;
    }

    public Employee addRandomEmployee() {
        return new Employee(randomGenerator.createId(), randomGenerator.createName(), randomGenerator.createPosition(), randomGenerator.createSalary(), randomGenerator.createDate());
    }

    public Employee addEmployee(int id) {
        outputService.nameMessage();
        String name = inputService.stringInput();
        outputService.positionMessage();
        Position position = inputService.positionInput();
        outputService.salaryMessage();
        double salary = inputService.doubleInput();
        outputService.dateMessage();
        int dateOfBirth = inputService.intInput();
        return new Employee(id, name, position, salary, dateOfBirth);
    }

    public Map<Integer, Employee> fillMapWithEmployeeInfo() {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (int i = 0; i < 7; i++) {
            Employee employee = addRandomEmployee();
            if (employeeMap.containsKey(employee.getId())) {
                outputService.sameEmployeeMessage();
                break;
            }
            employeeMap.put(employee.getId(), employee);
        }
        return employeeMap;
    }

    public void setNameById(Map<Integer, Employee> map) {
        outputService.enterId();
        int key = inputService.intInput();
        if (map.containsKey(key)) {
            outputService.enterName();
            String newName = inputService.stringInput();
            map.get(key).setName(newName);
            System.out.println(map);
        } else {
            outputService.notId();
        }
    }

    public void setPositionById(Map<Integer, Employee> map) {
        outputService.enterId();
        int key = inputService.intInput();
        if (map.containsKey(key)) {
            outputService.editPosition();
            Position newPosition = inputService.positionInput();
            map.get(key).setPosition(newPosition);
            System.out.println(map);
        } else {
            outputService.notId();
        }
    }

    public void setSalaryById(Map<Integer, Employee> map) {
        outputService.enterId();
        int key = inputService.intInput();
        if (map.containsKey(key)) {
            outputService.enterSalary();
            double newSalary = inputService.intInput();
            map.get(key).setSalary(newSalary);
            System.out.println(map);
        } else {
            outputService.notId();
        }
    }

    public Map<Integer, Employee> sort(Map<Integer, Employee> map) {
        outputService.sortMessage();
        Comparator<Employee> comparator = switch (inputService.intInput()) {
            case 1 -> comparing(Employee::getId);
            case 2 -> comparing(Employee::getName);
            case 3 -> comparing(Employee::getPosition);
            case 4 -> comparing(Employee::getSalary);
            case 5 -> comparing(Employee::getYearOfBirth);
            default -> throw new IllegalArgumentException(outputService.incorrectNumber());
        };
        List<Employee> employeesList = new ArrayList<>(map.values());
        employeesList.sort(comparator);
        Map<Integer, Employee> newMap = new LinkedHashMap<>();
        for (Employee employee : employeesList) {
            newMap.put(employee.getId(), employee);
        }
        return newMap;
    }
}
