// Justin Butler
// 11/12/2021
/*
Runtime: 2 ms
Memory Usage: 39.2 MB
*/
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int size = nums1.length;
        int[] res = new int[size];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums2.length; i++) //Map num2 elements to indexes.
        {
            hm.put(nums2[i], i); // all nums are supposed to be unique
        }
        for(int i = 0; i < size; i++)
        {
            res[i] = getMax(nums2, hm.get(nums1[i])); // all integers in num1 appear in num2.
        }
        return res;
        
    }
    public int getMax(int[] num, int index) // helper method to see find next largest index
    {

        int currMax = num[index];
        for(int i = index; i <num.length; i++)
        {
            if(currMax < num[i])
            {
                return num[i];
            }
        }
        return -1;
    }
}
