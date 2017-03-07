package fan.test;

/**
 * Created by fanjiangqi on 2017/2/07.
 * 继承和多态的理解
 */
public class Fan1 {
    public static void main(String [] args){
        B b = new B();
        System.out.println(b.getValue());
        b.value = 10;
        System.out.println(b.value);
        b.showValue();
    }
    static class A{
        protected int value;
        public A(int v) {
            setValue(v);
        }
        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            try{
                value++;
                return value;
            } catch(Exception e){
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A{
        public B() {
            super(5);
            setValue(getValue() - 3);
        }
        public void setValue(int value){
            super.setValue(2 * value);
        }
        public void showValue(){
            System.out.println(super.value);
        }

    }
}
