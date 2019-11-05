/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.search.tree;

/**
 *
 * @author Vibhushit Singhal
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    class Node{
        int data;
        Node left, right;
        public Node(int value){
            this.data = value;
            left = right = null;
        }
    }
    
    Node root;
    BinarySearchTree(){
        root = null;
    }
    
    Node insert(Node node,int key){
        if(node == null){
            node = new Node(key);
            return node;
        }
        
        if(key < node.data){
            node.left = insert(node.left, key);
        }else if(key > node.data){
            node.right = insert(node.right, key);
        }
        return node;
    }
    
    void inOrderTraversal(Node node){
        if(node != null){
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }
    
    void preOrderTraversal(Node node){
        if(node != null){
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
    
    void postOrderTraversal(Node node){
        if(node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);
        
        tree.inOrderTraversal(tree.root);
        System.out.println();
        
        tree.preOrderTraversal(tree.root);
        System.out.println();
        
        tree.postOrderTraversal(tree.root);
        System.out.println();
    }
}