public class BinarySearch {
    
    public static int binarySearchLoop(int[] arr, int key) {
        int l = 0;
        int r = arr.length - 1;
        while(l <= r) {
            int cur = (l + r) / 2;
            if(arr[cur] == key) {
                return cur;
            }
            else if(arr[cur] < key) {
                l = cur + 1;
            }
            else {
                r = cur - 1;
            }
        }
        return -1;
    }
    
    public static int binarySearchRecursive(int[] arr, int key) {
        return binarySearchRecursive(arr, key, 0, arr.length - 1);
    }
    
    private static int binarySearchRecursive(int[] arr, int key, int l, int r) {
        if(l > r) {
            return -1;
        }
        int cur = (l + r) / 2;
        if(arr[cur] == key) {
            return cur;
        }
        else if(arr[cur] < key) {
            l = cur + 1;
        }
        else { 
            r = cur - 1;
        }
        return binarySearchRecursive(arr, key, l, r);        
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(binarySearchLoop(arr, 8));
        System.out.println(binarySearchRecursive(arr, 8));
    }
}
