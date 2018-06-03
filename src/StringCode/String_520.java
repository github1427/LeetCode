package StringCode;

/**
 * 检测大写字母
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 * <p>
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 * <p>
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "USA"
 * 输出: True
 * 示例 2:
 * <p>
 * 输入: "FlaG"
 * 输出: False
 */
public class String_520 {
    public static void main(String[] args) {
        String word="leetcodeA";
        System.out.println(detectCapitalUse(word));
    }
    public static boolean detectCapitalUse(String word){
        if (word.length()==1){
            return true;
        }
        int bigCount=0;
        for (int i=1;i<word.length();i++){
            if (word.charAt(i)<'a'){
                bigCount++;
            }
        }
        if (word.charAt(0)<'a'){
            return bigCount == word.length() - 1 || bigCount == 0;
        }else {
            return bigCount == 0;
        }
    }
}
