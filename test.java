
import java.util.Arrays;
public class Test {

    public static void main(String[] args) {
        
        String s = "X|7/|9-|X|-8|8/|-6|X|X|X||81";
        String[] parts = s.split("\\|");
        int count = 0;
        for (int i = 0; i < parts.length; i++) {
          String c = parts[i]; 
          if(c.equals("X")) count += 10;
          else{
             if(c.equals("")) System.out.println("b: ");
             else if(c.charAt(1) == '/') count += 10 + Character.getNumericValue(c.charAt(0));
             else {
                count += c.charAt(0) != '-' ? Character.getNumericValue(c.charAt(0)) : 0 ;
                count += c.charAt(1) != '-' ? Character.getNumericValue(c.charAt(1)) : 0 ;
             }
          }
     
        System.out.println("ca: "+ c);
        System.out.println("add: "+ count);  
        } 
        System.out.println("total: "+ count);  
    }
}
