import java.io.*;

public class WriteExample{
    public static void main(String[] args) {
       
       File f1 = new File("Sample.txt");
        if(f1.exists()){
        System.out.println("File Available");
           }

        try {

            FileWriter fw = new FileWriter("sample.txt",true);
            fw.write("\nAnsh Chut paglu");
            fw.close();

            FileReader fr = new FileReader("sample.txt");
            //BufferedReader br = new BufferedReader(fr);

            int ch;
         int count = 0;

         while ((ch = fr.read()) != -1) {
         System.out.print((char) ch);
    count++;
}


            System.out.println("Total character : "+ count);

            
            //br.close();
            fr.close();
            

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }
}