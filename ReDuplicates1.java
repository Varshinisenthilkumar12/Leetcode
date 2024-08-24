package LeetCode;
import java.util.*;
class ReDuplicates1 {
    public int removeDuplicates(int[] nums) {
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
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
    ReDuplicates1 sol=new ReDuplicates1();
    int c=sol.removeDuplicates(nums);
    S.close();
}}