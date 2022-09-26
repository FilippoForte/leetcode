class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> numbers = new HashSet<>();
     
        int digit;
        while(n!=1){
            int sum=0;
            while(n>9){
                digit=n%10;
                n/=10;
                sum+=(digit*digit);
            }
            n=sum+(n*n);
            System.out.println(n);
            if(numbers.contains(n))
                return false;
            else
                numbers.add(n);
        }
        return true;
    }
}