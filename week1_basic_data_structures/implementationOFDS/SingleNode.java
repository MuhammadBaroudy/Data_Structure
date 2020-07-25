/**
 * SingleNode
 */
public class SingleNode {

    private int value;
    private SingleNode next;

    public SingleNode(int value){
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    public boolean equals(SingleNode node) {
        return this.value == node.getValue() && this.next == node.next;
    }
}