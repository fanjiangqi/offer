package fan.AlgorithmLearn;

import java.util.*;

/**
 * Created by fanjiangqi on 2017/3/25.
 * 二叉树工厂，用来构造二叉树
 */
public class BinaryTreeFactory {

    /**
     * 按层构建二叉树
     * @param arr 给定一个数组arr，用数组中元素按层构建的数组
     * @return 返回head节点
     */
    public static TreeNode newBinaryTreeByLevel(int[] arr){
        LinkedList<TreeNode> queue = new LinkedList<>();
        int index = 0;
        TreeNode head = new TreeNode(arr[index++]);
        queue.offer(head);
        TreeNode node = null;
        while (!queue.isEmpty()){
            node = queue.poll();
            if (index < arr.length) {
                node.left = new TreeNode(arr[index++]);
                queue.offer(node.left);
            }
            if (index < arr.length) {
                node.right = new TreeNode(arr[index++]);
                queue.offer(node.right);
            }
        }

        return head;
    }

    public static TreeNode sortedArrayToBST(int[] num){
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        TreeNode head = BinaryTreeFactory.newBinaryTreeByLevel(arr);
        BinaryTreeBasic.preOrderRecur(head);
        System.out.println();
        BinaryTreeBasic.levelOrderRecur(head);
    }
}
