package TreeCode;

import Const.TreeNode;

/**
 * @ Author     ：vain
 * @ Date       ：Created in 下午2:10 2018/6/29
 * @ Description：计算给定二叉树的所有左叶子之和。
 */
public class Tree404 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(sumOfLeftLeaves(root));
    }
    private static int sumOfLeftLeaves(TreeNode root){
        if (root==null){
            return 0;
        }
        int sum=0;
        if (root.left!=null){
            if (root.left.left == null && root.left.right == null){
                sum+= root.left.val;
            }
        }
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right)+sum;
    }
}
