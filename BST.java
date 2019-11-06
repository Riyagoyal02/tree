
public class BST {
	class Node{
		int key;
		Node left,right;
		Node(int item)
		{
			key=item;
			left=right=null;
		}
	}
	Node root;
	BST()
	{
		root=null;
	}
	
	Node insertRec(Node root,int key)
	{
		if(root==null) {
			root=new Node(key);
		return root;
		}
		if(key < root.key){
            root.left = insertRec(root.left, key);
        }else if(key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
	}
	void preOrderTraversal(Node node){
        if(node != null){
            System.out.print(node.key + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

	public static void main(String[] args) {
		BST tree = new BST();
        tree.root = tree.insertRec(tree.root, 50);
        tree.root = tree.insertRec(tree.root, 30);
        tree.root = tree.insertRec(tree.root, 20);
        tree.root = tree.insertRec(tree.root, 40);
        tree.root = tree.insertRec(tree.root, 70);
        tree.root = tree.insertRec(tree.root, 60);
        tree.root = tree.insertRec(tree.root, 80);

        tree.inOrderTraversal(tree.root);
        System.out.println();

        tree.preOrderTraversal(tree.root);
        System.out.println();

        tree.postOrderTraversal(tree.root);
        System.out.println();
		

	}
	}

