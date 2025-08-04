class Solution {
    public int search(int[] nums, int target) {

        return searchIndex(nums,target,0,nums.length-1);
    }
    public static int searchIndex(int[] arr,int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                return searchIndex(arr,tar,si,mid-1);
            }else{
                return searchIndex(arr,tar,mid+1,ei);

            }
        }else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return searchIndex(arr,tar,mid+1,ei);
            }else{
                return searchIndex(arr,tar,si,mid-1);
            }
        }
    }
}