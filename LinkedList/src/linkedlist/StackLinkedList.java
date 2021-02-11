
package linkedlist;


public class StackLinkedList {
    Linked x=new Linked();
    
    public void push(int val){
        x.insertfirst(val);
    }
    public int pop() {
        return x.deletefirst();
    }
    public int peak (){  
        return x.getFirst().getData();
    }
}
