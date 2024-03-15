import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Main o = new Main();

        String[] strsa = {""};

        System.out.println(o.longestCommonPrefix(strsa));

    }


    public String longestCommonPrefix(String[] strs) {

        StringBuilder res = new StringBuilder();

        Arrays.sort(strs);

        char[] first_element = strs[0].toCharArray();
        char[] last_element = strs[strs.length - 1].toCharArray();


        for(int i=0; i<first_element.length; i++){
            if(first_element[i] != last_element[i]){
                break;
            }
            else{
                res.append(first_element[i]);
            }
        }
        return res.toString();


    }


}






//    public String longestCommonPrefix(String[] strs) {
//
//        char[] c = new char[strs.length - 1];
//        int counter = 0;
//        String full_string = null;
//
//        for (int i = 0; i < strs.length - 1; i++) {
//            if (strs[i].charAt(i) == strs[i + 1].charAt(i)) {
//                c[counter] = strs[i].charAt(i);
//                counter++;
//            }
//        }
//
//
//        full_string = "";
//
//
//            for (char all_elements : c) {
//                char first_element = c[0];
//                full_string = first_element + String.valueOf(all_elements);
//            }
//
//
//
//        return full_string;
//
//