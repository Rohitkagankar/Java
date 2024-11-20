import java.util.TreeMap;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(){};
    public TreeNode(int val){
        this.val=val;
    }
    public TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public class M5_HasPathSum {
    public static boolean hasPathSum(TreeNode root,int target){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return root.val==target;
        }
        target-=root.val;
        return hasPathSum(root.left, target) || hasPathSum(root.right, target);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(1);
        root.right=new TreeNode(3);
        int target=5;
        System.out.println(hasPathSum(root,target));
    }
}
