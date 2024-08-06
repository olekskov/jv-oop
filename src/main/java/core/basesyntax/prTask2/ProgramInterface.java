package core.basesyntax.prTask2;

import java.util.Map;

public class ProgramInterface {
    private final OutputService outputService;
    private final InputService inputService;
    private final MapService mapService;

    public ProgramInterface(OutputService outputService, InputService inputService, MapService mapService) {
        this.outputService = outputService;
        this.inputService = inputService;
        this.mapService = mapService;
    }

    public void programMenu(Map<Integer, Employee> map) {
        out:
        while (true) {
            outputService.mainMenuMessage();
            switch (inputService.intInput()) {
                case 1:
                    for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
                        outputService.printEmployeeFromMap(entry.getKey(), entry.getValue());
                    }
                    break;
                case 2:
                    addEmployeeToMap(map);
                    break;
                case 3:
                    setEmployee(map);
                    break;
                case 4:
                    map = mapService.sort(map);
                    break;
                case 5:
                    break out;
                default:
                    outputService.invalidOption();
            }
        }
    }

    private void addEmployeeToMap(Map<Integer, Employee> map) {
        outputService.enterId();
        int id = inputService.intInput();
        if (map.containsKey(id)) {
            outputService.editOrBack(id);
            switch (inputService.intInput()) {
                case 1 -> {
                    setEmployee(map);
                }
                default -> {
                    outputService.invalidOption();
                }
            }
        } else {
            Employee newEmployee = mapService.addEmployee(id);
            map.put(newEmployee.getId(), newEmployee);
        }
    }

    private void setEmployee(Map<Integer, Employee> map) {
        outputService.editEmployeeMessage();
        switch (inputService.intInput()) {
            case 1:
                mapService.setNameById(map);
                break;
            case 2:
                mapService.setPositionById(map);
                break;
            case 3:
                mapService.setSalaryById(map);
                break;
            case 4:
                break;
            default:
                outputService.invalidOption();
        }
    }
}
