
public class Duplicates {
	public static int contains(int[] arr, int key) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==key) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array= {3,6,8,3,8,6,10,7,1,4,5,4,5,6,5,6};
		int[] keys = new int[array.length];
		int[] vals = new int[array.length];
		int len = 0;
		int idx = -1;
		for(int i = 0; i<array.length;i++) {
			idx = contains(keys,array[i]);
			if(idx==-1) {
				keys[len]=array[i];
				vals[len]=1;
				len++;
			}
			else {
				vals[idx]++;
			}
		}
		for (int j =0;j<len;j++) {
			if(vals[j]>1) System.out.print(keys[j]+" is appeared "+vals[j]+" times\n");
		}
	}

}
