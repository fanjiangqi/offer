package fan.difficulty;

/**
 * Created by fanjiangqi on 2017/3/23.
 * 学习克隆方法
 * 原来疑惑：clone()方法没有进行处理，只是调用了super.clone(),怎么就可以clone()了？
 * 答案： Object类中的clone()通过native方法实现
 */
public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Obj a = new Obj();
        Obj b = (Obj) a.clone();

        b.changeAnInt();
        System.out.println(a.getAnInt() );
        System.out.println(b.getAnInt());
    }
}
class Obj implements Cloneable{
    private int anInt = 0;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }
    public void changeAnInt(){
        anInt = 1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
