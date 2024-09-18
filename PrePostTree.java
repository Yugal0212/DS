//CONSTRUCT TREE FROM PREORDER AND POSTORDER
public class PrePostTree {
    class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data = data;
        }
    }

    int preIndex;
    Node ConstructTree(int pre[], int post[],int size)
    {
        preIndex = 0;
        return ConstructTreeUtil(pre, post, 0, size-1, size);
    }

    Node ConstructTreeUtil(int pre[],int post[],int l,int h,int size)
    {
        if (preIndex>=size || l>h) {
            return null;
        }

        Node root = new Node(pre[preIndex]);
        preIndex++;

        if (l==h || preIndex>=size) 
        {
            return root;    
        }
        int i;
        for(i=l;i<=h;i++)
        {
            if (post[i] == pre[preIndex]) {
                break;
            }
        }

        if (i<=h) 
        {
            root.left = ConstructTreeUtil(pre, post, l, i, size);
            root.right = ConstructTreeUtil(pre, post, i+1, h-1, size);
        }

        return root;
    }

    void inOrder(Node root)
    {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(" "+root.data);
        inOrder(root.right);
    }
    

    public static void main(String[] args) {
        PrePostTree p = new PrePostTree();

        int pre[] = {1,2,4,8,9,5,3,6,7};
        int post[] ={8,9,4,5,2,6,7,3,1};

        int size = pre.length;
        Node root = p.ConstructTree(pre, post, size);

        System.out.println("Inorder");
        p.inOrder(root);

    }
}