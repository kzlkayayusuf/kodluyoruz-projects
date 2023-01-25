package java102.policyManagement.addresses;

import java102.policyManagement.users.User;

public class AddressManager {
    public static void addAddress(User user, Address address) {
        user.getAddresses().add(address);
    }

    public static void removeAddress(User user, Address address) {
        user.getAddresses().remove(address);
    }
}