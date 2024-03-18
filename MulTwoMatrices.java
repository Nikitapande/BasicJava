
public class MulTwoMatrices {

	public static void main(String[] args) {
		int a[][]= {{1,2,4},{5,6,2},{1,3,1}};
		int b[][]= {{2,3,5},{4,3,1},{2,3,1}};
		
		int c[][]= new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) {
					c[i][j]=a[i][k]*b[k][j];
				} // end of k loop
				System.out.print(c[i][j]+" ");
			} // end of j loop
			System.out.println();
		} //end of i loop

	}

}
