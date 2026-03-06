import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class IOexp {
    public static void main(String args[]){
        System.out.println("Hello World");
//         try{
// //  FileReader fr=new FileReader("C:/Users/AAhmad/hello.txt");
// //       fr.read();
// //       int i;
// //     while((i=fr.read())!=-1){
// //       System.out.print((char)i);
// // wrtite somtheing in the file
// Scanner sc=new Scanner (System.in);
// FileWriter fw=new FileWriter("C:/Users/AAhmad/hello.txt");
// System.out.println("enter the string to write in the file ");
// String str=sc.nextLine();
// fw.write(str);
// fw.close();
// System.out.println("File write successfully operations");
//         }
//         catch(IOException e){
// System.out.println("File IO Exception occured");
//         }
       
// class not found exception example
// try{
// Class.forName("TestClass");
// }
// catch(ClassNotFoundException e){
// System.out.println("Class not found exception occurred");
// }
// file not found exception example

// try{
// FileReader fr=new FileReader("C:/Users/AAhmad/abc.txt");
// fr.close();
// }
// catch(Exception e){
//     System.out.println("File not found exception occurred");
// }
// parse exceptions excecption example
SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
try {
    Date  d=df.parse("yyyy/02/2000");
} catch (ParseException e) {

    System.out.println("Parse exception occurred");
}

    }

}
    
