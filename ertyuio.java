import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.util.Scanner;

public class ertyuio {
    public static void main(String[] args)
//            throws FileNotFoundException
    {
//        File file = new File("test");
//        try {
//            Scanner scanner = new Scanner(file);
//            System.out.println("after scanner");
//        } catch (FileNotFoundException e) {
//            System.out.println("file not found");
//        }
//        System.out.println("after try catch");

//        System.out.println(getError());

//        1. File file = new File("test");
//        Scanner scanner;
//        try {
//            scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//       try {
//           getError();
//       } catch (FileNotFoundException e){
//        throw new RuntimeException();
//    }

       Scanner console = new Scanner(System.in);

       while(true) {
           int x = Integer.parseInt(console.nextLine());
           if (x != 4) {
               try {
                   throw new IOException();
               } catch (IOException e) {
                   System.out.println("please re-enter the data");
               }
           }
       }
    }
    public static void getError() throws FileNotFoundException {
        File file = new File("test1");
        Scanner scanner = new Scanner(file);
    }
    public  class ScannerException extends ertyuio { //створила інший клас щоб створити свій іксепшн

    }

}

