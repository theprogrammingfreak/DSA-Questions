import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Convert2d {
    public static List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(map.get(nums[i]),0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        int flag=0;
        while(flag!=1){
            for(int key:map.keySet()){
                if(map.get(key) > 0){
                    ans.add(key);
                }
                if(ans.isEmpty()) flag=1;
                arr.add(ans);
                ans.clear();
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] nums={1,3,4,1,2,3,1};
        System.out.println(findMatrix(nums));
    }
}
