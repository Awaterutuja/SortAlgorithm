
public class QuickSort {
	static int partition(int array[],int left, int right) {
		int pivot =array[right];
		int i=(left-1);
		
		for(int j= left; j<right; j++) {
			if(array[j]<pivot) {
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		int t= array[i+1];
		array[i+1]=array[right];
		array[right]=t;
		return (i+1);
	}
	
	static void sort(int arr[], int left, int right) {
		if(left<right) {
			int p=partition(arr, left, right);
			sort(arr, left, p-1);
			sort(arr,p+1,right);
		}
	}
	
	public static void main(String[] args) {
		int[] sortArray = {3,9,81,7,45,1,0,2};
		int n= sortArray.length;
		System.out.println("array before sorted");
		for(int i=0;i<n;i++) {
			System.out.print(sortArray[i] +" ");
		}
		System.out.println();
		sort(sortArray, 0, n-1);
		System.out.println("array after sorted");
		for(int i=0;i<n;i++) {
			System.out.print(sortArray[i]+ " ");
		}

	}

}
