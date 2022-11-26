# DSA
// two pointers
// count subarrays in an Array A having sum less than B
public static int solve(int[] arr, int k) {
  // your code goes here
		int i=0;
		int j=0;
		int ans=0;
		int n=arr.length;
		int currntsum=0;
		while(i<n){
			currntsum+=arr[i];
		
		while(currntsum>=k){
			currntsum-=arr[j];
			j++;
		}
		ans+=(i-j+1);
			i++;
	}
		return ans;
	}
        
//Given a binary array A and a integer B , find the length of longest subsegment of ‘1’s possible by changing at most B ‘0’s.

 public int longestOnes(int[] A, int B) {
          //Your code goes here
		int n=A.length;
		int l=0;
		
		int max_length=0;
		int cnt0=0;
		for(int i=0;i<n;i++){
			if(A[i]==0){
			cnt0++;
			}
		while(cnt0>B){
			if(A[l]==0)
				cnt0--;
				l++;
			}
			max_length=Math.max(i-l+1,max_length);
		}
	          return max_length;
          }
