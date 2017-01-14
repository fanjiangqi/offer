import java.util.Stack;

/**
 * Created by fanjiangqi on 2016/12/29.
 * 用两个栈实现队列
 * 解思路：把push的数据全部放到stack1中，如果要pop，判断stack2中是否
 * 为空，如果为空，把stack1中全部pop-push到stack2中，
 * 如果不为空，直接pop stack2中
 * 之后如果要添加，继续放到stack1中
 */
public class Test07 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(!stack2.empty())
            return stack2.pop();
        else {
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        Test07 queue = new Test07();
        queue.push(7);
        int t1 = queue.pop();
        System.out.println(t1);
    }
}
