
public class SubsetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {3,4,8,9,0,1};
		int [] array2 = {3,8,16};
		boolean isSubset = false;
		
		for(int i = 0; i< array1.length;i++) {
			for(int j=0 ;j< array2.length ; j++) {
				if(array1[i]==array2[j])
					isSubset=true;
				else
					isSubset = false;
			}
		}
		if(isSubset)
			System.out.println("array2 is subset of array1");
		else
			System.out.println("array2 is not subset of array1");
				
	}

}
