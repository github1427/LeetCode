package StringCode;

/**
 * 重复叠加字符串匹配
 * 给定两个字符串 A 和 B, 寻找重复叠加字符串A的最小次数，使得字符串B成为叠加后的字符串A的子串，如果不存在则返回 -1。

 举个例子，A = "abcd"，B = "cdabcdab"。

 答案为 3， 因为 A 重复叠加三遍后为 “abcdabcdabcd”，此时 B 是其子串；A 重复叠加两遍后为"abcdabcd"，B 并不是其子串。
 */
public class String_686 {
    public static void main(String[] args) {
        System.out.println(repeatedStringMatch("baa",
                "abaab"));
    }
    public static int repeatedStringMatch(String A,String B){
        int lenA=A.length(),lenB=B.length();
        StringBuilder ABuilder = new StringBuilder(A);
        if (lenA>=lenB){
            if (A.contains(B)){
                return 1;
            }else {
                if (ABuilder.append(A).indexOf(B)!=-1){
                    return 2;
                }else {
                    return -1;
                }
            }
        }
        int count=lenB/lenA;
        if (lenB%lenA!=0){
            count++;
        }
        for (int i=1;i<count;i++){
            ABuilder.append(A);
        }
        if (ABuilder.indexOf(B)!=-1){
            return count;
        }else {
            if (ABuilder.append(A).indexOf(B)!=-1){
                return ++count;
            }else {
                return -1;
            }
        }
    }
}
