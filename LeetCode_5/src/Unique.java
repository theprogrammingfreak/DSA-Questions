import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Unique {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> set=new HashSet<>();
        for(int key:map.keySet()){
            if(set.contains(map.get(key))) return false;
            set.add(map.get(key));
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr={1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
