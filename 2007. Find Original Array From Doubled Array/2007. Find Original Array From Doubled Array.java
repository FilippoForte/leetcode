class Solution {
    public int[] findOriginalArray(int[] changed) {
        int original[], x=0;
        int numbers[] = new int[100001];
        
        
        if(changed.length%2!=0)
             return new int[0];
        else
             original = new int[changed.length/2];
        
        for(int e : changed)
            numbers[e]++;
        
        Arrays.sort(changed);
        for(int i=changed.length-1; i>0; i--){
            
            if(numbers[changed[i]]>0){
                if(changed[i]/2==(float)changed[i]/2 && numbers[changed[i]/2]>0){
                    numbers[changed[i]]--;
                    numbers[changed[i]/2]--;
                    original[x++]=changed[i]/2;
                }
                else
                    return new int[0];
            }
        }   
        return original;
    }
}