package fan.ThreadPool;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 任务队列，在同一时刻，可能有很多任务需要执行，而程序在同一时刻只能执行一定数量的任务，
 * 当需要执行的任务数超过了程序所能承受的任务数后怎么办，这就有了先执行那些任务，后执行
 * 那些任务的规则。TaskQueue类就是这些规则中的一种，采用了FIFO(先进先出)，也就是按照
 * 任务到达的先后顺序执行。
 */
public class TaskQueue {

    private List<Task> queue=new LinkedList<Task>();

    //添加一项任务
    public synchronized void addTask(Task task){
        if(task!=null){
            queue.add(task);
        }
    }
    //完成任务后将它从任务队列中删除
    public synchronized void finishTask(Task task){
        if(task!=null){
            task.setState(Task.State.FINISHED);
            queue.remove(task);
        }
    }
    //取得一项待执行任务
    public synchronized Task getTask(){
        Iterator<Task> iterator=queue.iterator();
        Task task;
        while(iterator.hasNext()){
            task=iterator.next();
            //寻找一个新建的任务
            if(Task.State.NEW.equals(task.getState())){
                //把任务状态置为运行中
                task.setState(Task.State.RUNNING);
                return task;
            }
        }
        return null;
    }
}