package TreeCode;

import Const.TreeNode;

/**
 * @ Author     ：vain
 * @ Date       ：Created in 上午10:25 2018/6/29
 * @ Description：给定一个二叉树，找出其最大深度。二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 */
public class Tree104 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(maxDepth(root));
    }
    public static int maxDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        int maxLeftDepth=maxDepth(root.left);
        int maxRightDepth=maxDepth(root.right);
        return Math.max(maxLeftDepth,maxRightDepth)+1;
    }
}
