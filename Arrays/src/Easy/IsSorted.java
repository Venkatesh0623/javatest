package Easy;

public class IsSorted {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        System.out.println(isSorted(nums));

    }
    public static boolean isSorted(int[] nums){

        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }
}
