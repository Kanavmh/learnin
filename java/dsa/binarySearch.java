public class binarySearch {
    public static void main(String[] args){
        int nums[] = {1,2,3,5,7,9};
        int target = 9;

        int result = binarySearch(nums, target);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        }else{
            System.out.println("Element not found in the array");
        }
    }
    
    public static int binarySearch(int[] nums, int target){
        int left =0;
        int right = nums.length-1;

        while(left <= right){
            int mid = (left+right)/2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    
}
