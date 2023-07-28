public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}



class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTr= new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            pascalTr.add(generateRow(i));
        }
        return pascalTr;
    }
    
    public List<Integer> generateRow(int rowNum){
        List<Integer> row = new ArrayList<>();
        int ans = 1;
        row.add(1);
        // nCr Short formula
        for(int i=1;i<rowNum;i++){
            ans = (ans * (rowNum-i))/i;
            row.add(ans);
        }
        return row;
    }
    
}