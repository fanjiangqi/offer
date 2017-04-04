package fan.AlgorithmLearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by fanjiangqi on 2017/3/22.
 * 自己实现有序的符号表
 * 造轮子的目的：理解二叉树，搜索二叉树和红黑树
 * 1. 先写API
 * 2. 再写测试用例
 * 3. 实现API
 * size 具体功能还未实现
 * keys()方法没理解，还有比如rank()之类方法未实现
 */
public class SortTable<Key extends Comparable<Key>, Value >{
    private Node root; //根节点
    
    public void put(Key key, Value value){
         root = put(root,key,value);
    }
    //太完美的代码了
    private Node put(Node x, Key key, Value value){
        if (x == null) return new Node(key, value, 1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left, key,value);
        else if (cmp > 0) x.right = put(x.right, key, value);
        else x.value = value;
        return x;
    }
    public Value get(Key key){

        return get(root, key);
    }
    private Value get(Node x, Key key){
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return  get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else return x.value;
    }
    public boolean contains(Key key){
        return false;
    }
    public int size(){
        return root.N;
    }
    public Key min(){
        return min(root);
    }
    private Key min(Node x){
       /* if (x.left == null) return x.key;
        return min(x.left);*/
        if (x.left != null)
            return min(x.left);
        else
            return x.key;
    }
    public Key max(){
        return max(root);
    }
    private Key max(Node x){
        if (x.right == null) return x.key;
        return max(x.right);
    }
    public Iterable<Key> keys(){

        return keys(min(),max());
    }
    public Iterable<Key> keys(Key lo, Key hi){
        //queue 放在这边的原因是下面需要递归，不然会new很多queue
        Queue<Key> queue = new LinkedList<Key>();
         keys(root, queue, lo, hi );
        return queue;
    }
    private void keys(Node x, Queue<Key> queue,Key lo, Key hi){
        if (x == null) return;
        int cmplo = lo.compareTo(x.key);
        int cmphi = hi.compareTo(x.key);
        if (cmplo < 0) keys(x.left,queue,lo, hi);
        if (cmplo <= 0 && cmphi >= 0) queue.add(x.key);
        if (cmphi > 0) keys(x.right, queue, lo, hi);


    }
    private class Node{
        private Node left, right;
        private Key key;
        private Value value;
        private int N;   //以该节点为根的子树中的节点数

        public Node(Key key, Value value, int n) {
            this.key = key;
            this.value = value;
            N = n;
        }
    }

    
    public static void main(String[] args) {
        SortTable<String, Integer> st = new SortTable<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; sc.hasNext(); i++){
            String key = sc.next();
            st.put(key,i);
        }
        sc.close();
        for (String s : st.keys())
            System.out.println(s + ":" +st.get(s));
    }
}
