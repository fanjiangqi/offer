package fan.ThreadPool;

/**
 *  这是代表任务的抽象类，定义了一个deal方法，继承Task抽象类的子类
 *  需要实现这个方法，并把这个任务需要完成的具体工作在deal方法中实现。
 *  线程池中的线程之所以被创建，就是为了执行各种各样的任务，为了方便线程对任务的处理，
 *  需要用一个Task抽象类来保证任务的具体工作同一放在deal方法中来完成。
 */
public abstract class Task {
    public enum State{
        /*新建*/NEW,
        /*运行*/RUNNING,
        /*结束*/FINISHED
    }
    /*
     * 任务状态
     */
    private State state=State.NEW;

    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public abstract void deal();
}
