import java.util.Scanner;

public class Main {
    public static Node head = null;
    Node tail = null;
    static int arr = 0;

    public void display() {

        Node current = head;
        System.out.print("\n[");

        //start from the beginning
        while(current != null) {
            System.out.print(" " + current.info + " ");
            current = current.next;
        }
        System.out.print("]");
    }


    public void insert1st(int info){
        //creating a link
    Node newNode = new Node(info);
    //pointing it to the old first node
    newNode.next = head;
    //pointing it to the new first node
    head = newNode;
    }

    public void sortlist(){

    }
    public void insertlast(int info){
        // creating a link
    Node newNode = new Node(info);
    Node linkedlist = head;
    // pointing to the first old node
    while(linkedlist.next !=null)
        linkedlist = linkedlist.next;
    linkedlist.next = newNode;
    }

    public void insertspecific(int position,int info){
    Node newNode = new Node(info);
        newNode.info = info;
        newNode.next = null;

        if(position < 1) {
            System.out.print("\nposition should be >= 1.");
        } else if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {

            Node temp = new Node(info);
            temp = head;
            for(int i = 1; i < position-1; i++) {
                if(temp != null) {
                    temp = temp.next;
                }
            }

            if(temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.print("\nThe previous node is null.");
            }
        }
    }

    public void delete1st(){
    head = head.next;
    }
    public void deletelast(){
    Node linkedlist = head;
    while(linkedlist.next.next !=null)
        linkedlist = linkedlist.next;
    linkedlist.next = null;
    }
    public void deletespecific(int position){
        if(position < 1) {
            System.out.print("\nposition should be >= 1.");
        } else if (position == 1 && head != null) {
            Node nodeToDelete = head;
            head = head.next;
            nodeToDelete = null;
        } else {
            Node temp = new Node(position);
            temp = head;
            for(int i = 1; i < position-1; i++) {
                if(temp != null) {
                    temp = temp.next;
                }
            }
            if(temp != null && temp.next != null) {
                Node nodeToDelete = temp.next;
                temp.next = temp.next.next;
                nodeToDelete = null;
            } else {
                System.out.print("\nThe node is already null.");
            }
        }
    }
    //end of program
    //begining of menu driven program
    public void menu(){
        Scanner input = new Scanner(System.in);
        Main o = new Main();

        while(true) {

            System.out.println();
            System.out.println("1. INSERT ELEMENT AT THE BEGINING");
            System.out.println("2. INSERT ELEMENT AT THE END");
            System.out.println("3. INSERT ELEMENT AT THE SPECIFIED POSITION");
            System.out.println("4. DELETE ELEMENT FROM THE BEGINING OF THE LIST");
            System.out.println("5. DELETE ELEMENT AT THE END OF THE LIST");
            System.out.println("6. DELETE ELEMENT AT THE SPECIFIED POSITION");
            System.out.println("7. DISPLAY ELEMENTS OF THE LIST");
            System.out.println("8. EXIT");
            System.out.println("Enter a linkedlist program");
            int choose = input.nextInt();

            o.choose(choose);
        }
    }

    public static Node choose(int choose) {
        Scanner input = new Scanner(System.in);
        Main o = new Main();

            if (choose == 1) {
                System.out.print("Enter element to insert at begining position: ");
                int insert1st = input.nextInt();
                o.insert1st(insert1st);
                o.display();
                o.menu();
            } else if (choose == 2) {
                System.out.print("Enter element to insert at the last position:");
                int insend = input.nextInt();
                o.insertlast(insend);
                o.display();

                o.menu();
            } else if (choose == 3) {
                System.out.print("Enter element to insert at a specific position: ");
                int specific = input.nextInt();
                System.out.print("Enter the specific position: ");
                int position = input.nextInt();
                o.insertspecific(position,specific);
                o.display();
            } else if (choose == 4) {
                o.delete1st();
                o.display();
            } else if (choose == 5) {
                o.deletelast();
                o.display();
            } else if (choose == 6) {
                o.display();
                System.out.println();
                System.out.print("Enter the position to delete: ");
                int position = input.nextInt();
                o.deletespecific(position);
                o.display();
            } else if (choose == 7) {
                o.display();
            } else if (choose == 8) {
                System.exit(0);
            }
        return head;
    }

    public static void main(String[] args) {
    Main o = new Main();
    Scanner input = new Scanner(System.in);
    /*o.insert1st(1);
        o.insert1st(2);
        o.insert1st(3);
        o.display();*/
        o.menu();
    }
}
