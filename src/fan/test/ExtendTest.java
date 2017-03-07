package fan.test;

/**
 * Created by fanji on 2017/2/7.
 */
public class ExtendTest extends A{
    public int getTime(){
        return this.time;
    }
    public static void main(String[] args) {
        ExtendTest tx = new ExtendTest();
        System.out.println(tx.getTime());
    }

}
class A{
    protected int time = 5;
}
