package main.java;

public class PrintPairsWhoseSumIs6FromIntegerArray {
	
	
	public static void main(String[] args) {
		int[] integerArray = {1, 5, 7, -1, 5};

		int sum=6;
		int count=0;
		for(int i=0;i<integerArray.length;i++) {
			for(int j=i+1;j<integerArray.length;j++) {				
				if(integerArray[i]+integerArray[j]==sum) {
					count++;				
				}
			}
			
		}
		System.out.println("Number of Pairs "+count);
		
	}

}
