import java.util.Arrays;

public class ArrayRemoveItem {
	
    public static void main(String[] args) {
        // Size of the array cannot change after the array is created
        int[] arr = new int[100];
        int i = 0; // loop counter;
        int numItems = 10;
        
        for(i = 0; i < numItems; i++) {
            arr[i] = i + 1;
        }
        
        System.out.println("\nBefore removal");
        for(i = 0; i < numItems; i++) {
            System.out.print(arr[i] + " ");
        }        
                
        int num = 6;
        
        // Find index for 6
        for(i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                break;
            }            
        }
        // Shift remaining items to the left
        for(int j = i; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        
        if(i == arr.length) {
            System.out.println("Not found");
        }
        else {
            // Found and removed
            numItems--;
        }
        
        System.out.println("\nAfter removal");
        for(i = 0; i < numItems; i++) {
            System.out.print(arr[i] + " ");
        }        
    }
}