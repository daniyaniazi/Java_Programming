class Solution {
    int n;
    public List<List<String>> partition(String s) {
        n = s.length();
        List<String> current= new ArrayList();
        List<List<String>> result= new ArrayList();

        backtrack(s,0,current,result);

        return result;

    }

    public void backtrack(String s , int index ,  List<String> current,List<List<String>> result){

        if(index==n){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=index ; i<n;i++){
            if(isPalidrome(s,index,i)){
                current.add(s.substring(index,i+1));
                backtrack(s,i+1,current,result);
                current.remove( current.size() - 1);
            }
        }
    }
    public boolean isPalidrome(String s,int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            r--;
            l++;

        }
        return true;
    }

}  