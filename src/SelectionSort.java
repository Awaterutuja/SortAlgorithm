
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {3,5,9,2,0,1};
		for(int i=0;i<arr.length-1;i++) {
			int min= i;
			for(int j= i+1 ;j<arr.length;j++) {
				if(arr[j] <  arr[min])
					min=j;
				
				}
			int temp= arr[min];
			arr[min]= arr[i];
			arr[i]= temp;
			}
		System.out.println("Selection Sorted array");
		for(int j=0;j<arr.length;j++)
			System.out.print(arr[j] + " ");
		}
	}
