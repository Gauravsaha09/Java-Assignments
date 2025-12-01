// 3️⃣ A mobile shop manages inventory of phones (brand, model, RAM, price). Accept details of N phones, and display all phones 
// under budget price entered by user.


import java.util.Scanner;

class phones {
    String brand;
    String model;
    int RAM;
    double price;

    public phones(String brand, String model, int RAM, double price) {
        this.brand = brand;
        this.model = model;
        this.RAM = RAM;
        this.price = price;
    }

    void display() {
        System.out.println("Phone Brand : " + brand);
        System.out.println("Phone Model : " + model);
        System.out.println("Phone RAM   : " + RAM + "GB");
        System.out.println("Phone Price : " + price);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating fixed phone objects
        phones iphone = new phones("iPhone", "2025", 12, 90000);
        phones Samsung = new phones("Samsung", "2024", 8, 80000);
        phones Mi = new phones("Mi", "2023", 6, 60000);
        phones Realme = new phones("Realme", "2022", 4, 50000);

        // Array of all phones
        phones[] list = { iphone, Samsung, Mi, Realme };

        // User budget
        System.out.print("Enter your budget: ");
        double budget = sc.nextDouble();

        System.out.println("\nPhones under your budget:\n");

        boolean found = false;

        for (phones p : list) {
            if (p.price <= budget) {
                p.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No phones found under your budget.");
        }

        sc.close();
    }
}
