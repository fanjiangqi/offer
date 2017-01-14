

/**
 * Created by fanjiangqi on 2016/12/23.
 */
//实现单例模式
public class Test02 {
    /**
     * 单例模式，饿汉式，线程安全
     * 饿汉式,是在不管你用的用不上，一开始就建立这个单例对象
     */
    public static class Singleton{
        private final static Singleton instance = new Singleton();
        private Singleton(){

        }
        public static Singleton getInstance(){
            return instance;
        }
    }

    /**
     * 单例模式，懒汉式，线程不安全
     * 懒汉式,是在你真正用到的时候才去建这个单例对象
     */
    public static class Singleton2{
        private static Singleton2 instance = null;
        private Singleton2(){

        }
        public  static Singleton2 getInstance(){
            if(instance == null){
                instance = new Singleton2();
            }
            return  instance;
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
        System.out.println(Singleton2.getInstance() ==Singleton2.getInstance());
    }
}
