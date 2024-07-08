import java.util.ArrayList;

public class BinaryTree {
    public static void main(String[] args) {
        Binary tree = new Binary();
        tree.insert(7);
        tree.insert(8);
        tree.insert(6);
        tree.inorder();


    }
}
class Tree{
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Binary{
    Tree root;
    Binary(){
        this.root = null;
    }
    void insert(int data){
        root = insertrec(root,data);
    }
    Tree insertrec(Tree root,int data){
        if(root == null){
            root = new Tree(data);
            return root;
        }
        if(data<root.data){
            root.left = insertrec(root.left, data);
        }
        if(data>root.data){
            root.right = insertrec(root.right, data);
        }
        return root;
    }
    void inorder(){
        inorderrec(root);
    }
    void inorderrec(Tree root){
        if(root!=null){
            inorderrec(root.left);
            System.out.println(root.data);
            inorderrec(root.right);
        }
    }
}
