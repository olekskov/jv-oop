package core.basesyntax.prTask2;

import java.util.Arrays;

import static java.lang.System.lineSeparator;

public class OutputService {
    public void nameMessage() {
        System.out.println("Enter name: ");
    }

    public void positionMessage() {
        System.out.println("Enter position(one of " + Arrays.toString(Position.values()) + ") : ");
    }

    public void salaryMessage() {
        System.out.println("Enter salary: ");
    }

    public void dateMessage() {
        System.out.println("Enter date of birth: ");
    }

    public void sameEmployeeMessage() {
        System.out.println("Employee with this ID already exists");
    }

    public void printEmployeeFromMap(Integer key, Employee value) {
        System.out.println("ID: " + key
                + " : " + value);
    }

    public void enterId() {
        System.out.println("Enter ID: ");
    }

    public void notId() {
        System.out.println("No such ID in the map");
    }

    public void enterName() {
        System.out.println("Enter new name:");
    }

    public void enterSalary() {
        System.out.println("Enter new salary:");
    }

    public void sortMessage() {
        System.out.println("Enter the number to sort by: "
                + lineSeparator() + "(1 - ID) "
                + lineSeparator() + "(2 - name) "
                + lineSeparator() + "(3 - position) "
                + lineSeparator() + "(4 - salary) "
                + lineSeparator() + "(5 - year of birth)");
    }

    public void editEmployeeMessage() {
        System.out.println("Enter option:" + lineSeparator()
                + "(1 - Edit name)" + lineSeparator()
                + "(2 - Edit position)" + lineSeparator()
                + "(3 - Edit salary)" + lineSeparator()
                + "(4 - Back to menu)" + lineSeparator());
    }

    public void mainMenuMessage() {
        System.out.println("Enter option:" + lineSeparator()
                + "(1 - Show employees)" + lineSeparator()
                + "(2 - Add new employee)" + lineSeparator()
                + "(3 - Edit employee)" + lineSeparator()
                + "(4 - Sort employee)" + lineSeparator()
                + "(5 - Exit)" + lineSeparator());
    }

    public void editOrBack(int id) {
        System.out.println("Employee with ID " + id
                + " : already exists." + lineSeparator()
                + "If you want to edit this employee enter 1");
    }

    public void invalidOption() {
        System.out.println("Invalid option.");
    }

    public void editPosition() {
        System.out.println("Enter new position (one of "
                + Arrays.toString(Position.values()) + ") :");
    }

    public String incorrectNumber() {
        return "Incorrect number";
    }
}
