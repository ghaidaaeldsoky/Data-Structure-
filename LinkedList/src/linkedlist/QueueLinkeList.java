
package linkedlist;


// Double ended Linked List
public class QueueLinkeList {
    private node first;
    private node last;
    
    public void enqueue (int val) { // INSERT AT THE END OF LINKEDLIST
        node n1 = new node(val);
        if (first == null) {
            first= n1;
        }
        else {
            last.setNext(n1);
            last = n1;
        }
    }
    
    public int dequeue () {         // DELETE THE FIRST NODE AT THE LINKEDLIST
        int odata = first.getData();
        
        if (first.getNext() == null) {
            last = null;
        }
        
        first = first.getNext();
        return odata;
    }
}
