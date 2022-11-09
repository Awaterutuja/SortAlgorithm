
public class BubbleSort {

	public static void main(String[] args) {
		int [] bArray= {3,89,4,0,2,76,10};
		int n= bArray.length;
		for(int i=0; i < n-1 ; i++) {
			
			for(int j=0; j < n -i -1 ; j++) {
				
				if( bArray[j] > bArray[j+1] ) {
					
					int temp=bArray[j];
					bArray[j]=bArray[j+1];
					bArray[j+1]=temp;
					
				}
			}
		}
		System.out.println("sorted array");
		for(int i=0;i<n;i++)
			System.out.print(bArray[i]+" ");

	}

}
