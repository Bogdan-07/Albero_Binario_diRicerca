public class Node{
    private final int value;
    private Node leftNode;
    private Node rightNode;

    // Constructor

    public Node(int value){
        this.value = value;
        leftNode = null;
        rightNode = null;
    }

    // Get & Set

    public int getValue(){
        return value;
    }
    public Node getLeftNode(){
        return leftNode;
    }
    public Node getRightNode(){
        return rightNode;
    }
    public void setLeftNode(Node lNode){
        leftNode = lNode;
    }
    public void setRightNode(Node rNode){
        rightNode = rNode;
    }
}