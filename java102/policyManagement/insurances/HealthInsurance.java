package java102.policyManagement.insurances;

import java.time.LocalDate;

public class HealthInsurance extends Insurance {
    private String healthCondition;
    private boolean coverageForPreExistingCondition;
    private double coverageLimit;

    public HealthInsurance(String healthCondition,
            boolean coverageForPreExistingCondition, double coverageLimit) {
        super("Health Insurance", 1000, LocalDate.now(), LocalDate.now().plusMonths(2));
        this.healthCondition = healthCondition;
        this.coverageForPreExistingCondition = coverageForPreExistingCondition;
        this.coverageLimit = coverageLimit;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public boolean isCoverageForPreExistingCondition() {
        return coverageForPreExistingCondition;
    }

    public void setCoverageForPreExistingCondition(boolean coverageForPreExistingCondition) {
        this.coverageForPreExistingCondition = coverageForPreExistingCondition;
    }

    public double getCoverageLimit() {
        return coverageLimit;
    }

    public void setCoverageLimit(double coverageLimit) {
        this.coverageLimit = coverageLimit;
    }

    @Override
    public void calculate() {
        double basePrice = getPrice();
        boolean coverageForPreExistingCondition = isCoverageForPreExistingCondition();
        double coverageLimit = getCoverageLimit();
        // calculate the premium based on the base price, coverage for pre-existing
        // condition and coverage limit
        double premium = basePrice;
        if (coverageForPreExistingCondition) {
            premium += (basePrice * 0.05);
        }
        if (coverageLimit < 1000000) {
            premium += (basePrice * 0.03);
        }
        setPrice(premium);
    }

    @Override
    public String toString() {
        return "HealthInsurance [name=" + getName() + ", price=" + getPrice() + ", startDate=" + getStartDate()
                + ", endDate=" + getEndDate()
                + ", healthCondition=" + healthCondition + ", coverageForPreExistingCondition="
                + coverageForPreExistingCondition
                + ", coverageLimit=" + coverageLimit + "]";
    }
}
