
public class ConstructTree {
	
	public class TreeNode{
		private int val;
		private TreeNode left;
		private TreeNode right;
		public TreeNode(int x){
			this.val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructTree ct = new ConstructTree();
		int[] pre = {1,2,4,3,5,8,6,7};
		int[] in = {4,2,1,5,8,3,7,6};
		int[] post = {4,2,8,5,7,6,3,1};	
		TreeNode node1 = ct.preInOrder(pre, in);
		System.out.println("tree for pre in");
		ct.printTree(node1);
		System.out.println("");
		TreeNode node2 = ct.postInOrder(post, in);
		System.out.println("tree for post in");
		ct.printTree(node2);
		System.out.println("");
		TreeNode node3 = ct.prePostOrder(pre, post);
		System.out.println("tree for pre post");
		ct.printTree(node3);
		System.out.println("");
	}
	
	// given pre order and inorder
	public TreeNode preInOrder(int[] pre, int [] in){
		return helperPreIn(0, 0, in.length-1, pre, in);
	}
	
	public TreeNode helperPreIn(int prestart, int instart, int inend, int[] pre, int[] in){
		if(prestart > pre.length-1 || instart > inend){
			return null;
		}
		TreeNode root = new TreeNode(pre[prestart]);
		int index;
		for(index = instart; index <= inend; index++){
			if(in[index] == pre[prestart]){
				break;
			}
		}
		root.left = helperPreIn(prestart+1, instart, index-1, pre, in);
		root.right = helperPreIn(prestart+index-instart+1, index+1, inend, pre, in);
		return root;
	}
	
	//given post order and in order
	public TreeNode postInOrder(int[] post, int[]in){
		return helperPostIn(0, post.length-1, 0, in.length-1, post, in);
	}
	
	public TreeNode helperPostIn(int poststart, int postend, int instart, int inend, int[] post, int[] in){
		if(poststart > postend || instart > inend){
			return null;
		}
		TreeNode root = new TreeNode(post[postend]);
		int index ;
		for(index = instart; index <= inend; index++){
			if(in[index] == post[postend]){
				break;
			}
		}
		root.left = helperPostIn(poststart, poststart+index-instart-1, instart, index-1, post, in);
		root.right = helperPostIn(postend+index-inend, postend-1, index+1, inend, post, in);
		return root;
	}
	
	//given pre order and post order
	static int prestart = 0;
	public TreeNode prePostOrder(int[] pre, int[] post){
		return helperPrePost(0, post.length-1, post, pre);
	}
	
	public TreeNode helperPrePost(int poststart, int postend, int[] post, int[] pre){
		if(prestart >= pre.length || poststart > postend){
			return null;
		}
		TreeNode root = new TreeNode(pre[prestart]);
		prestart++;
		int index;
		if(poststart == postend || prestart >= pre.length){
			return root;
		}
		for(index = poststart; index <= postend; index++){
			if(post[index] == pre[prestart]){
				break;
			}
		}
		if(index <= postend){
			root.left = helperPrePost(poststart, index, post, pre);
			root.right = helperPrePost(index+1, postend, post, pre);
		}
		return root;
	}
	
	public void printTree(TreeNode root){
		if(root == null){
			return ;
		}
		printTree(root.left);
		System.out.print(root.val+",");
		printTree(root.right);
		return ;
	}

}
