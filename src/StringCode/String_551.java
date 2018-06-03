package StringCode;

/**
 * 学生出勤记录I
 * 给定一个字符串来代表一个学生的出勤纪录，这个纪录仅包含以下三个字符：
 * <p>
 * 'A' : Absent，缺勤
 * 'L' : Late，迟到
 * 'P' : Present，到场
 * 如果一个学生的出勤纪录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
 * <p>
 * 你需要根据这个学生的出勤纪录判断他是否会被奖赏。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "PPALLP"
 * 输出: True
 * 示例 2:
 * <p>
 * 输入: "PPALLL"
 * 输出: False
 */
public class String_551 {
    public static void main(String[] args) {
        String s="PPALLPA";
        System.out.println(checkRecord1(s));
    }
    public static boolean checkRecord(String s){
        int countA=0,countL=0;
        char [] chars=s.toCharArray();
        for (int i=0;i<chars.length-1;i++){
            if (chars[i]=='A'){
                countA++;
                if (countA>1){
                    return false;
                }
            }else if (chars[i]=='L'){
                countL++;
                if (chars[i+1]=='L'){
                    if (countL>1){
                        return false;
                    }
                }else {
                    countL=0;
                }
            }
        }
        return countA != 1 || chars[chars.length - 1] != 'A';
    }

    //大神代码，贼6
    public static boolean checkRecord1(String s){
        return s.indexOf("A")==s.lastIndexOf("A")&& !s.contains("LLL");
    }
}
