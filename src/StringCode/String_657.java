package StringCode;

/**
 * 判断路线成圈
 * 初始位置 (0, 0) 处有一个机器人。给出它的一系列动作，判断这个机器人的移动路线是否形成一个圆圈，换言之就是判断它是否会移回到原来的位置。
 * <p>
 * 移动顺序由一个字符串表示。每一个动作都是由一个字符来表示的。机器人有效的动作有 R（右），L（左），U（上）和 D（下）。输出应为 true 或 false，表示机器人移动路线是否成圈。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "UD"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "LL"
 * 输出: false
 */
public class String_657 {
    public static void main(String[] args) {
        String moves="LL";
        System.out.println(judgeCircle(moves));
    }
    public static boolean judgeCircle(String moves){
        int countU=0,countD=0,countL=0,countR=0;
        for (int i=0;i<moves.length();i++){
            if (moves.charAt(i)=='U'){
                countU++;
            }else if (moves.charAt(i)=='D'){
                countD++;
            }else if (moves.charAt(i)=='L'){
                countL++;
            }else if (moves.charAt(i)=='R'){
                countR++;
            }
        }
        return countU==countD&&countL==countR;
    }
}
