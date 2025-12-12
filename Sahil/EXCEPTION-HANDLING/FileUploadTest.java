
import java.util.Scanner;

class FileTooLargeException extends Exception{
    public FileTooLargeException(){
        super("File Size too large! Max allowed 20 MB.");
    }
}


public class FileUploadTest{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your file size in MB");
        int FileSize = sc.nextInt();

        try {
            if (FileSize > 20) {
                throw new FileTooLargeException();
            }
            else{
        System.out.println("File uploaded successfully!");
            }
        } catch (FileTooLargeException e) {
            System.out.println(e.getMessage());
        }
    }
}