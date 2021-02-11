
package linkedlist;

class Linked{
    private node first; 
    //setters & getters to first:
    public node getFirst() {
        return first;
    }
    public void setFirst (int val) {
        first.setData(val);
    }
    
    
    
    public void insertfirst (int val) {               //insert at the first of the link
        node n1 = new node(val);
        if (first==null) {
            first = n1; 
        }
        else {
            n1.setNext(first); 
            first = n1;
        }
    }
    public int deletefirst() {                       //delete the first of the link
        first = first.getNext();
        return first.getData();
    }
    
    public void displayLink () {                     // Display The data at the link
        node current = first ;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    
    public boolean SearchLink(int searchKey) {      //Search for a data
        node current = first ;
        while (current != null) {
            if (current.getData()== searchKey) {
                return true;
            }
            current = current.getNext();
        }
        return false;
        //System.out.println();
    }
    
    public node DeleteItem (int Key) {             // Delete Item from the link
        node current = first ;
        node previous = first;
        while (current.getData() != Key) {
            if (current.next == null) {
                return null;
            }
            previous = current;
            current = current.getNext();
        }
        if (current == first) {
            first = first.getNext();
        }
        else {
            previous.setNext(current.getNext());
        }
        return current;
    }
    
}


public class LinkedList {

    public static void main(String[] args) {
       
        Linked l=new Linked();
        l.insertfirst(30);
        l.insertfirst(40);
        l.insertfirst(50);
        l.displayLink();
        l.deletefirst();
        l.displayLink();
        System.out.println(l.SearchLink(30));
        System.out.println(l.SearchLink(50));
        System.out.println(l.DeleteItem(30).getData() );
    }
    
}
