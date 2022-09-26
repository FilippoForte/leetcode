class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int sum=0;
        
        Arrays.sort(properties, (a,b) -> (a[0]!=b[0]) ? b[0]-a[0] : a[1]-b[1]);
        
        
        int max = properties[0][1];
        for(int i=0; i<properties.length; i++){
            
            if(max>properties[i][1])
                sum++;
            else
                max=properties[i][1];
            
        }
        return sum;
    }
}