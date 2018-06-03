package StringCode;

/**
 * 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 */
public class String_14 {
    public static void main(String[] args) {
        String []strings={};
        System.out.println(longestCommonPrefix(strings));
    }
    public static String longestCommonPrefix(String [] strs){
        String commonPrefix="";
        if (strs.length==0){
            return commonPrefix;
        }
        int shortStr=Integer.MAX_VALUE;
        int shortIndex=0;
        for (int i=0;i<strs.length;i++) {
            if (strs[i].length()<shortStr){
                shortStr=strs[i].length();
                shortIndex=i;
            }
        }
        for (int i=1;i<=shortStr;i++){
            commonPrefix=strs[shortIndex].substring(0,i);
            for (String str:strs){
                if (!str.startsWith(commonPrefix)){
                    return commonPrefix.substring(0,commonPrefix.length()-1);
                }
            }
        }
        return commonPrefix;
    }
}
