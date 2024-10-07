public class Fibonacci {

public static int f(int n) {
    if(n<0 || n > 45){
        throw new IllegalArgumentException("n should be between 0 and 45");
    }
    if(n == 0 || n == 1) {
        return 1;
    } else {
        return f(n-1) + f(n-2);
    }
}
public static void main(String args[]){
       for(int i = 0; i<= 100; i++){
        System.out.println("Fibonacci(" + i + ") = " + f(i));
       }
    }
}
