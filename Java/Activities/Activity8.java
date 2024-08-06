package Activities;

class CustomException extends Exception {
    private String message = null ;
    public CustomException(String message) {
        this.message = message;

}
@Override
public String getMessage() {
    return message;

}
}
public class Activity8 {


    
    public static void main(String[] a){
        try {
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("Won't execute");
        } catch(CustomException myexc) {
            System.out.println("Inside catch block: " + myexc.getMessage());
        }
    }
        
            
       
    }

    