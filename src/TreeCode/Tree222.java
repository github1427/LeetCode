package TreeCode;

import Const.TreeNode;

/**
 * @ Author     ：vain
 * @ Date       ：Created in 下午2:44 2018/6/29
 * @ Description：给出一个完全二叉树，求出该树的节点个数。
 */
public class Tree222 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        System.out.println(countNodes1(root));
    }

    //我说怎么能这么简单，果然超时
    private static int countNodes(TreeNode root){
        if (root==null){
            return 0;
        }
        int count=1;
        return countNodes(root.left)+countNodes(root.right)+count;
    }

    private static int countNodes1(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftDepth=leftDepth(root);
        int rightDepth=rightDepth(root);
        if (leftDepth==rightDepth){
            return (int) (Math.pow(2,leftDepth)-1);
        }else {
            return 1+countNodes1(root.left)+countNodes1(root.right);
        }
    }
    private static int leftDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        return leftDepth(root.left)+1;
    }
    private static int rightDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        return rightDepth(root.right)+1;
    }

}
