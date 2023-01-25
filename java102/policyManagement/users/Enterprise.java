package java102.policyManagement.users;

import java102.policyManagement.insurances.Insurance;

public class Enterprise extends Account {

    private String companyName;

    public Enterprise(User user, String companyName) {
        super(user);
        this.companyName = companyName;
    }

    @Override
    public void addInsurance(Insurance insurance) {
        // Apply enterprise pricing and margin calculation
        double price = insurance.getPrice() * 1.1;
        insurance.setPrice(price);
        super.insurances.add(insurance);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
