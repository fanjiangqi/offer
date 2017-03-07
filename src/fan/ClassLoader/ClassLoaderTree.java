package fan.ClassLoader;

/**
 * Created by fanjiangqi on 2017/2/17.
 * 打印类加载器结构
 */
public class ClassLoaderTree {
    public static void main(String[] args) {
        ClassLoader loader = ClassLoaderTree.class.getClassLoader();
        while (loader != null){
            System.out.println(loader.toString());
            loader = loader.getParent();
        }
    }
}
