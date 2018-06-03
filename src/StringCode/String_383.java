package StringCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 赎金信
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 * <p>
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 * <p>
 * 注意：
 * <p>
 * 你可以假设两个字符串均只含有小写字母。
 * <p>
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */
public class String_383 {
    public static void main(String[] args) {
        System.out.println(canConstruct1("bg",
                "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }
    public static boolean canConstruct(String ransomNote,String magazine){

        char [] charsMagazine=magazine.toCharArray();
        List<Character> list=new ArrayList<>();
        for (char c:charsMagazine){
            list.add(c);
        }
        for (int i=0;i<ransomNote.length();i++){
            if (list.contains(ransomNote.charAt(i))){
                list.remove(list.indexOf(ransomNote.charAt(i)));
            }else {
                return false;
            }
        }
        return true;
    }

    //这代码不错
    public static boolean canConstruct1(String ransomNote,String magazine){
        int [] ransomInt=new int[26];
        int [] magazineInt=new int[26];
        for (int i=0;i<ransomNote.length();i++){
            ransomInt[ransomNote.charAt(i)-'a']++;
        }
        for (int j=0;j<magazine.length();j++){
            magazineInt[magazine.charAt(j)-'a']++;
        }
        for (int i=0;i<ransomInt.length;i++){
            if (ransomInt[i]>magazineInt[i]){
                return false;
            }
        }
        return true;
    }
}
