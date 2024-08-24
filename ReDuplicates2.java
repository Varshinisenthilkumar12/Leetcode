package LeetCode;
import java.util.*;
class ReDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int count=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[count-2]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String []args){
    Scanner S=new Scanner(System.in);
    int n=S.nextInt();
    int nums[]=new int[n];
    for(int i=0;i<n;i++){
        nums[i]=S.nextInt();
    }
    ReDuplicates2 sol=new ReDuplicates2();
    int c=sol.removeDuplicates(nums);
    S.close();
}}
