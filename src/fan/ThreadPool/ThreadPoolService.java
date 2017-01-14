package fan.ThreadPool;

import java.util.ArrayList;
import java.util.List;
/**
 * 在创建的时候就创建了几个线程对象，但是线程并没有启动运行。
 * 在调用了start方法启动线程池服务之后，它们才真正运行。
 * stop方法可以停止线程池服务，同时通知池中所有线程的运行。
 * runTask(Task task)将一个新的待执行任务交与线程池来运行。
 */

public class ThreadPoolService {
    public enum Status{
        NEW,
        RUNNING,
        TERMINATED
    }
    //线程数
    public static final int THREAD_COUNT=5;
    //线程池状态
    private Status status=Status.NEW;
    private TaskQueue queue=new TaskQueue();
    private List<Thread> threads=new ArrayList<Thread>();
    public ThreadPoolService(){
        for(int i=0;i<THREAD_COUNT;i++){
            Thread t=new TaskThread(this);
            threads.add(t);
        }
    }
    //启动服务
    public void start(){
        this.status=Status.RUNNING;
        for(int i=0;i<THREAD_COUNT;i++){
            threads.get(i).start();
        }
    }
    //停止服务
    public void stop(){
        this.status=Status.TERMINATED;
    }
    //是否在运行
    public boolean isRunning(){
        return status==Status.RUNNING;
    }
    //执行任务
    public void runTask(Task task){
        queue.addTask(task);
    }

    protected TaskQueue getTaskQueue(){
        return queue;
    }
}



