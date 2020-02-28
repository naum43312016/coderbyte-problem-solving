package asafov.com.FindIntersection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Find Intersection
Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements: the first element will represent a list of comma-separated numbers sorted in ascending order, the second element will represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order. If there is no intersection, return the string false.

For example: if strArr contains ["1, 3, 4, 7, 13", "1, 2, 4, 13, 15"] the output should return "1,4,13" because those numbers appear in both strings. The array given will not be empty, and each string inside the array will be of numbers sorted in ascending order and may contain negative numbers.
Examples
Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
Output: 1,4,13
Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
Output: 1,9,10
 */
public class Main {
    public static String FindIntersection(String[] strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        // code goes here
        Set<String> set = new HashSet<>();
        String str = strArr[1];
        if (str.length()<1){
            return "false";
        }
        int i = 0;
        String s = "";
        while (i<str.length()){
            while (i<str.length() && str.charAt(i)!=',' && str.charAt(i)!=' '){
                s+=str.charAt(i);
                i++;
            }
            if (s.length()>0) {
                set.add(s);
                s="";
            }
            i++;
        }
        str = strArr[0];
        if (str.length()<1){
            return "false";
        }
        i = 0;
        s = "";
        while (i<str.length()){
            while (i<str.length() && str.charAt(i)!=',' && str.charAt(i)!=' '){
                s+=str.charAt(i);
                i++;
            }
            if (s.length()>0) {
                if (set.contains(s)){
                    stringBuilder.append(s + ",");
                }
                s="";
            }
            i++;
        }

        if (stringBuilder.toString().length()==0){
            return "false";
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }

    public static void main (String[] args) {
        String[] arr = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        FindIntersection(arr);
        /*char[] ch1 = arr[0].toCharArray();
        char[] ch2 = arr[1].toCharArray();
        /*for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
        /*System.out.println(ch1[0]);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));*/
    }
}
