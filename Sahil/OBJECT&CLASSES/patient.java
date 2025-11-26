// A hospital wants to keep patient records with name, age, disease, and admitted days. Generate total bill based on room charges.
class patient{
    String name;
    int age;
    String disease;
    int days;
    int room_charges;

    patient(String name, int age, String disease, int days, int room_charges){
         this.name = name;
         this.age = age;
         this.disease = disease;
         this.days = days;
         this.room_charges = room_charges;
    }


int totalbill(){
    return days * room_charges;
}

void display(){
    System.out.println("Patient Name : "+ name);
    System.out.println("Patient age : "+ age);
    System.out.println("Patient disease : "+ disease);
    System.out.println("Patient Admitted days : "+ days);
    System.out.println("Patient Room Charges per Day 150 : "+ totalbill());
}   

   
   public static void main(String[] args) {
       patient p1 = new patient("Aman Yadav", 23, "Gand mein kida", 69, 150);
      

      p1.display();
   }

}