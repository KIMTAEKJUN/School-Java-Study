public class SortArray {

	public static void main(String[] args) {
		int [] num= {60,54,70,22,68,95,12,81};
		
		for(int i=0; i<num.length;i++)
			System.out.print(num[i]+", ");
		System.out.println();
		
		//Bubble Sort
		
		for(int i=0; i<num.length-1;i++)
			for(int j=0; j<num.length-1-i; j++)			
			   if(num[j]>num[j+1]) {
				   int temp = num[j];
				   num[j] = num[j+1];
				   num[j+1] = temp;
			   }
		
		for(int i=0; i<num.length;i++)
			System.out.print(num[i]+", ");
		
		System.out.println();
	}
}




