package TreeCode;

import Const.TreeNode;

/**
 * @ Author     ：vain
 * @ Date       ：Created in 下午12:53 2018/6/29
 * @ Description：给定一个二叉树，找出其最小深度。最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 */
public class Tree111 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(minDepth(root));
    }
    private static int minDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        if (root.left==null&&root.right==null){
            return 1;
        }else if (root.left==null){
            return minDepth(root.right)+1;
        }else if (root.right==null){
            return minDepth(root.left)+1;
        }else return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}
