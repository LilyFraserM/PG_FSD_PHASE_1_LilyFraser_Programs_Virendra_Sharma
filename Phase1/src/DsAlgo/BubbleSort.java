package DsAlgo;

public class BubbleSort {
	public static void bubbleSort(int []arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[j-1] >arr[j]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]= temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {60,12,8,24,32};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
