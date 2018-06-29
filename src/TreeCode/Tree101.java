package TreeCode;

import Const.TreeNode;

/**
 * @ Author     ：vain
 * @ Date       ：Created in 下午12:07 2018/6/29
 * @ Description：给定一个二叉树，检查它是否是镜像对称的。
 */
public class Tree101 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
//        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(3);
//        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(3 );
        System.out.println(isSymmetric(root));
    }
    private static boolean isSymmetric(TreeNode root){
        return compareTreeNode(root.left,root.right);
    }
    private static boolean compareTreeNode(TreeNode left,TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && compareTreeNode(left.left, right.right) && compareTreeNode(left.right, right.left);
    }
}
