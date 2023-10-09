public class cap{

int size;
int arr[] = new int[size]; 
int choose; 
int top =-1; 
public cap(int size, int choose){
this.size = size; 
this.choose = choose; 
}

// 1. isEmpty()
public void isempty(int arr[]){

if(arr == null){
System.out.print("The array is empty and null"); 
}
}

// 2. Print()

public void print(){
if(top== -1){
System.out.print("Stack is empty"); 
}else{
System.out.println("Array elements");
for(int i = 0; i < this.size; i++){
System.out.println("");
}
}

}
}