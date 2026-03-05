import java.io.FileReader;

public class IOexp {
    public static void main(String args[]){
        System.out.println("Hello World");
        try{
 FileReader fr=new FileReader("C:/Users/AAhmad/hello.txt");
      fr.read();
      int i;
    while((i=fr.read())!=-1){
      System.out.print((char)i);
    }
        }catch(Exception e){
System.out.println("File read error");
        }
       
    }

}
    
