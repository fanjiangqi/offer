/**
 * Created by fanjiangqi on 2016/12/26.
 * 重建二叉树
 */
public class Test06 {
    public static class ResetBinaryTree {
        public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
            if(pre.length == 0) return null;
            return reConstructBinaryTree(pre,in,0,pre.length-1);

        }
        public TreeNode reConstructBinaryTree(int [] pre,int [] in, int lo, int hi){

            // L = len;
            int rootVal = pre[lo];//前序第一个是根节点
            TreeNode root = new TreeNode(rootVal);
            if(hi == lo) return root;
            int midIndex = lo ;
            //中序找和root相等的值
            for(int i = lo; i <= hi; i++){
                if(rootVal == in[i] ) {
                    midIndex = i;
                    break;
                }
            }
         /*int left_pre[] = new int[midIndex];
         for
         int left_in[] = new int[midIndex];*/
            if(midIndex == lo) return null;
            else root.left = reConstructBinaryTree(pre,in,lo,midIndex-1);
            if(midIndex == hi) return null;
            else root.right = reConstructBinaryTree(pre,in,midIndex+1,hi);
            return root;
        }





        // Definition for binary tree
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }

    }
}
