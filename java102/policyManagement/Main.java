package java102.policyManagement;

import java.util.ArrayList;
import java.util.List;
import java102.policyManagement.insurances.ResidenceInsurance;
import java102.policyManagement.insurances.TravelInsurance;
import java102.policyManagement.management.Management;
import java102.policyManagement.insurances.HealthInsurance;
import java102.policyManagement.insurances.CarInsurance;
import java102.policyManagement.users.Account;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

                Management management = new Management();
                Scanner sc = new Scanner(System.in);

                int choice = -1;
                while (choice != 0) {
                        management.displayMenu();
                        choice = sc.nextInt();
                        switch (choice) {
                                case 1:
                                        System.out.print("Enter user type (Individual or Enterprise) (I/E): ");
                                        sc.nextLine(); // Clear the buffer
                                        String userType = sc.nextLine();
                                        System.out.print("Enter user name: ");
                                        String name = sc.nextLine();
                                        System.out.print("Enter user surname: ");
                                        String surname = sc.nextLine();
                                        System.out.print("Enter user email: ");
                                        String email = sc.nextLine();
                                        System.out.print("Enter user password: ");
                                        String password = sc.nextLine();
                                        System.out.print("Enter user profession: ");
                                        String profession = sc.nextLine();
                                        System.out.print("Enter user age: ");
                                        int age = sc.nextInt();
                                        String companyName = null;
                                        if (userType.equalsIgnoreCase("E")) {
                                                System.out.print("Enter your company name: ");
                                                sc.nextLine(); // Clear the buffer
                                                companyName = sc.nextLine();
                                        }
                                        management.addUser(userType, name, surname, email, password, profession, age,
                                                        companyName);
                                        break;
                                case 2:
                                        if (management.isHaveAccount()) {
                                                System.out.println("No accounts found in the system");
                                                System.out.println("Please add a user first.");
                                                break;
                                        }
                                        System.out.print("Enter user email: ");
                                        sc.nextLine(); // Clear the buffer
                                        String userEmail = sc.nextLine();
                                        System.out.print("Enter user password: ");
                                        String userPassword = sc.nextLine();
                                        Account account = management.login(userEmail, userPassword);
                                        if (account == null) {
                                                System.out.println();
                                        } else {
                                                System.out.println("Login successful!");
                                                int option = -1;
                                                while (option != 0) {
                                                        management.afterLoginMenu();
                                                        option = sc.nextInt();
                                                        switch (option) {
                                                                case 1:
                                                                        System.out.println("1. Home Address");
                                                                        System.out.println("2. Business Address");
                                                                        System.out.print("Enter your choice: ");
                                                                        int addressChoice = sc.nextInt();
                                                                        sc.nextLine(); // Clear the buffer
                                                                        System.out.print("Enter your street address: ");
                                                                        String streetAddress = sc.nextLine();
                                                                        System.out.print("Enter your city: ");
                                                                        String city = sc.nextLine();
                                                                        System.out.print("Enter your state: ");
                                                                        String state = sc.nextLine();
                                                                        System.out.print("Enter your zip code: ");
                                                                        String zipCode = sc.nextLine();
                                                                        if (addressChoice == 1) {
                                                                                management.addHomeAddress(
                                                                                                account.getUser(),
                                                                                                streetAddress, city,
                                                                                                state,
                                                                                                zipCode);
                                                                        } else if (addressChoice == 2) {
                                                                                System.out.print(
                                                                                                "Enter your company name: ");
                                                                                sc.nextLine(); // Clear the buffer
                                                                                companyName = sc.nextLine();
                                                                                management.addBusinessAddress(
                                                                                                account.getUser(),
                                                                                                companyName,
                                                                                                streetAddress,
                                                                                                city, state, zipCode);
                                                                        } else {
                                                                                System.out.println(
                                                                                                "Invalid choice. Please try again.");
                                                                        }
                                                                        break;
                                                                case 2:
                                                                        System.out.println("1. Car Insurance");
                                                                        System.out.println("2. Health Insurance");
                                                                        System.out.println("3. Residence Insurance");
                                                                        System.out.println("4. Travel Insurance");
                                                                        System.out.print("Enter your choice: ");
                                                                        int insuranceChoice = sc.nextInt();
                                                                        sc.nextLine(); // Clear the buffer
                                                                        if (insuranceChoice == 1) {

                                                                                System.out.print("Enter car name: ");
                                                                                String carMake = sc.nextLine();
                                                                                System.out.print("Enter car model: ");
                                                                                String carModel = sc.nextLine();
                                                                                System.out.print("Enter car age: ");
                                                                                int carAge = sc.nextInt();
                                                                                System.out.print(
                                                                                                "Enter true or false that if coverage for drivers (T/F): ");
                                                                                sc.nextLine(); // Clear the buffer
                                                                                String answer = sc.nextLine();
                                                                                boolean coverageForDrivers;
                                                                                if (answer.equalsIgnoreCase("t")) {
                                                                                        coverageForDrivers = true;
                                                                                } else if (answer.equalsIgnoreCase(
                                                                                                "f")) {
                                                                                        coverageForDrivers = false;
                                                                                } else {
                                                                                        System.out.println(
                                                                                                        "Invalid choice. Please try again.");
                                                                                        break;
                                                                                }
                                                                                System.out.print(
                                                                                                "Enter true or false that if coverage for passengers (T/F): ");
                                                                                sc.nextLine(); // Clear the buffer
                                                                                answer = sc.nextLine();
                                                                                boolean coverageForPassengers;
                                                                                if (answer.equalsIgnoreCase("t")) {
                                                                                        coverageForPassengers = true;
                                                                                } else if (answer.equalsIgnoreCase(
                                                                                                "f")) {
                                                                                        coverageForPassengers = false;
                                                                                } else {
                                                                                        System.out.println(
                                                                                                        "Invalid choice. Please try again.");
                                                                                        break;
                                                                                }

                                                                                account.addInsurance(
                                                                                                new CarInsurance(
                                                                                                                carMake,
                                                                                                                carModel,
                                                                                                                carAge,
                                                                                                                coverageForDrivers,
                                                                                                                coverageForPassengers));
                                                                        } else if (insuranceChoice == 2) {

                                                                                System.out.print(
                                                                                                "Enter health condition: ");
                                                                                String healthCondition = sc.nextLine();
                                                                                System.out.print(
                                                                                                "Enter coverage limit: ");
                                                                                double coverageLimit = sc.nextDouble();
                                                                                System.out.print(
                                                                                                "Enter true or false that if coverage for pre existing condition (T/F): ");
                                                                                sc.nextLine(); // Clear the buffer
                                                                                String answer = sc.nextLine();
                                                                                boolean coverageForPreExistingCondition;
                                                                                if (answer.equalsIgnoreCase("t")) {
                                                                                        coverageForPreExistingCondition = true;
                                                                                } else if (answer.equalsIgnoreCase(
                                                                                                "f")) {
                                                                                        coverageForPreExistingCondition = false;
                                                                                } else {
                                                                                        System.out.println(
                                                                                                        "Invalid choice. Please try again.");
                                                                                        break;
                                                                                }
                                                                                account.addInsurance(
                                                                                                new HealthInsurance(
                                                                                                                healthCondition,
                                                                                                                coverageForPreExistingCondition,
                                                                                                                coverageLimit));
                                                                        } else if (insuranceChoice == 3) {

                                                                                System.out.print(
                                                                                                "Enter building value: ");
                                                                                double buildingValue = sc.nextDouble();
                                                                                System.out.print(
                                                                                                "Enter content value: ");
                                                                                double contentValue = sc.nextDouble();
                                                                                account.addInsurance(
                                                                                                new ResidenceInsurance(
                                                                                                                buildingValue,
                                                                                                                contentValue));
                                                                        } else if (insuranceChoice == 4) {
                                                                                List<String> coveredCountries = new ArrayList<>();
                                                                                System.out.println("Enter countries:");
                                                                                while (sc.hasNextLine()) {
                                                                                        String item = sc.nextLine();
                                                                                        if (item.isEmpty()) {
                                                                                                break;
                                                                                        }
                                                                                        coveredCountries.add(item);
                                                                                }
                                                                                System.out.print("Enter duration: ");
                                                                                int duration = sc.nextInt();
                                                                                account.addInsurance(
                                                                                                new TravelInsurance(
                                                                                                                coveredCountries,
                                                                                                                duration));
                                                                        } else {
                                                                                System.out.println(
                                                                                                "Invalid choice. Please try again.");
                                                                        }

                                                                        break;

                                                                case 3:
                                                                        management.showUserInfo(account);
                                                                        break;
                                                                case 0:
                                                                        account = null;
                                                                        System.out.println("You're exiting!");
                                                                        break;

                                                                default:
                                                                        System.out.println(
                                                                                        "Invalid choice. Please try again!");
                                                                        break;
                                                        }
                                                }
                                        }

                                        break;
                                case 3:
                                        management.listAccounts();
                                        break;
                                case 0:
                                        System.out.println("Exiting the system...");
                                        System.exit(0);
                                        break;
                                default:
                                        System.out.println("Invalid choice. Please try again!");
                                        break;
                        }
                }
                sc.close();
        }
}
