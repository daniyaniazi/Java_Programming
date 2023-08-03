import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Brute{
    public int[][] merge(int[][] intervals) {
        //  nLognN
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> ans = new ArrayList();
        
        for(int i=0;i<intervals.length;i++){
            int start =  intervals[i][0];
            int end = intervals[i][1];
            
            if(ans.size()>0 && ( end <= ans.get(ans.size()-1).get(1))){
                // Overlapp
                continue;
            }
            else{
                // 2n
                for(int j=i+1;j<intervals.length;j++){
                    if(intervals[j][0]<=end){
                        end = Math.max(end , intervals[j][1]);
                    }
                    else{
                        break;
                    }
                }
                List<Integer> interval = new ArrayList<>();
                interval.add(start);
                interval.add(end);
                ans.add(interval);
            }
            
        }
        
        int[][] mergeAns = new int[ans.size()][2];
        
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                mergeAns[i][j] = ans.get(i).get(j);
            }
        }
        
        return  mergeAns;
    }
}

class OpttimalSolution {
    public int[][] merge(int[][] intervals) {
        //  nLognN
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> ans = new ArrayList();
        
        for(int i=0;i<intervals.length;i++){
            if(ans.isEmpty() || (  intervals[i][0] > ans.get(ans.size()-1).get(1))){
                List<Integer> interval = new ArrayList<>();
                interval.add(intervals[i][0]);
                interval.add(intervals[i][1]);
                ans.add(interval);
            }
            else{
                ans.get(ans.size()-1).set(1, Math.max(intervals[i][1], ans.get(ans.size()-1).get(1)));
            }
            
        }
        
        int[][] mergeAns = new int[ans.size()][2];
        
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                mergeAns[i][j] = ans.get(i).get(j);
            }
        }
        
        return  mergeAns;
    }
}