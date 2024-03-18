
public class FreqArray {

	public static void main(String[] args) {
		int ar[]= {1, 2, 8, 3, 2, 2, 2, 5, 1};
		int fre[]=new int[ar.length];
		int visited=-1;
		for(int i=0;i<ar.length;i++) {
			int count=1;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count++;
					fre[j]=visited;					
				} 
				
			}// end of j loop
			if(fre[i]!=visited)
				fre[i]=count;	
		}//end of i loop
		 //Displays the frequency of each element present in array  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fre.length; i++){  
            if(fre[i] != visited)  
                System.out.println("    " + ar[i] + "    |    " + fre[i]);  
        }  
        System.out.println("----------------------------------------");  
	}

}
