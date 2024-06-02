public class SubArrPro {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            int pro=nums[i];
            right=i;
            while(pro < k){
                count++;
                right++;
                if(right>=nums.length) break;
                pro*=nums[right];
            }

        }
        return count;
    }
    public static void main(String[] args){
        int[] nums={10,5,2,6};
        int k=100;
        System.out.println(numSubarrayProductLessThanK(nums,k));
    }
}
