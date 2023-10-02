import java.util.*; 

public class Main{
public static Node head = null;
Node tail = null;
Node next = null; 
Node prev = null; 
int info; 

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
Node current = head; 

if(head == null){
return; 
}else{
System.out.println("The nodes of the doubly linked list are: "); 
while(current!=null){
System.out.print(current.info+" "); 
current = current.next; 
}
}
}

//4.SEARCH THE LIST FOR A GIVEN ITEM
public void search(int search){
Node temp = new Node(info); 
temp = this.head; 
}

public void menu(){
Scanner input = new Scanner(System.in); 
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
 
}

public static void choose(int choose){
//if()

}

public static void main(String[]args){
Main j1 = new Main(); 
j1.menu(); 
}


}