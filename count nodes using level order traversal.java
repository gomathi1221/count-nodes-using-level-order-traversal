class Solution {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int c=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
             TreeNode s=q.poll();
             c++;
             if(s.left!=null){
                q.add(s.left);
             }
             if(s.right!=null){
                q.add(s.right);
             }
            }
        }
        return c;
        
    }
}