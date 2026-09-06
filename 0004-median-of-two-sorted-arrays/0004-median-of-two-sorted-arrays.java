class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] ans = merge(nums1,nums2);

        if(ans.length%2 == 0){
            double ans2  = (double) (ans[ans.length/2] + ans[ans.length/2-1])/2;
            return ans2;
        }
        else{
             double ans2  = (double) (ans[ans.length/2]);
             return ans2;
        }

    }

    public int[] merge(int[] arr1, int[] arr2 ){

        int[] ans = new int [arr1.length + arr2.length];

        int p = 0;
        int q = 0;
        int r = 0;

        while(p<arr1.length || q<arr2.length){

            int x = p<arr1.length?arr1[p]:Integer.MAX_VALUE;
            int y = q<arr2.length?arr2[q]:Integer.MAX_VALUE;

              if(x<y){
                ans[r] = x;
                p++;
              }
              else{
                ans[r] = y;
                q++;
              }

              r++;
        }

        return ans;

    }

    
}