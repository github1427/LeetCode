package StringCode;

/**
 * 字符串中的唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 案例:
 * <p>
 * s = "leetcode"
 * 返回 0.
 * <p>
 * s = "loveleetcode",
 * 返回 2.
 */
public class String_387 {
    public static void main(String[] args) {
        String s="loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s){
        int [] ints=new int[26];
        char [] chars=s.toCharArray();
        int index=s.length();
        for (int i=0;i<chars.length;i++){
            ints[chars[i]-'a']++;
        }
        for (int i=0;i<26;i++){
            if (ints[i]==1){
                index=Math.min(index,s.indexOf(i+'a'));
            }
        }
        if (index==s.length()){
            return -1;
        }else {
            return index;
        }
    }
}
