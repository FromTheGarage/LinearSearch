package Arrays;

public class LinearSearch {
	public static int linearSearch(int[] list, int key) {	
		for (int i = 0; i < list.length; i++) { //Step through the array one element at a time until the key is found
			if (key == list[i])
				return i; //return the index of the key if it is found
		} //end for loop
		
		return -1; //return -1 if the key wasn't found
	} //end linearSearch()
	
	public static void main(String[] args) {
		//NOTE: Linear Search works better than Binary Search for unordered arrays, especially small ones
		
		int arr[] = {10, 20, 50, 40, 70, 60, 30}; //Create unordered array to search
		int x = 50; //This is the key, change it to your liking and see if it can be found in the array using the search
		
		//Call the linearSearch function
		int key = linearSearch(arr, x);
		if(key == - 1) 
			System.out.println("The key was not found in the array");
		
		else
			System.out.println("Key is present at index: " + key);
		
	}
	
} //end class LinearSearch
