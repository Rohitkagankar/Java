class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){};
    TreeNode(int val){this.val=val;};
    TreeNode(int val,TreeNode left, TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}


public class L8_DepthOfTree {
    public static int DepthOfTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftdepth=DepthOfTree(root.left);
        int rightdepth=DepthOfTree(root.right);
        return Math.max(leftdepth, rightdepth)+1;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);

        System.out.println(DepthOfTree(root));
    }
}
