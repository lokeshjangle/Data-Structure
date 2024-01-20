class Tnode{
    int data;
    Tnode right, left;
    Tnode(int data){
        this.data = data;
        left=right = null;
    }

}

public class TreeExample{
    Tnode root;
   

    //Creation of Tree
    public void createTree(){
        root = null;
    }


    //Inserting left and right node in tree
    public void insert(Tnode r, Tnode n){  //r root n New Node
        if(root == null){
            root = n;
        }
        else{
            if(n.data < r.data){  //data is lesser than data of root node
                if(r.left == null){
                    r.left = n;
                }
                else{
                    insert(r.left, n);  //insert left of root node using recursion
                }
            }
            else{  //data is greater and equal to data of root node

                if(r.right == null){  //if right of root is null
                    r.right = n;
                }
                else{
                    insert(r.right, n);  //insert right of root node using recursion
                }
            }
        }
        
    }

    public void delete(){
        if(root == null){
            System.out.println("Tree Empty...");
        }
        else{

        }
    }

  

    public void inorder(Tnode r ){
        if(r!=null){

            //Sequence of inorder ==> LPR
            inorder(r.left);
            System.out.println(r.data);
            inorder(r.right);
        }
        
    }

    public void preorder(Tnode r){
        if(r!=null){
            //Sequence of preorder ==> PLR

            System.out.println(r.data);
            preorder(r.left);
            preorder(r.right);

            
        }
    }
    
    public void postOrder(Tnode r){
        if(r!=null){
            //Sequence of postorder ==> LRP

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
    
    public int depth(Tnode r){
        if(r==null){
            return  0 ;
        }
        else{
            int left = depth(r.left);
            int right = depth(r.right);
            return Math.max(left, right)+1;
        }
    }

    public boolean  search(Tnode r,int ele){
        // if(r!=null){

        //     if(ele==r.data){
        //         System.out.println("Found in tree");
        //         return;
        //     }

        //     else if(ele>r.data){
        //         search(r.right, ele);}
        //     else{
        //         search(r.left, ele);
        //     }
        // }
        // else{
        //     System.out.println("NOT FOUND.....");
        // }
       if(r!=null){

            if(ele==r.data){
                return true;
            }

            boolean left = search(r.left, ele);

            boolean right = search(r.right, ele);
            
            return left || right;
            
        }
        else{
            return  false;
            }
   
    }
}