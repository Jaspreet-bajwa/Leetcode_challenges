public class RotateMatrix {
	public static void main(String args[]){
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotateMatrix(matrix);
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println("");
		}
	}
	
	static void rotateMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		int m = matrix.length;
		if(m == 0){
			return;
		}
		for(int layer = 0; layer < m/2; layer++){
			int first = layer;
			int end = m-layer-1;
			for(int i = first; i < end; i++){
				int offset = i-first;
				int temp = matrix[first][i];
				matrix[first][i] = matrix[end-offset][first];
				matrix[end-offset][first] = matrix[end][end-offset];
				matrix[end][end-offset] = matrix[i][end];
				matrix[i][end] = temp;
				
			}
		}
	}
}
