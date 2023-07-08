import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        int max1 = n;
        int max2 = m;
        
        ArrayList<Integer> unionArray = new ArrayList<>();
        int pt1 = 0, pt2 = 0;
        
        while (pt1 < max1 && pt2 < max2) {
            if (arr1[pt1] <= arr2[pt2]) {
                if (unionArray.size() == 0 || unionArray.get(unionArray.size()-1) != arr1[pt1]) {
                    unionArray.add(arr1[pt1]);
                }
                pt1++;
            } else {
                if (unionArray.size() == 0 || unionArray.get(unionArray.size()-1) != arr2[pt2]) {
                    unionArray.add(arr2[pt2]);
                    
                }
                pt2++;
            }
        }
        
        while (pt1 < max1) {
            if (unionArray.get(unionArray.size()-1) != arr1[pt1]) {
                unionArray.add(arr1[pt1]);
                
            }
            pt1++;
        }
        
        while (pt2 < max2) {
            if (unionArray.get(unionArray.size()-1) != arr2[pt2]) {
                unionArray.add(arr2[pt2]);
                
            }
            pt2++;
        }
        
        return unionArray;
    }
}