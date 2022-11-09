
public class MergeSort {
	void merge(int arr[], int left, int mid, int right) {
		int n1=mid-left +1;
		int n2 = right - mid;
		
		//temp array for sorting
		int leftArr[] = new int[n1];
		int rightArr[] =new int [n2];
		
		for(int i= 0; i<n1; ++i)
			leftArr[i]=arr[left + i];
		
		for(int i= 0; i<n2; ++i)
			rightArr[i]=arr[mid + 1+ i];
		
		int i = 0 ,  j =0;
		int k = left;
		
		while( i < n1 && j< n2) {
			if(leftArr[i]<= rightArr[j]) {
				arr[k]=leftArr[i];
				i++;
			}	
			else {
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k]=rightArr[j];
			j++;
			k++;
		}
		
	}
	void divide(int arr[], int left , int right) {
		if(left < right) {
			int mid=left + (right-left)/2;
			//for making parts
			divide(arr,left,mid);
			divide(arr,mid+1,right);
			
			//fo merge
			merge(arr,left,mid,right);
	}
}

	public static void main(String[] args) {
		int[] array= {10,9,6,7,5,36};
		int l=0;
		int r = array.length-1;
		MergeSort s=new MergeSort();
		s.divide(array, l , r);
		
		System.out.println("Merge sorted array");
		for(int i=0;i<=r;i++) {
			System.out.print (array[i] + " ");
			}
		}
}
