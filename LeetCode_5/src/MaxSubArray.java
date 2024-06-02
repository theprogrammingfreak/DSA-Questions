import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter window size:");
        int k=sc.nextInt();
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=getSum(arr,k);
        System.out.println(result);
    }
    protected static int getSum(int[] arr,int k){
        int start=0;
        int sum=0;
        int maxSum=0;

        for(int end=0; end<arr.length; end++){
            sum = sum + arr[end];
            if(end >= k-1){
                maxSum = Math.max(sum,maxSum);
                sum=sum-arr[start];
                start++;
            }
        }
        return maxSum;
    }
}
