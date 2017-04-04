import fan.AlgorithmLearn.Lis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by fanjiangqi on 2016/12/26.
 * 从尾到头打印链表
 */
public class Test05 {
    //private static List<Integer> list = new LinkedList<>();
    public static ArrayList<Integer> printListReverse(Node root){
          LinkedList<Integer> stack = new LinkedList<>();
          ArrayList<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        Node nRoot = root;
        while (nRoot.next != null) {
            stack.addLast(nRoot.value);
            nRoot = nRoot.next;
        }
        stack.addLast(nRoot.value);  //添加最后一个节点
        for (int i = stack.size(); i > 0; --i){
            list.add(stack.removeLast());
        }
        return list;
    }
    //隐式使用递归代替显示的stack
    private static ArrayList<Integer> list = new ArrayList<>();
    public static void printListReverse2(Node root){
        if (root.next != null)
            printListReverse2(root.next);

            System.out.println(root.value);
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        Node nRoot = root;  // root的副本
        for (int i = 1; i < 10; ++i){
            nRoot.next = new Node(i);
            nRoot = nRoot.next;
        }
       /* ArrayList<Integer> list = printListReverse(root);
        for (int a : list){
            System.out.println(a);
        }*/
        printListReverse2(root);

    }

}

 class Node{
    Node next;
    int value;

    public Node(int value) {
        this.value = value;
    }
}
