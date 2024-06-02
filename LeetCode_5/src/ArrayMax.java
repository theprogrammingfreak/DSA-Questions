import java.util.Arrays;

class ArrayMax {
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] ans=new int[nums.length/3][3];
        int idx=0;
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<3;j++){
                ans[i][j]=nums[idx];
                idx++;
            }
        }
        for(int i=2;i<nums.length;i=i+3){
            if(nums[i]-nums[i-1]>k || nums[i]-nums[i-2]>k) {
                return new int[0][0];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums={6,10,5,12,7,11,6,6,12,12,11,7};
        int[][] ans=divideArray(nums,2);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<3;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}