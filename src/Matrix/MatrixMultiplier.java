package Matrix;

public class MatrixMultiplier {
	public static void main(String[] args) {
		int[][] a1 = {{2,2},{1,2}};
		int[][] a2 = {{1,2},{1,2}};
		int[][] c = new int[2][2];
		
		for(int i = 0; i<a1.length; i++) {
			for(int j = 0; j<a2.length; j++) {
				for(int k = 0; k<c.length; k++) {
					c[i][j] += a1[i][k]*a2[k][j];
				}
			}
		}
		
		for(int i = 0; i<a1.length; i++) {
			for(int j = 0; j<a2.length; j++) {
				System.out.print("c"+i+"c"+j+"= "+c[i][j]);
			}}
	}
}
