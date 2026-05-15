public class FinalizeExample {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called before object is garbage collected.");
    }
public static void main(String args[]){
    FinalizeExample f1 = new FinalizeExample();
    f1=null;
    System.gc();

    
}
}