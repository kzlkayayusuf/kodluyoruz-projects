package java102.patikaStore;

import java.util.Scanner;

import java102.patikaStore.brands.Brand;
import java102.patikaStore.management.Store;
import java102.patikaStore.products.Notebook;
import java102.patikaStore.products.Smartphone;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        Scanner input = new Scanner(System.in);

        // added given brands
        String[] brandNames = { "Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster" };
        for (int i = 0; i < brandNames.length; i++) {
            Brand brand = new Brand(i + 1, brandNames[i]);
            store.addBrand(brand);
        }

        int choice = -1;
        while (choice != 0) {
            store.displayMenu();
            choice = input.nextInt();
            switch (choice) {
                // handle notebook operations
                case 1:
                    System.out.println("1 - Add notebook");
                    System.out.println("2 - Remove notebook by ID");
                    System.out.println("3 - List all notebooks");
                    System.out.print("Enter your choice: ");
                    int notebookChoice = input.nextInt();
                    switch (notebookChoice) {
                        case 1:
                            System.out.print("Enter notebook brand ID: ");
                            int brandId = input.nextInt();
                            Brand notebookBrand = null;
                            for (Brand b : store.getBrands()) {
                                if (b.getId() == brandId) {
                                    notebookBrand = b;
                                    break;
                                }
                            }
                            if (notebookBrand == null) {
                                System.out.println("Invalid brand ID. Please try again.");
                                break;
                            }
                            System.out.print("Enter notebook name: ");
                            input.nextLine(); // to consume the remaining newline character
                            String notebookName = input.nextLine();
                            System.out.print("Enter notebook price: ");
                            double notebookPrice = input.nextDouble();
                            System.out.print("Enter notebook discount: ");
                            double notebookDiscount = input.nextDouble();
                            System.out.print("Enter notebook stock: ");
                            int notebookStock = input.nextInt();
                            System.out.print("Enter notebook RAM: ");
                            int notebookRam = input.nextInt();
                            System.out.print("Enter notebook storage: ");
                            int notebookStorage = input.nextInt();
                            System.out.print("Enter notebook screen size: ");
                            double notebookScreenSize = input.nextDouble();
                            Notebook notebook = new Notebook(store.getProducts().size() + 1, notebookPrice,
                                    notebookDiscount,
                                    notebookStock, notebookName.toUpperCase(), notebookBrand, notebookRam,
                                    notebookStorage,
                                    notebookScreenSize);
                            store.addProduct(notebook);
                            break;
                        case 2:
                            System.out.print("Enter notebook ID: ");
                            int notebookId = input.nextInt();
                            store.removeProduct(notebookId);
                            break;
                        case 3:
                            store.listNotebooks();
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    break;
                // handle smartphone operations
                case 2:
                    System.out.println("1 - Add Smartphone");
                    System.out.println("2 - Remove Smartphone by ID");
                    System.out.println("3 - List all smartphones");
                    System.out.print("Enter your choice: ");
                    int smartphoneChoice = input.nextInt();
                    switch (smartphoneChoice) {
                        case 1:
                            System.out.print("Enter smartphone brand ID: ");
                            int brandId = input.nextInt();
                            Brand smartphoneBrand = null;
                            for (Brand b : store.getBrands()) {
                                if (b.getId() == brandId) {
                                    smartphoneBrand = b;
                                    break;
                                }
                            }
                            if (smartphoneBrand == null) {
                                System.out.println("Invalid brand ID. Please try again.");
                                break;
                            }
                            System.out.print("Enter smartphone name: ");
                            input.nextLine(); // to consume the remaining newline character
                            String smartphoneName = input.nextLine();
                            System.out.print("Enter smartphone price: ");
                            double smartphonePrice = input.nextDouble();
                            System.out.print("Enter smartphone discount: ");
                            double smartphoneDiscount = input.nextDouble();
                            System.out.print("Enter smartphone stock: ");
                            int smartphoneStock = input.nextInt();
                            System.out.print("Enter smartphone memory: ");
                            int smartphoneMemory = input.nextInt();
                            System.out.print("Enter smartphone screen size: ");
                            double smartphoneScreenSize = input.nextDouble();
                            System.out.print("Enter smartphone battery: ");
                            int smartphoneBattery = input.nextInt();
                            System.out.print("Enter smartphone RAM: ");
                            int smartphoneRam = input.nextInt();
                            System.out.print("Enter smartphone color: ");
                            input.nextLine(); // to consume the remaining newline character
                            String smartphoneColor = input.nextLine();
                            Smartphone smartphone = new Smartphone(store.getProducts().size() + 1, smartphonePrice,
                                    smartphoneDiscount, smartphoneStock, smartphoneName.toUpperCase(),
                                    smartphoneBrand,
                                    smartphoneMemory, smartphoneScreenSize, smartphoneBattery, smartphoneRam,
                                    smartphoneColor);
                            store.addProduct(smartphone);
                            break;
                        case 2:
                            System.out.print("Enter smartphone ID: ");
                            int smartphoneId = input.nextInt();
                            store.removeProduct(smartphoneId);
                            break;
                        case 3:
                            store.listSmartphones();
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    break;
                case 3:
                    store.listBrands();
                    break;
                case 4:
                    store.listProducts();
                    break;
                case 5:
                    System.out.print("Enter brand name: ");
                    input.nextLine(); // to consume the remaining newline character
                    String brandName = input.nextLine();
                    store.filterProducts(brandName);
                    break;

                case 0:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        input.close();
    }
}
