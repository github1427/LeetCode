package StringCode;

/**
 * Goat Latin
 */
public class String_824 {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
    public static String toGoatLatin(String s){
        String [] strings=s.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<strings.length;i++){
            String s1=strings[i].substring(0,1);
            String s2=strings[i].substring(1);
            if ("aeiou".contains(s1)||"AEIOU".contains(s1)){
                s2=strings[i]+"ma";
            }else {
                s2=s2+s1+"ma";
            }
            for (int j=0;j<=i;j++){
                s2=s2+"a";
            }
            stringBuilder.append(s2).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
