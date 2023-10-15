import java.util.*;
public class cap{
static Scanner input = new Scanner(System.in);
int size;
int arr[];
int choose; 
int top =-1; 
public cap(int size){
arr = new int[size];

}

public void menu() {
    while (true) {
        System.out.println("--------Menu--------");
        System.out.println("[1] - isEmpty");
        System.out.println("[2] - Print");
        System.out.println("[3] - Push");
        System.out.println("[4] - Pop");
        System.out.println("[5] - Top");
        System.out.println("-------------------");
        System.out.println();
        System.out.print("Enter choice: ");
        int choose = input.nextInt();
        choose(choose);
    }

}
public void choose(int choose){
    Scanner input = new Scanner(System.in);
if(choose ==1){
    isEmpty();
}else if(choose == 2){
    print();
}else if(choose == 3) {
elementpush();
}

else if(choose ==4){
    pop();
}
else if(choose == 5){
    top();
}
}

// 1. isEmpty()
public boolean isEmpty() {

    return (top == -1);
}

// 2. Print()

public void print(){
   //arr = new int[size];
    System.out.println("Stack elements from top to bottom: ");
    for (int i = top; i >= 0; i--) {
        System.out.println(arr[i]);
    }

}




// 3. Push()

public void push(int num){
    top++;
    arr[top] = num;
    System.out.println("Element contents: "+num);
}

public void elementpush(){

    if(top == arr.length-1){
        System.out.println("Stack is full!");
    }else {
        try{
            System.out.println("Enter an element: ");
            int element  = input.nextInt();
            push(element);
        }catch (InputMismatchException e){
            System.out.println("Invalid input!");
            input.nextInt();
        }
    }
}

// 4. Pop()
public void pop(){
    if(top == -1){
        System.out.println("Stack is empty!");
    }else{
        arr[top--] = 0;
    }
}

//5. Top()

    public int top(){
    if(top == -1){
        System.out.println("Stack is empty");
        return -1;
    }else{
        System.out.println("Topped element: "+arr[top]);
        return arr[top];

    }
    }
}