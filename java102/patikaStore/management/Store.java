package java102.patikaStore.management;

import java.util.ArrayList;
import java.util.Collections;

import java102.patikaStore.brands.Brand;
import java102.patikaStore.products.Notebook;
import java102.patikaStore.products.Product;
import java102.patikaStore.products.Smartphone;

public class Store {

    private ArrayList<Brand> brands;
    private ArrayList<Product> products;

    public Store() {
        brands = new ArrayList<>();
        products = new ArrayList<>();
    }

    public void addBrand(Brand brand) {
        if (brand == null) {
            System.out.println("Invalid brand object");
            return;
        }
        for (Brand b : brands) {
            if (b.getId() == brand.getId()) {
                System.out.println("Brand already exists in the system");
                return;
            }
        }
        brands.add(brand);
        System.out.println("Brand added successfully");
    }

    public void addProduct(Product product) {
        if (product == null) {
            System.out.println("Invalid product object");
            return;
        }
        for (Product p : products) {
            if (p.getId() == product.getId()) {
                System.out.println("Product already exists in the system");
                return;
            }
        }
        products.add(product);
        System.out.println("Product added successfully");
    }

    public void removeProduct(int id) {
        Product productToRemove = null;
        for (Product p : products) {
            if (p.getId() == id) {
                productToRemove = p;
                break;
            }
        }
        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Product removed successfully");
        } else {
            System.out.println("Product not found in the system");
        }
    }

    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("No products found in the system");
            return;
        }
        String format = "| %-5s | %-20s | %-15s | %-10s | %-10s | %-15s | %-15s |\n";
        System.out.format(format, "ID", "Name", "Price", "Discount", "Stock", "Brand", "Type");
        for (Product p : products) {
            System.out.format(format, p.getId(), p.getName(), p.getPrice() + " TL", p.getDiscount(), p.getStock(),
                    p.getBrand().getName(), p.getClass().getSimpleName());
        }
    }

    public void listNotebooks() {
        String format = "| %-5s | %-20s | %-15s | %-8s | %-8s | %-15s | %-8s | %-8s | %-8s |\n";
        System.out.format(format, "ID", "Name", "Price", "Discount", "Stock", "Brand", "RAM", "Storage", "Screen Size");
        for (Product p : products) {
            if (p instanceof Notebook) {
                Notebook n = (Notebook) p;
                System.out.format(format, n.getId(), n.getName(), n.getPrice() + " TL", n.getDiscount(), n.getStock(),
                        n.getBrand().getName(), n.getRam(), n.getStorage(), n.getScreenSize());

            }
        }
    }

    public void listSmartphones() {
        String format = "| %-5s | %-20s | %-15s | %-8s | %-8s | %-15s | %-8s | %-8s | %-8s | %-8s | %-8s |\n";
        System.out.format(format, "ID", "Name", "Price", "Discount", "Stock", "Brand", "Memory", "Screen Size",
                "Battery", "RAM", "Color");
        for (Product p : products) {
            if (p instanceof Smartphone) {
                Smartphone s = (Smartphone) p;
                System.out.format(format, s.getId(), s.getName(), s.getPrice() + " TL", s.getDiscount(), s.getStock(),
                        s.getBrand().getName(), s.getMemory(), s.getScreenSize(), s.getBatteryPower(), s.getRam(),
                        s.getColor());
            }
        }
    }

    public void filterProducts(String brandName) {
        if (brandName == null || brandName.trim().isEmpty()) {
            System.out.println("Invalid brand name");
            return;
        }
        ArrayList<Product> filteredProducts = new ArrayList<>();
        for (Product p : products) {
            if (p.getBrand().getName().equalsIgnoreCase(brandName)) {
                filteredProducts.add(p);
            }
        }
        if (filteredProducts.isEmpty()) {
            System.out.println("No products found with the given brand name");
            return;
        }
        String format = "| %-5s | %-20s | %-15s | %-10s | %-10s | %-15s | %-15s |\n";
        System.out.format(format, "ID", "Name", "Price", "Discount", "Stock", "Brand", "Type");
        for (Product p : filteredProducts) {
            System.out.format(format, p.getId(), p.getName(), p.getPrice() + " TL", p.getDiscount(), p.getStock(),
                    p.getBrand().getName(), p.getClass().getSimpleName());
        }
    }

    public void listBrands() {
        if (brands.isEmpty()) {
            System.out.println("No brands found in the system");
            return;
        }
        Collections.sort(brands, (b1, b2) -> b1.getName().compareTo(b2.getName()));
        String format = "| %-5s | %-15s |\n";
        System.out.format(format, "ID", "Name");
        for (Brand b : brands) {
            System.out.format(format, b.getId(), b.getName());
        }
    }

    public void displayMenu() {
        System.out.println("#################################################");
        System.out.println("PatikaStore Product Management Panel!");
        System.out.println("1 - Notebook Operations");
        System.out.println("2 - Smartphone Operations");
        System.out.println("3 - List all brands");
        System.out.println("4 - List all products");
        System.out.println("5 - Filter products by brandName");
        System.out.println("0 - Exit");
        System.out.println("#################################################");
        System.out.print("Enter your choice: ");
    }

    public ArrayList<Brand> getBrands() {
        return brands;
    }

    public void setBrands(ArrayList<Brand> brands) {
        this.brands = brands;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
