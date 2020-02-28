package asafov.com.QuestionsMarks;

import java.util.Arrays;

public class Main {
    public static String QuestionsMarks(String str) {
        // code goes here
        char[] ch = str.toCharArray();

        for (int i=0;i<ch.length;i++){
            if (ch[i]!='?' && Character.getNumericValue(ch[i]) <10){
                int j = i+1;
                int num = Character.getNumericValue(ch[i]);
                int q = 0;
                while (j<ch.length && q<4){
                    if (ch[j]=='?'){
                        q++;
                        j++;
                    }else {
                        if (q == 3) {
                            if (Character.getNumericValue(ch[j]) + num == 10) {
                                return "true";
                            }
                        }
                        j++;
                    }
                }
            }
        }
        return "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        String s = "aa6?9";
        System.out.println(QuestionsMarks(s));
    }
}
