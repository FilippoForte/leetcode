class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n=points.length;
        double distances[] = new double[n];
        int closestValues[][] = new int[k][2];
        
        for(int i=0; i<n; i++)
           distances[i] = Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]);
        
        
        for(int i=0; i<k; i++){
            double min=Integer.MAX_VALUE;
            int selector=0;
            
            for(int h=0; h<n; h++)
                if(distances[h]<min){
                    min=distances[h];
                    selector=h;
                }
            closestValues[i]=points[selector];
            distances[selector]=Integer.MAX_VALUE;
        }
            return closestValues;
    }
}