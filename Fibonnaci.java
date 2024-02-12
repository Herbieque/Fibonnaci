import java.util.Scanner; 
public class Fibonnaci {
    public static void main(String[] args){
       
            for (String input: args) {
             int size = Integer.parseInt(input); 
            
            int[] fib = new int[size+1]; 
           if (size < 0){
            System.out.println("Input must be a positive integer"); 
           } 
           else if (size == 0){
                System.out.println(fib[size]);
            }
           else {
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < size+1; i++){
                fib[i] = fib[i-1] + fib[i-2]; 
            }
            System.out.println(fib[size]); 

        }
      }
    }

}
