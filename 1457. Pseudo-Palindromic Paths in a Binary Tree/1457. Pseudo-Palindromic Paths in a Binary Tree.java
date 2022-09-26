/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pseudoPalindromicPaths (TreeNode root) {


        int numbers[] = new int[11];
        numbers[10]=0;
        dfs(root, numbers);
        
        return numbers[numbers.length-1];
        
    }

    
    public void dfs(TreeNode root, int numbers[]){
        
        if(root==null)
            return;
        
        numbers[root.val]++;
        if(root.left==null && root.right==null)
        {
            int h=0;
            for(int i=0; i<numbers.length-1; i++)
                h+=numbers[i]%2;
  
            if(h==0 || h==1)
                numbers[numbers.length-1]++;
        }
           
        dfs(root.right, numbers);
        dfs(root.left, numbers);
        numbers[root.val]--;
    }
}



