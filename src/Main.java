import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        boolean x = true;

        while (x){
            System.out.println("---------------------------------------");
            System.out.println("1.Add a value to the tree");
            System.out.println("2.Search a value inside the tree");
            System.out.println("3.Exit");
            System.out.print("\nWhat do you want to do: ");
            int scelta = userInput.nextInt();
            switch (scelta){
                case 1:
                    System.out.print("Insert the value you want to add to the tree: ");
                    Node add = new Node(userInput.nextInt());
                    if(bst.addValue(add) == 0)
                        System.out.println("Value added successfully.");
                    else
                        System.out.println("Value already exists inside the tree.");
                    break;
                case 2:
                    System.out.print("Insert the value you want to search in the tree: ");
                    Node src = new Node(userInput.nextInt());
                    if(bst.searchValue(src) == -2 )
                        System.out.println("The tree is empty.");
                    else if (bst.searchValue(src) == -1)
                        System.out.println("Value not found.");
                    else
                        System.out.println("Value was found");
                    break;
                case 3:
                    x = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}