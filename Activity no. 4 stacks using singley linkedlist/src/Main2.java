import java.util.*;
class linkedlist{

    private class Node{
        public Node link;
        int data;
        Node Link;
    }

    Node top;

    void stacksusinglinkedlist(){
        this.top = null;
    }


    public boolean isEmpty()
    {
        if(top == null){
            System.out.println("Stack is empty");

        }else{
            System.out.println("Stack is not empty!");
        }
        return top == null;
    }
    public void display(){
        if (top == null) {
            System.out.printf("\nStack Underflow");

        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.printf("%d->", temp.data);
                temp = temp.link;
            }
        }
    }

    public void push(int info){
        Node temp = new Node();
        if(temp == null){
            System.out.println("Stack is full!");
            return;
        }
        temp.data = info;
        temp.link = top;
        top = temp;

    }

    public void pop(){
        if(top == null){
            System.out.println("Stack is empty!");
            return;
        }
        top = (top).link;
    }


    public int peek()
    {
        if (!isEmpty()) {

           System.out.println("Top element is "+top.data);
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void menu(){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("----MENU-----");
            System.out.println("[1] - isEmpty()");
            System.out.println("[2] - Print()");
            System.out.println("[3] - Push()");
            System.out.println("[4] - Pop()");
            System.out.println("[5] - Top()");
            System.out.println("-------------");
            int choose = input.nextInt();
            choose(choose);
        }
    }

    public Node choose(int choose){
        Scanner input = new Scanner(System.in);
        if(choose == 1){
            isEmpty();
        }
        else if(choose == 2){
            display();
        }
        else if (choose == 3) {
            System.out.print("Enter a element: ");
            int num = input.nextInt();
            push(num);

        }
        else if(choose == 4){
            pop();
        }
        else if (choose == 5) {
            peek();
        }
        return top;
    }
}

public class Main2 {
    public static void main(String[] args) {
    linkedlist j1 = new linkedlist();
    j1.menu();
    }
}
