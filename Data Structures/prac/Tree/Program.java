public class Program {
    public static void main(String[] args) {
        
        TreeExample tree = new TreeExample();
        tree.createTree();
        Tnode n1 = new Tnode(20);
        tree.insert(tree.root, n1);

        Tnode n2 = new Tnode(5);
        tree.insert(tree.root, n2);

        Tnode n3 = new Tnode(10);
        tree.insert(tree.root, n3);

        Tnode n4 = new Tnode(15);
        tree.insert(tree.root, n4);
        
        Tnode n5 = new Tnode(100);
        tree.insert(tree.root, n5);

        tree.inorder(tree.root);
        // tree.preorder(tree.root);


        System.out.println("Element in Tree: " + tree.count(tree.root));
        System.out.println("Depth of Tree: "+(tree.depth(tree.root)-1));
        if(tree.search(tree.root, 100)){
            System.out.println("Element found....");
        }
        else{
            System.out.println("NOT FOUND...");
        }
    }
}
