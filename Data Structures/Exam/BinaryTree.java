package Exam;



class Tnode{
    int data;
    Tnode right, left;
    Tnode(int data){
        this.data = data;
        left=right = null;
    }

}

public class BinaryTree{
    Tnode root;
   

    
    public void createTree(){
        root = null;



    }


   
    public void AddNode(Tnode r, Tnode n){  //r root n New Node
        if(root == null){
            root = n;
        }
        else{
            if(n.data < r.data){  
                if(r.left == null){
                    r.left = n;
                }
                else{
                    AddNode(r.left, n); 
                }
            }
            else{  
                if(r.right == null){  
                    r.right = n;
                }
                else{
                    AddNode(r.right, n);  
                }
            }
        }
        
    }

  

    public void inorder(Tnode r ){
        if(r!=null){

            // LPR
            inorder(r.left);
            System.out.println(r.data);
            inorder(r.right);
        }
        
    }

    public void preorder(Tnode r){
        if(r!=null){
            // PLR

            System.out.println(r.data);
            preorder(r.left);
            preorder(r.right);

            
        }
    }
    
    public void postOrder(Tnode r){
        if(r!=null){
            // LRP

            postOrder(r.left);
            postOrder(r.right);
            System.out.println(r.data);            
        }
    }

    public int count(Tnode r){
        if(r==null){
            return 0;
        }                                                                         
        else{
            int left = count(r.left);
            int right = count(r.right);
            return left+right+1;
        }
    }
    
    public int height(Tnode r){
        if(r == null){
            return -1; // taking height as -1
        }
        else{
            int leftHeight = height(r.left);
            int rightHeight = height(r.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
   


    public class Program {
    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree();
        tree.createTree();
        Tnode n1 = new Tnode(20);
        tree.AddNode(tree.root, n1);

        Tnode n2 = new Tnode(5);
        tree.AddNode(tree.root, n2);

        Tnode n3 = new Tnode(10);
        tree.AddNode(tree.root, n3);

        Tnode n4 = new Tnode(15);
        tree.AddNode(tree.root, n4);
        
        Tnode n5 = new Tnode(100);
        tree.AddNode(tree.root, n5);

        tree.inorder(tree.root);
       

        System.out.println("Element in Tree: " + tree.count(tree.root));
        System.out.println("Depth of Tree: "+(tree.height(tree.root)-1));
       
    }
}

    
}