package tree.binarytree;

public class Main {
    public static void main(String args[]){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(10);
        binaryTree.add(5);
        binaryTree.add(3);
        binaryTree.add(7);
        binaryTree.add(15);
        binaryTree.add(12);
        binaryTree.add(20);
        binaryTree.traverse(TraverseOrder.PRE);
        binaryTree.traverse(TraverseOrder.IN);
        binaryTree.traverse(TraverseOrder.POST);



    }
}
