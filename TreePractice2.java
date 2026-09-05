class TreePractice2 {
    public static void main(String[] args){

        Treee myTree = new Treee();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int val : values){
            myTree.insert(val);
        }

        myTree.inorder();
        myTree.postOrder();
    }
}

class Nodee {

    int data;
    Nodee left;
    Nodee right;

    Nodee(int data){
        this.data = data;
        left = null;
        right = null;
        //left = right = null;
    }
}

class Treee {
    Nodee root;

    public Treee(){
        root = null;
    }

    public void insert(int data){
        root = insertRec(root, data);
    }

    private Nodee insertRec(Nodee root, int data){
        if(root == null){
            return new Nodee(data);
        }

        if(data < root.data){
            root.left = insertRec(root.left, data);
        }
        else if(data > root.data){
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void inorder(){
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Nodee root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    void postOrder(){
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Nodee root){
        if(root != null){
            postorderRec(root.right);
            System.out.print(root.data + " ");
            postorderRec(root.left);
        }
    }

    boolean search(int data){
        return searchRec(root,data);
    }

    private boolean searchRec(Nodee root, int data){

        if (root == null) return false;
        if(data == root.data) return true;

        if(data < root.data){
            return searchRec(root.left,data);
        }
        else {
            return searchRec(root.right,data);
        }
    }





}

