package fan.AlgorithmLearn;

/**
 * Created by fanjiangqi on 2017/3/7.
 * 阿里面试题
 * 题目：一个整型数组，将其划分为和相同的4个切片，例如：{ 2, 3, 5, 1, 2, 2, 1, 1, 3 }，
 * 切片操作后划分为：{2,3}，{5}，{1,2,2}，{1,1,3}，也就找到所谓的四等分点。
 * 只不过输出结果为true或者false（是否能得到这样的4个切片）。
 * 同时要求时间复杂度和空间复杂度为o(n)。
 */
public class ArrayToFour {
    static boolean resolve(int[] a){
        int sum = 0;
        for (int i=0; i<a.length;i++){
            sum +=a[i];
        }
        int iSum = sum/4;
        int flag = 0;
        if(iSum != 0)
            return false;

        for (int i =0,sum1=0; sum1 != iSum; i++){
            sum1 +=a[i];
            flag = i;
        }
        flag++;
        return true;
    }
    static  boolean resolve1(int[] a ){
        if (a.length < 5)return false;
        int m1 = 0;
        int m2 = 1;
        int m3 = 2;
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        int sumD = 0;
        int length = a.length;
        for (int i = 3; i < length; i++)
            sumD += a[i];
            while (true){
                if (sumC < sumD){
                    sumC += a[m3];
                    sumD -= a[m3 + 1];
                    ++m3;
                    if(m3 == length-1 )
                        break;
                    else
                        continue;
                }
                if (sumB < sumC){
                    sumB += a[m2];
                    sumC -= a[m2 + 1];
                    ++m2;
                    if(m2 == m3-1 )
                        break;
                    else
                        continue;
                }
                if (sumA< sumB){
                    sumA += a[m1];
                    sumB -= a[m1 + 1];
                    ++m1;
                    if(m1 == m2-1 )
                        break;
                    else
                        continue;
                }
                if (sumA == sumB && sumB == sumC && sumC ==sumD)
                    return true;
            }

        return false;
    }
    static boolean resolve2(int[] a){
       if (a.length < 4) return false;
        int length = a.length;
         int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int m1 = 1; m1 < length - 1; m1++){
            sum1 = sum(a, 0, m1 - 1 );
            for (int m2 = m1 + 2; m2 < length - 1; m2++){
                sum2 = sum(a, m1 + 1, m2 - 1);
                for (int m3 = m2 + 2; m3 < length - 1; m3++){
                    sum3 = sum(a, m2 + 1, m3 - 1);
                    sum4 = sum(a, m3 + 1, length - 1);
                    if (sum1 == sum2 && sum1 == sum3 && sum1 == sum4)
                        return true;
                }
            }
        }
        return false;
    }
    static int sum(int[] a, int lo, int hi){
        int sum = 0;
        for (int i =lo; i <= hi; i++){
            sum +=a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {2,5,1,1,1,1,4,1,7,3,7};
        int[] b = {10,2,11,13,1,1,1,1,1};
        int[] c = {1,1,1};
       System.out.println(resolve1(a));
        System.out.println(resolve1(b));
        System.out.println(resolve1(c));
       /* System.out.println(resolve2(a));
        System.out.println(resolve2(b));
        System.out.println(resolve2(c));*/
    }
}
