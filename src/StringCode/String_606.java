package StringCode;

/**
 * 根据二叉树创建字符串
 * 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
 * <p>
 * 空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 二叉树: [1,2,3,4]
 *      1
 *    /   \
 *   2     3
 *  /
 * 4
 * <p>
 * 输出: "1(2(4))(3)"
 * <p>
 * 解释: 原本将是“1(2(4)())(3())”，
 * 在你省略所有不必要的空括号对之后，
 * 它将是“1(2(4))(3)”。
 * 示例 2:
 * <p>
 * 输入: 二叉树: [1,2,3,null,4]
 *    1
 *  /   \
 * 2     3
 * \
 * 4
 * <p>
 * 输出: "1(2()(4))(3)"
 * <p>
 * 解释: 和第一个示例相似，
 * 除了我们不能省略第一个对括号来中断输入和输出之间的一对一映射关系。
 */
public class String_606 {
    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(1);
        TreeNode treeNode1=new TreeNode(2);
        TreeNode treeNode2=new TreeNode(3);
        TreeNode treeNode3=new TreeNode(4);
        treeNode.left=treeNode1;
        treeNode.right=treeNode2;
        treeNode1.left=treeNode3;
        System.out.println(tree2str(treeNode));
    }
    public static String tree2str(TreeNode t){
        return DLR(t);
    }
    private static String DLR(TreeNode t){
        if (t!=null&&t.left!=null&&t.right!=null){
            return String.valueOf(t.val)+"("+DLR(t.left)+")"+"("+DLR(t.right)+")";
        }else if (t!=null&&t.left==null&&t.right!=null){
            return String.valueOf(t.val)+"()"+"("+DLR(t.right)+")";
        }else if (t!=null&&t.left!=null){
            return String.valueOf(t.val)+"("+DLR(t.left)+")";
        }else if (t!=null){
            return String.valueOf(t.val);
        }
        return "";
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
