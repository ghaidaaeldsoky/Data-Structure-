
package linkedlist;


public class node {
    int data;
    node next;
    node (int val) {
        data=val;
    }
    public int getData () {
        return data;
    }
    public void setData (int val) {
        data = val;
    }
    public node getNext () {
        return next;
    }
    public void setNext (node n) {
        next = n;
    }
}
