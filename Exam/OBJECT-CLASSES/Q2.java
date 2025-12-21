// 2️⃣ Movie Theatre Booking
// Maintain movie booking details (movieName, seatNo, price).
// Accept booking details of N customers and display total collection for a movie.



class Movie{
    String movieName;
    int seatNo;
    int price;

Movie(String movieName, int seatNo,int price) {
        this.movieName = movieName; 
        this.seatNo = seatNo;
        this.price = price;
    }
void display(){
    System.out.println("movieName" + movieName + "SeatNo" + seatNo + "Price" + price);
   }
    
}


public class Q2{
    public static void main(String[] args) {

        Movie [] m = new Movie[3];

        m [0] = new Movie("Sex Movie", 10, 500);
        m [1] = new Movie("Hot Movie", 11, 600);
        m [2] = new Movie("Sexey Movie", 12, 700);

       
       int totalcollection = 0;


        for (int i = 0; i < m.length; i++) {
            m[i].display();

         totalcollection = totalcollection + m[i].price;
            
        }
        System.out.println("Total Collection : "+ totalcollection);
    }
}