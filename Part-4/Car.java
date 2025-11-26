class Car {
    String model;
    String company;
    double price;

    Car(String model, String company, double price){
        this.model = model;
        this.company = company;
        this.price = price;
    }

    void display(){
        System.out.println("Car Model   : " + model);
        System.out.println("Car Company : " + company);
        System.out.println("Car Price   : " + price);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Car c1 = new Car("2025", "BMW", 950000);
        Car c2 = new Car("2024", "Audi", 550000);
        Car c3 = new Car("2023", "Tata", 500000);

        c1.display();
        c2.display();
        c3.display();

        // Find the costliest car
        Car costliest = c1;

        if (c2.price > costliest.price) {
            costliest = c2;
        }

        if (c3.price > costliest.price) {
            costliest = c3;
        }

        System.out.println("Costliest Car: " + costliest.model + " from "+ costliest.company + " @ Rs." + costliest.price);
    }
}
