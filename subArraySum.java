
public class subArraySum {
	public static void main(String args[]){
		int arr[] = {1,2,3};
		System.out.println(subArraySum1(arr));
	}
	
	static long subArraySum1(int []arr){
		long sum = 0;
		for(int i = 0; i < arr.length; i++){
			//sum += (arr[i] * (i+1) * (arr.length-i));
			sum += (arr[i]*Math.pow(2, arr.length-1));
		}
		long result = 0;
		int n = arr.length;
		for (int i=0; i <n; i++)
	    {
	        // Pick ending point
	        for (int j=i; j<n; j++)
	        {
	            // sum subarray between current
	            // starting and ending points
	            for (int k=i; k<=j; k++)
	                result += arr[k] ;
	        }
	    }
		System.out.println("result"+result);
		return sum;
	}

}
