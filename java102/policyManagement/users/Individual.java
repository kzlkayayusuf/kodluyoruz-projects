package java102.policyManagement.users;

import java102.policyManagement.insurances.Insurance;

public class Individual extends Account {
    public Individual(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        // Apply individual pricing and margin calculation
        double price = insurance.getPrice() * 1.05;
        insurance.setPrice(price);
        super.insurances.add(insurance);
    }
}
