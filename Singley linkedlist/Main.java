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

    public void insertspecific(Node list,int info){
    Node newNode = new Node(info);
    newNode.next = list.next;
    list.next = newNode;
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
    public void deletespecific(int deletespecific){
    Node temp = head;
    Node prev = null;
    if(temp !=null && temp.info == deletespecific){
        head = temp.next;
        return;
    }
    // finding the key to be deleted

        while(temp !=null && temp.info !=deletespecific){
            prev = temp;
            temp = temp.next;
        }
        // if element is not present
        if(temp == null) return;
        //removing the node
        prev.next = temp.next;
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
                o.insertspecific(head.next,specific);
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
                System.out.print("From the above list, enter an element to delete: ");
                int info = input.nextInt();
                o.deletespecific(info);
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
