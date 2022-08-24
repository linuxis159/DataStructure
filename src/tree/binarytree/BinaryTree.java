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
            addTraval(this.root, value);
            size++;
        }
    }
    void addTraval(Node node, int value){
        if(node == null) {
            Node newNode = new Node(value);
            node = newNode;
        }
        else if(node.value >= value){
            if(node.left == null){
                Node newNode = new Node(value);
                node.left = newNode;
                return;
            }else
                addTraval(node.left, value);
        }
        else{
            if(node.right == null) {
                Node newNode = new Node(value);
                node.right = newNode;
                return;
            }
            else
                addTraval(node.right, value);
        }
    }

    void viewTraval(){
        traval(this.root);
    }

    void traval(Node node){
        if(node == null)
            return;
        else{
            traval(node.left);
            System.out.println(node.value);
            traval(node.right);
        }

    }


}
