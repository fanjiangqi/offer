

/**
 * Created by fanjiangqi on 2017/3/23.
 * 反转链表 Node类在Test5中
 * 值得好好看一看，我的编码能力还是很弱的
 *
 */
public class Test16 {
    public Node ReverseList(Node head) {
        if(head == null || head.next == null)
            return head;
        Node node1, node2, node3;
        node1 = head;
        node2 = node1.next;
        node3 = node2.next;
        node1.next = null;
        while(node2 != null){
            node2.next = node1;
            if(node3 == null)
                return node2;
            else{
                node1 = node2;
                node2 = node3;
                node3 = node2.next;
            }
        }
        return node2;

    }
}

