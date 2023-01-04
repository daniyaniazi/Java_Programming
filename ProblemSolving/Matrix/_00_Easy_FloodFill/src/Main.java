class Solution {
    private int match=0;
    private int[][] mem;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        mem = new int[image.length][image[0].length];
        match = image[sr][sc];
        colorMe(image,sr,sc,color);
        return image;
    }

    private void colorMe(int[][] image, int sr, int sc, int color){
        // if(image[sr][sc]==color) return;
        if(mem[sr][sc] ==1) return;
        else if(image[sr][sc]==match){
            image[sr][sc]=color;
            //marked parsed
            mem[sr][sc] = 1;
            if(sr-1 >=0) colorMe(image,sr-1,sc,color);
            if(sc-1 >=0) colorMe(image,sr,sc-1,color);
            if(sc+1 <image[0].length)colorMe(image,sr,sc+1,color);
            if(sr+1 <image.length)colorMe(image,sr+1,sc,color);
        }else{
            //marked parsed
            mem[sr][sc] = 1;
            return;
        }
    }
}