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


public class M1_SameTree {
    public static boolean isSame(TreeNode s,TreeNode t){
        if(s==null && t==null){
            return true;
        }
        if(s==null || t==null){
            return false;
        }
        if(s.val != t.val){
            return false;
        }
        return isSame(s.left, t.left) && isSame(s.right, t.right);

    }
    public static void main(String[] args) {
        TreeNode s=new TreeNode(1);
        s.left=new TreeNode(2);
        s.right=new TreeNode(3);

        TreeNode t=new TreeNode(1);
        t.left=new TreeNode(2);
        t.right=new TreeNode(3);

        System.out.println(isSame(s, t));


    }
}
