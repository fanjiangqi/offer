package fan.ThreadPool;

/*
 * TaskThread是线程池中默认的线程处理程序，
 * 是执行任务的线程，专门用于执行任务队列中的待执行任务
 * 不断地从任务队列中取出任务，然后执行
 */
public class TaskThread extends Thread {
    //该线程所属的线程池
    private ThreadPoolService service;
    public TaskThread(ThreadPoolService tps){
        this.service=tps;
    }
    public void run(){
        //在线程池运行的状态下执行 任务队列中的任务
        while(service.isRunning()){
            TaskQueue queue=service.getTaskQueue();
            Task task=queue.getTask();
            if(task!=null){
                task.deal();
            }
            queue.finishTask(task);
        }
    }
}
