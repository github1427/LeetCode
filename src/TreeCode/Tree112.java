package TreeCode;

import Const.TreeNode;

/**
 * @ Author     ：vain
 * @ Date       ：Created in 下午2:36 2018/6/29
 * @ Description：给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 */
public class Tree112 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(11);
        root.right.left=new TreeNode(13);
        root.right.right=new TreeNode(4);
        root.left.left.left=new TreeNode(7);
        root.left.left.right=new TreeNode(2);
        root.right.right.right=new TreeNode(1);
        System.out.println(hasPathSum(root,22));
    }
    private static boolean hasPathSum(TreeNode root,int sum){
        if (root==null){
            return false;
        }
        if (root.left==null&&root.right==null){
            return root.val==sum;
        }
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
