public class inner_outermost {
    public static int f(int n, int m){
        if(n == 0){
            return 0;
        }
        else{
            return f(n-1, f(n,m));
        }
    }
    public static void main(String[] args) {
        System.out.println(f(1,1)); // Java uses innermost
    }
}
