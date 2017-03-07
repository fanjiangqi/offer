package fan.test;

/**
 * Created by fanji on 2017/2/27.
 */

public class Example {
    String str = new String("good");
    char[] ch = { 'a', 'b', 'c' };
    StringBuilder s = new StringBuilder("fan");

    public static void main(String args[]) {
        //final String a = "abc";
        //a = "def";
        Example ex = new Example();
       // StringBuilder sb = new StringBuilder("abc");
        ex.change(ex.str, ex.ch);
        ex.change(ex.s);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
        System.out.println(ex.s);
        //char ch = 10;
        final char[] value = {1,2,3};
        value[0] = 2;

    }

    public static void change(String str, char ch[])
    {
        str = "test ok";
        //ch[0] = 'g';
        char[] ch1 = { 'd', 'e', 'f' };
        ch = ch1;

    }
    public static void change(StringBuilder sb){
        sb.append("ddd");
    }
}
