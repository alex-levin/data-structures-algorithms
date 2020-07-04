import java.util.Arrays;

class MergeSort { 

    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }
    
    // Splits and sorts arr[low..high] using merge() 
    private void mergeSort(int arr[], int low, int high) { 
        if (low == high) {
            return;
        }
        // Find the middle point 
        int mid = (low + high) / 2; 

        // Sort first and second halves 
        mergeSort(arr, low, mid); 
        mergeSort(arr , mid + 1, high); 

        // Merge the sorted halves 
        merge(arr, low, mid, high); 
        
    } 
    
    // Merges two subarrays of arr[]. 
    // First subarray is arr[low..mid] 
    // Second subarray is arr[mid+1..high]
    private void merge(int arr[], int low, int mid, int high) { 
        // Find sizes of two subarrays to be merged 
        int n1 = mid - low + 1;
        int n2 = high - mid; 
  
        /* Create temp arrays */
        int left[] = new int [n1]; 
        int right[] = new int [n2]; 
  
        /* Copy data to temp arrays */
        for (int i = 0; i < n1; i++) 
            left[i] = arr[low + i]; 
        for (int j = 0; j < n2; j++) 
            right[j] = arr[mid + 1 + j];   
  
        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = low;
        
        while (i < n1 && j < n2) { 
            if (left[i] <= right[j]) { 
                arr[k] = left[i]; 
                i++; 
            } 
            else { 
                arr[k] = right[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) { 
            arr[k] = left[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            arr[k] = right[j]; 
            j++; 
            k++; 
        } 
    } 
    
    public static void main(String args[]) { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Given Array"); 
        System.out.println(Arrays.toString(arr)); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr); 
  
        System.out.println("\nSorted array"); 
        System.out.println(Arrays.toString(arr)); 
    } 
} 