/**
 * Created by fanjiangqi on 2016/12/26.
 */
public class Test09 {
    public static int fibonacci(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
