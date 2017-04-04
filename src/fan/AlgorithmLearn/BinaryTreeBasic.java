package fan.AlgorithmLearn;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by fanjiangqi on 2017/3/25.
 * 二叉树的前序、中序、后序遍历的递归和非递归实现
 */
public class BinaryTreeBasic {
    public static void preOrderRecur(TreeNode head){
        if (head == null)
            return;
        System.out.print(head.val+" ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }
    //按层遍历，相当于图 宽度优先遍历，用列队实现
    public static void levelOrderRecur(TreeNode head){
        if (head == null)
            return;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(head);
        TreeNode node;
        while (!queue.isEmpty()){
            node = queue.poll();
            System.out.println(node.val);
            if (node.left != null){
                queue.offer(node.left);
            }
            if (node.right != null){
                queue.offer(node.right);
            }

        }
        return;
    }

    public static void main(String[] args) {
        int[] vlaue = new int[]{1,2,3,4,5,6,7};
        TreeNode head;
        for (int i = 0; i < vlaue.length - 1; i++){
            head = new TreeNode(1);
           head.left = new TreeNode(2);
       }



    }
}
