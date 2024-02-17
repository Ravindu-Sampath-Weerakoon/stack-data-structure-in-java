public class Stack {

    // In stack, only have top
    private StackNode top;

    public Stack (){
        // the stack is initialized as a empty stack there for stack set to the null value
        this.top = null;
    }


    public boolean isEmpty (){
        // creak the top is empty then return the stack is empty. Because the stack need the top
        return top == null;
    }

    public int peek (){
        // peek is the last value which Latestdata
        return top.getData();
    }

    public void push(int data){
        // create a new top. Because the push new data to the stack. Therefore, the top will be changed
        StackNode top = new StackNode(data);

        // if stack is empty the push data will be added the top
        if(this.isEmpty()){
            this.top = top;
            this.top.setNext(null);
            return; // if stack is empty this part is Enough to do function there for end of function
        }

        // set new top with next
        top.setNext(this.top); // set next for new top
        this.top= top; // new top assigned to the current top

    }

    public int pop (){

        if (this.isEmpty()){
            return -999_999;
            // - 999_999 is code value for the empty stack ( Not a Standard code  I decide
        };

        // without temp node
        int  data  = top.getData();
        this.top = top.getNext();
        return data;

    }


    public void display() {
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }

        StackNode node = this.top;

        // use loop to loop until next node is empty
        while (node!= null) {
            // print currant node data
            System.out.print(node.getData() );

            // update node variable to the next node
            node = node.getNext();

            //Final node is empty(null) . therefore don't need ","
            //Therefore decide to use condition
            if (node != null) {
                System.out.print(" , ");
            }
        }

    }



}
