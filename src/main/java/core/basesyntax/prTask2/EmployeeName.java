package core.basesyntax.prTask2;

public enum EmployeeName {
    ALICE, BOB, CHARLIE, DIANA, EVE, FRANK, GRACE, HANK, IVY, JACK;

    @Override
    public String toString() {
        return name().substring(0, 1) +
                name().substring(1).toLowerCase();
    }
}
