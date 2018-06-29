package TreeCode;

import Const.TreeNode;

/**
 * @ Author     ：vain
 * @ Date       ：Created in 上午10:53 2018/6/29
 * @ Description：给定两个二叉树，编写一个函数来检验它们是否相同。如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class Tree100 {
    public static void main(String[] args) {
        TreeNode p=new TreeNode(1);
        p.left=new TreeNode(2);
//        p.right=new TreeNode(3);
        TreeNode q=new TreeNode(1);
//        q.left=new TreeNode(null);
        q.right=new TreeNode(2);
        System.out.println(isSameTree(p,q));
    }
    public static boolean isSameTree(TreeNode p,TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }else if (p==null&&q==null){
            return true;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
