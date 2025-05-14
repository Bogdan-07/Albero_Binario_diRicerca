public class Node{
    private int value;
    private Node leftNode;
    private Node rightNode;


    public Node(int value, Node lNode, Node rNode){
        this.value = value;
        leftNode = lNode;
        rightNode = rNode;
    }

    public int getValue(){
        return value;
    }

    public void setLeftNode(Node lNode){
        leftNode = lNode;
    }
    public void setRightNode(Node rNode){
        rightNode = rNode;
    }

    public Node getLeftNode(){
        return leftNode;
    }
    public Node rightNode(){
        return rightNode;
    }
}