package fan.difficulty;

/**
 * Created by fanjiangqi on 2017/3/23.
 */
public class TestProtected {
    private int anInt;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected void protectedMethod(){
        System.out.println("this is protectedMethod");
    }

    public static void main(String[] args) {
        SonProtected sonProtected = new SonProtected();
        sonProtected.protectedMethod();
    }
}
class SonProtected extends TestProtected{

}
