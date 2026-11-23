class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int r=0;r<image.length;r++){
            int l=0;
            int ri = image[r].length-1;
            while(l<=ri){
                int t=image[r][l];
                image[r][l]=1-image[r][ri];
                image[r][ri]=1-t;
                l++;ri--;
            }
        }
        return image;
        
    }
}