class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int merge[] = new int[nums1.length + nums2.length];

        for(int i = 0; i < nums1.length; i++){
            merge[i] = nums1[i];
        }
        
        for(int i = 0; i < nums2.length; i++){
            merge[nums1.length + i] = nums2[i];
        }

        Arrays.sort(merge);

        if((merge.length % 2) != 0){
            return merge[merge.length / 2];
        }
        else if((merge.length % 2) == 0){
            int i = merge.length / 2;
            return (merge[i] + merge[i - 1]) / 2.0;

        }
        return 0;
    }
}