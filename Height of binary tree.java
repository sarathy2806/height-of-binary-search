	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	if(root==null)
        {
            return -1;
        }
        int l=1+height(root.left);
        int r=1+height(root.right);
        if(l>r)
            return l;
        else{
            return r;
        }
    }
