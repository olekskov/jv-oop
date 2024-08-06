package core.basesyntax.prTask2;

public enum Position {
    MANAGER,
    DEVELOPER,
    DESIGNER,
    TESTER,
    INTERN,
    TEAM_LEAD,
    PRODUCT_OWNER,
    UX_RESEARCHER,
    DATA_ANALYST,
    DEV_OPS;

    @Override
    public String toString() {
        return name().substring(0, 1) + name().substring(1).toLowerCase();
    }
}