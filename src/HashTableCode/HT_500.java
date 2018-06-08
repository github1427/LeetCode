package HashTableCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 键盘行
 * <p>
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。
 * 示例1:
 * <p>
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 */
public class HT_500 {
    public static void main(String[] args) {
        String[] words = {"Aasdfghjkl", "Qwertyuiop", "zZxcvbnm"};
        for (String s : findWords(words)) {
            System.out.print(s + " ");
        }
    }

    public static String[] findWords(String[] words) {
        List<String> stringList = new ArrayList<>();
        String s;
        for (String word : words) {
            boolean flag = true;
            String first = word.substring(0, 1).toLowerCase();
            if ("qwertyuiop".contains(first)) {
                s = "qwertyuiop";
            } else if ("asdfghjkl".contains(first)) {
                s = "asdfghjkl";
            } else {
                s = "zxcvbnm";
            }
            for (int j = 1; j < word.length(); j++) {
                if (!s.contains(String.valueOf(word.charAt(j)).toLowerCase())) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                stringList.add(word);
            }
        }
        String[] strings = new String[stringList.size()];
        for (int i = 0; i < stringList.size(); i++) {
            strings[i] = stringList.get(i);
        }
        return strings;
    }
}
