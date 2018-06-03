package StringCode;

/**
 * 计数二级制子串
 * 给定一个字符串 s，计算具有相同数量0和1的非空(连续)子字符串的数量，并且这些子字符串中的所有0和所有1都是组合在一起的。
 * <p>
 * 重复出现的子串要计算它们出现的次数。
 * <p>
 * 示例 1 :
 * <p>
 * 输入: "00110011"
 * 输出: 6
 * 解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011” 和 “01”。
 * <p>
 * 请注意，一些重复出现的子串要计算它们出现的次数。
 * <p>
 * 另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。
 * 示例 2 :
 * <p>
 * 输入: "10101"
 * 输出: 4
 * 解释: 有4个子串：“10”，“01”，“10”，“01”，它们具有相同数量的连续1和0。
 */
public class String_696 {
    public static void main(String[] args) {
        System.out.println(countBinarySubstring("10101"));
    }
    public static int countBinarySubstring(String s){
        int count0=0,count1=0;
        int count=0;
        int diff=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='0'){
                count0++;
                if (i<s.length()-1&&s.charAt(i)!=s.charAt(i+1)){
                    diff++;
                    if (diff==2){
                        diff=1;
                        count=count+Math.min(count0,count1);
                        count1=0;
                    }
                }
            }else {
                count1++;
                if (i<s.length()-1&&s.charAt(i)!=s.charAt(i+1)){
                    diff++;
                    if (diff==2){
                        diff=1;
                        count=count+Math.min(count0,count1);
                        count0=0;
                    }
                }
            }
        }
        return count+Math.min(count0,count1);
    }

}
