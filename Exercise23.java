package arthimatic;

public class Exercise23 {
	
	// Bubble sort som går igenom arrayen och alla dess element jämförs och 
	//om ena elementen är större än det andra så byts platsen med så att den 
	// minsta är längst fram
	static void Sort(int[] arr) {                            
		int n = arr.length;  
		int temp = 0; 
		for (int i = 0; i < n; i++) { 
			for (int j = 1; j < (n - i); j++) { 
				if (arr[j - 1] > arr[j]) { 
					temp = arr[j - 1]; 
					arr[j - 1] = arr[j];
					arr[j] = temp; 
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr;
		arr = new int[100];

		for (int m = 0; m < 100; m++) {
			arr[m] = (int) (Math.random() * 1000);
		}
		Sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
