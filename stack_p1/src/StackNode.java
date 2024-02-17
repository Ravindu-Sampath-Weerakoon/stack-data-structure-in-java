public class StackNode {
    private StackNode next;
    private int data;

    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }


    //getter/setter

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

}
