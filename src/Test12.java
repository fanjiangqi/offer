/**
 * Created by fanjiangqi on 2017/3/30.
 * 打印1到最大的n位数
 * ps: 大数问题，不会做3.30号
 */
public class Test12 {

    public static void print1ToMaxOfNDigits(int n){
        if (n <= 0)
            throw new IllegalArgumentException("输入数据错误，应该大于等于1");
        char[] num = new char[n];
        for (int i = 0; i< n-1; i++){
            num[i] = '0';
        }


    }
}
