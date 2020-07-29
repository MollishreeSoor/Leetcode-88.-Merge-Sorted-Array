public class Solution {
	    public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	        for(int i=0;i<m;i++){
	            minHeap.add(nums1[i]);
	        }
	        
	        for(int i=0;i<n;i++){
	            minHeap.add(nums2[i]);
	        }
	        
	        while(!minHeap.isEmpty()){
	            for(int i=0;i<m+n;i++){
	                nums1[i]=minHeap.remove().intValue();
	            }
	        }
	    }
	    
	    public static void main(String[] args){
	        int[] nums1={1,2,3,0,0,0};
	        int[] nums2={2,5,6};
	        
	        merge(nums1,3,nums2,3);
	        for(int i=0;i<6;i++){
	            System.out.println(nums1[i]);
	        }
	    }
	}
