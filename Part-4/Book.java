class Book{
    String title;
    String author;
    double price;


    Book(String title, String author, double price){
         this.title = title;
         this.author = author;
         this.price = price;
    }


    void display(){
        System.out.println("Book Title "+ title);
        System.out.println("Book Author "+ author);
        System.out.println("Book Price "+ price);
    }


    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 399);
        Book b2 = new Book("Atomic Habits", "James Clear", 499);
        Book b3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 599);

        b1.display();
        b2.display();
        b3.display();

        Book cheapest = b1;

        if (b2.price < cheapest.price) {
            cheapest = b2;
        }

        if (b3.price < cheapest.price) {
            cheapest = b3;
        }

        System.out.println("Cheapest Book: " + cheapest.title + " by " + cheapest.author + " @ Rs." + cheapest.price);
    }
}