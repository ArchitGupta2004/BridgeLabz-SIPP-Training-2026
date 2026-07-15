public class CallStack {
    private static class Frame {
        String functionName;
        Frame next;
        Frame(String name, Frame next) { this.functionName = name; this.next = next; }
    }
    
    private Frame top = null;
    
    public void push(String functionName) {
        top = new Frame(functionName, top);
    }
    
    public String pop() {
        if (isEmpty()) throw new RuntimeException("No active call to return from");
        String name = top.functionName;
        top = top.next;
        return name;
    }
    
    public String peek() {
        if (isEmpty()) throw new RuntimeException("No active call");
        return top.functionName;
    }
    
    public boolean isEmpty() { 
        return top == null; 
    }

    public static void main(String[] args) {
        System.out.println("Scenario 2: Linked-List-Based Stack — Unbounded Function Call Tracker");
        CallStack stack = new CallStack();
        stack.push("main()");
        stack.push("foo()");
        stack.push("bar()");
        
        System.out.println("Current active function: " + stack.peek());
        System.out.println("Returning from: " + stack.pop());
        System.out.println("Returning from: " + stack.pop());
        System.out.println("Current active function: " + stack.peek());
        System.out.println("Returning from: " + stack.pop());
        
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
