class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        int[] rows = new int[m];
        int[] colu = new int[n];
        
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                if(matrix[i][j]==0){
                    rows[i]++;
                    colu[j]++;
                }
        
        for(int i=0; i<m; i++)
            if(rows[i]!=0)
                for(int j=0; j<n; j++)
                    matrix[i][j]=0;
        
        for(int j=0; j<n; j++)
            if(colu[j]!=0)
                for(int i=0; i<m; i++)
                    matrix[i][j]=0;     
    }
}