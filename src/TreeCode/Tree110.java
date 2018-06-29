package TreeCode;

import Const.TreeNode;

/**
 * @ Author     ：vain
 * @ Date       ：Created in 下午12:29 2018/6/29
 * @ Description：给定一个二叉树，判断它是否是高度平衡的二叉树。
 */
public class Tree110 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(3  );
        root.left.left.left=new TreeNode(4);
        root.left.left.right=new TreeNode(4);
//        root.right.left=new TreeNode(15);
//        root.right.right=new TreeNode(7);
        System.out.println(isBalanced(root));
    }
    private static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);

    }

    private static int height(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
}
