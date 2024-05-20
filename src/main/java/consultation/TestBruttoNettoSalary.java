package consultation;

public enum TestBruttoNettoSalary {
    TEST_1000(1000, 1000),
    TEST_2500(2500, 2375),
    TEST_4200(4200, 3780),
    TEST_7000(7000, 5950);


    private final double brutto;
    private final double expectedNetto;

    TestBruttoNettoSalary(double brutto, double expectedNetto) {
        this.brutto = brutto;
        this.expectedNetto = expectedNetto;
    }

    public double getBrutto() {
        return brutto;
    }

    public double getExpectedNetto() {
        return expectedNetto;
    }
}
