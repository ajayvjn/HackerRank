import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Combination {
    public static void main(String args[]) throws IOException {
        buildSubsequences("abc");
    }

    static List<String> list = new ArrayList<String>();

    static String[] buildSubsequences(String s) {
        subseq(s, new StringBuffer(), 0);
        //Collections.reverse(list);
        return list.toArray(new String[list.size()]);
    }

    static void subseq(String s, StringBuffer sb, int index){
        for(int i = index; i< s.length(); i++){
            sb.append(s.charAt(i));
            list.add(sb+"");
            subseq(s, sb, i+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }


}