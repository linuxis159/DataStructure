package tree.binarytree;
/*
    root node : 부모가 없는 노드
    leaf node : 자식이 없는 노드
    size : 노드의 개수
    depth : 루트노트로부터의 거리
    height : 깊이중 최대값
    degree : 간선개수
*/
public class BinaryTree {
    int size = 0;
    int height = -1;
    Node root;
    public BinaryTree(){


    }

    class Node{
        int depth = 0;
        int value;
        Node parent;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }

    }

    void add(int value){
        if(this.size == 0){
            Node newNode = new Node(value);
            this.root = newNode;
            size++;
            height++;
        }
        else{
            addNode(this.root, value);
            size++;
        }
    }
    void addNode(Node node, int value){
        if(node.value >= value){
            if(node.left == null){
                Node newNode = new Node(value);
                node.left = newNode;
                return;
            }else
                addNode(node.left, value);
        }
        else{
            if(node.right == null) {
                Node newNode = new Node(value);
                node.right = newNode;
                return;
            }
            else
                addNode(node.right, value);
        }
    }

    void treverse(){
        traverseInOrder(this.root);
    }

    void traverse(TraverseOrder traverseOrder){
        switch (traverseOrder) {
            case PRE:
                traversePreOrder(this.root);
                System.out.println();
                break;
            case IN:
                traverseInOrder(this.root);
                System.out.println();
                break;
            case POST:
                traversePostOrder(this.root);
                System.out.println();
                break;
        }
    }



    void traversePostOrder(Node node){
        if(node == null)
            return;
        else{
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.value+" ");
        }

    }

    void traversePreOrder(Node node){
        if(node == null)
            return;
        else{
            System.out.print(node.value+" ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }

    }
    void traverseInOrder(Node node){
        if (node == null)
            return;
        else {
            traverseInOrder(node.left);
            System.out.print(node.value+" ");
            traverseInOrder(node.right);
        }

    }


}
