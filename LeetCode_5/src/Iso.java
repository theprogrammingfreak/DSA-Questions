import java.util.HashMap;
import java.util.Map;

public class Iso {
    public static boolean isIsomorphic(String s,String t){
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        int flag1=0,flag2=0;
        for(int i=0;i<s.length();i++){
            if(map1.get(ch1[i])==null){
                map1.put(ch1[i],ch2[i]);
            }
            else if(map1.get(ch1[i])!=ch2[i]){
                flag1=1;
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(map2.get(ch2[i])==null){
                map2.put(ch2[i],ch1[i]);
            }
            else if(map2.get(ch2[i])!=ch1[i]){
                flag2=1;
                break;
            }
        }
        return flag1!=1 && flag2!=1;
    }
    public static void main(String[] args){
        String s1="bbbaaaba";
        String s2="aaabbbba";
        System.out.println(isIsomorphic(s1,s2));
    }
}
