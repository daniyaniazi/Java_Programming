public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    int print2largest(int arr[], int n) {
        // code here int largest = arr[0];
        int largest = arr[0];
        int second_largest = -1 ;
        
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > second_largest) {
                second_largest = arr[i];
            }
        }
        
        return second_largest;
    }
}