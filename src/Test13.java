/**
 * Created by fanjiangqi on 2017/3/30.
 * 在O(1)时间内删除链表节点
 */
public class Test13 {

    static class  Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    /**
     * 这里需要在O(1)时间内删除节点，所以默认，node节点一定存在与root中
     * @param root 根节点
     * @param node 需要删除的节点
     */
    public static void removeNode(Node root, Node node){
        if (root == null)
            return;

        if (node.next == null){  //node是尾节点的情况,只能通过找到倒数第二个节点来解决
           /**node = null;
            * 提醒：直接这样写是错误的，因为只是把node指向一个新的对象，原来链表并未改变
            * ps: 我怎么感觉C++可以做到啊
            **/
            Node pHead = root;
            while (pHead.next != node){
                pHead = pHead.next;
            }
            pHead.next = null;
        }
        //node不是尾节点的情况
        else {
            node.val = node.next.val;
            node.next = node.next.next;
        }

    }
    //打印链表中的所有元素
    public static void printNode(Node root){
       Node pHead = root;
        while (pHead.next != null){
            System.out.print(pHead.val+ " ");
            pHead = pHead.next;
        }
        System.out.println(pHead.val);
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        Node pHead = root;
        for (int i = 1; i < 6; i++){ //循环结束pHead指向尾部
            pHead.next = new Node(i);
            pHead = pHead.next;
        }
        //System.out.println(pHead.next);
        System.out.println("before delete......");
        printNode(root);
        System.out.println("after delete......");
        removeNode(root,pHead);
        removeNode(root,root.next.next);
        printNode(root);


    }
}
