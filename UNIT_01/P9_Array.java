package UNIT_01;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		for(int i=0;i< array.length;i++)
		{
			System.out.print(array[i] + " ");
		}

		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {


//	void swap(int var1, int var2)
//	{
//		int temp = var1;
//		var1 = var2;
//		var2 = temp;
//	}
	void sortAnArray(int[] arr) {
		int j = arr.length;
		for(int i=0;i<j;i++)
		{
			for(int k=0;k<j-i-1;k++)
			{
				if(arr[k]>arr[k+1])
				{
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
		//System.out.println();

	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!

	}

	void leftRotationInAnArray(int[] arr) {
		// write code here!

	}

	void removeElementInArray(int[] arr) {
		// write code here!

	}

}
