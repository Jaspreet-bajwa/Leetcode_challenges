
public class verifyPreOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] pre = {5,2,1,3,8,6,7};
		int [] post = {1,3,2,6,7,8,5};
		//printArray(pre);
		System.out.println(verifyPreorder(pre));
		System.out.println(verifyPostOrder(post));
	}
	
	static boolean verifyPreorder(int[] preorder) {
	    int low = Integer.MIN_VALUE, i = -1;
	    for (int p : preorder) {
	        if (p < low)
	            return false;
	        while (i >= 0 && p > preorder[i])
	            low = preorder[i--];
	        preorder[++i] = p;
	        //printArray(preorder);
	        //System.out.println("Low: "+low);
	    }
	    return true;
	}
	
	static boolean verifyPostOrder(int[] post){
		int max = Integer.MAX_VALUE;
		int i = post.length;
		for(int j = post.length - 1; j >= 0; j--){
			if(post[j] > max){
				return false;
			}
			while(i <= post.length-1 && post[j] < post[i]){
				max = post[i++];
			}
			post[--i] = post[j]; 
		}
		return true;
	}
	
//	static void printArray(int[] preorder){
//		for(int p : preorder){
//			System.out.print(p+" ");
//		}
//		System.out.println();
//	}

}
