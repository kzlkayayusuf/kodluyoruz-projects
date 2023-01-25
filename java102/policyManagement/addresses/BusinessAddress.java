package java102.policyManagement.addresses;

public class BusinessAddress implements Address {

    private String street;
    private String city;
    private String country;
    private String postalCode;
    private String companyName;

    public BusinessAddress(String street, String city, String country, String postalCode, String companyName) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.companyName = companyName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessAddress [street=" + street + ", city=" + city + ", country=" + country + ", postalCode="
                + postalCode + ", companyName=" + companyName + "]";
    }
}
