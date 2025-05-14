public class BinarySearchTree {
    private Node root;
    private Node currentNode;

    //Constructor

    public BinarySearchTree() {
        root = null;
        currentNode = root;
    }

    // Methods to manage tree

    public int addValue(Node inputNode) {
        if (root == null) {
            root = inputNode;
            currentNode = root;
            return 0;
        }
        if (inputNode.getValue() < currentNode.getValue()) {
            if (currentNode.getLeftNode() == null) {
                currentNode.setLeftNode(inputNode);
                currentNode = root;
                return 0;
            } else {
                currentNode = currentNode.getLeftNode();
                return addValue(inputNode);
            }
        } else if (inputNode.getValue() > currentNode.getValue()) {
            if (currentNode.getRightNode() == null) {
                currentNode.setRightNode(inputNode);
                currentNode = root;
                return 0;
            } else {
                currentNode = currentNode.getRightNode();
                return addValue(inputNode);
            }
        }
        currentNode = root;
        return -1;
    }
    public int searchValue(Node inputNode) {
        if(root == null)
            return -2;
        if (inputNode.getValue() < currentNode.getValue()) {
            if (currentNode.getLeftNode() == null) {
                currentNode = root;
                return -1;
            } else {
                currentNode = currentNode.getLeftNode();
                return searchValue(inputNode);
            }
        } else if (inputNode.getValue() > currentNode.getValue()) {
            if (currentNode.getRightNode() == null) {
                currentNode = root;
                return -1;
            } else {
                currentNode = currentNode.getRightNode();
                return searchValue(inputNode);
            }
        } else {
            currentNode = root;
            return 0;
        }
    }
}