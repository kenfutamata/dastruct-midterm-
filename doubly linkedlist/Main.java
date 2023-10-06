import java.util.*; 

public class Main{
public static Node head = null;
Node tail = null;
Node next = null; 
Node prev = null; 
int info; 
public int size = 0;
//1.  DETERMINE WHETHER THE LIST IS EMPTY
public void listisempty(){
Node current = head; 
//if list is empty
if(head == null){
System.out.print("List is empty"); 
return; 
}else{
System.out.print("List is not empty"); 
}
}

// 2. FIND THE LENGTH OF THE LIST
public int length(){
Node size = new Node(info);
size = this.head; 
int i = 0; 
while(size !=null){
i++; 
size = size.next; 
}
return i; 
}

//3. OUTPUT THE LIST
public void display(){
    Node node = head;
    Node end = null;
//as linked list will end when Node reaches Null

    System.out.print ("\nIn forward: ");
    while (node != null)
    {
        System.out.print (node.info + " ");
        end = node;
        node = node.next;
    }

    System.out.print ("\nIn backward: ");

    while (end != null)
    {
        System.out.print (end.info + " ");
        end = end.prev;
    }
    System.out.println ();
}

//4.SEARCH THE LIST FOR A GIVEN ITEM
public void search(int search){
    int i = 1;
    boolean flag = false;
    Node current = head;

    if(head == null){
        System.out.print("List is empty");
    }
    while(current!=null){
        if(current.info == search){
            flag = true;
            break;
        }
        current = current.next;
        i++;
    }

    if(flag){
        System.out.print("Node is present in the list: "+i);
    }else{
        System.out.print("Node is not present in the list");
    }

}


// 5.RETRIEVE THE FIRST ELEMENT OF THE LIST
public void retrieve1st(){

}

    // 6. RETRIEVE THE LAST ELEMENT OF THE LIST
    public void retrievelast(){

    }


//7. INSERT AN ITEM IN THE LIST

    public void addNode(int info){
        Node newNode = new Node (info);

        newNode.next = head;
        newNode .prev = null;

// if DLL had already >=1 nodes
        if (head != null)
            head.prev = newNode;

// changing head to this
        head = newNode;
    }

//  8. DELETE AN ITEM FROM THE LIST
    public void delete(int delete){

    }

public void menu() {
    while (true) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("1. DETERMINE WHETHER THE LIST IS EMPTY");
        System.out.println("2. FIND THE LENGTH OF THE LIST");
        System.out.println("3. OUTPUT THE LIST ");
        System.out.println("4. SEARCH THE LIST FOR A GIVEN ITEM");
        System.out.println("5. RETRIEVE THE FIRST ELEMENT OF THE LIST");
        System.out.println("6. RETRIEVE THE LAST ELEMENT OF THE LIST");
        System.out.println("7. INSERT AN ITEM IN THE LIST");
        System.out.println("8. DELETE AN ITEM FROM THE LIST");
        System.out.println("9. EXIT");
        System.out.print("Choose a program above: ");
        int choose = input.nextInt();
        Main j1 = new Main();
        j1.choose(choose);
    }
}
public static Node choose(int choose){
Main j1 = new Main();
Scanner input = new Scanner(System.in);
    if(choose == 1){
    j1.listisempty();
    }
    else if(choose == 2){
        j1.length();
    }
    else if(choose == 3){
       j1.display();


    }
    else if(choose == 4){
        j1.display();
        System.out.println();
        System.out.print("From the above list (Forward position), enter a node to search: ");
        int search = input.nextInt();
        j1.search(search);
    }

    else if(choose == 5){
        j1.retrieve1st();
    }

    else if(choose == 6){
        j1.retrievelast();
    }

    else if(choose == 7){
        System.out.print("Enter a node: ");
        int insert = input.nextInt();
        j1.addNode(insert);
        j1.display();

    }

    else if(choose == 8){
        j1.display();
        System.out.print("From the above list (Forward position), enter a node to delete: ");
        int delete = input.nextInt();
        j1.delete(delete);
    }

return head;
}

public static void main(String[]args){
Main j1 = new Main(); 
j1.menu(); 
}


}