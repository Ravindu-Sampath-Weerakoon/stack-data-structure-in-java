public class DriverForStack {
    public static void main(String[] args) {

        // main method in driver class create for test stack class
        Stack testStack = new Stack();

        // test the isEmpty in stack class

        String myQuestion = "* Is this stack is empty Now?" ;
        String[] myAnswers = {"\tyes, Empty stack now" ,"\tno it is not empty now" };

        testTheIsEmptyMethode(myQuestion, testStack.isEmpty(), myAnswers);
        //output is :
        //* Is this stack is empty Now?
        //	yes, Empty stack now

        // after add the data to the stack
        testStack.push(10);
        testTheIsEmptyMethode(myQuestion, testStack.isEmpty(), myAnswers);
        //output is :
        //* Is this stack is empty Now?
        //	no it is not empty now

        //check the data in peek
        System.out.println("peek is : " + testStack.peek());
        //out put is
        //peek is : 10

        testStack.push(20);
        System.out.println("peek is : " + testStack.peek()); //peek is : 20
        testStack.push(30);
        System.out.println("peek is : " + testStack.peek()); //peek is : 30
        testStack.push(40);
        System.out.println("peek is : " + testStack.peek()); //peek is : 40

        //check the pop
        System.out.println("pop is : " + testStack.pop());
        System.out.println("Now peek is : " + testStack.peek()); //Now peek is : 30

        //check the pop
        System.out.println("pop is : " + testStack.pop());
        System.out.println("Now peek is : " + testStack.peek()); //Now peek is : 20

        //check the pop
        System.out.println("pop is : " + testStack.pop());
        System.out.println("Now peek is : " + testStack.peek()); //Now peek is : 10


        //add new data
        testStack.push(11);
        testStack.push(22);
        testStack.push(33);

        //display all value in stack
        System.out.print("the all values in stack : " );
        testStack.display();


        //all out put
        //* Is this stack is empty Now?
        //	yes, Empty stack now
        //* Is this stack is empty Now?
        //	no it is not empty now
        //peek is : 10
        //peek is : 20
        //peek is : 30
        //peek is : 40
        //pop is : 40
        //Now peek is : 30
        //pop is : 30
        //Now peek is : 20
        //pop is : 20
        //Now peek is : 10
        //the all values in stack : 33 , 22 , 11 , 10



    }

    private static void testTheIsEmptyMethode(String myQuestion, boolean isEmpty, String[] myAnswers) {
        System.out.println(myQuestion);
        if (isEmpty){
            System.out.println(myAnswers[0]);
        }else {
            System.out.println(myAnswers[1]);
        }
    }
}
