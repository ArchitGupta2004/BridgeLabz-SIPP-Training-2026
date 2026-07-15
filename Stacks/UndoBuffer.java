public class UndoBuffer {
    private String[] data;
    private int top;
    
    public UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    public boolean push(String edit) {
        if (top == data.length - 1) return false; 
        data[++top] = edit;
        return true;
    }
    
    public String pop() {
        if (isEmpty()) throw new RuntimeException("Nothing to undo");
        return data[top--];
    }
    
    public boolean isEmpty() { 
        return top == -1; 
    }
    
    public String peek() {
        if (isEmpty()) throw new RuntimeException("Nothing to undo");
        return data[top];
    }

    public static void main(String[] args) {
        System.out.println("Scenario 1: Array-Based Stack — Fixed-Depth Undo Buffer");
        UndoBuffer buffer = new UndoBuffer(3);
        buffer.push("Edit 1");
        buffer.push("Edit 2");
        buffer.push("Edit 3");
        
        System.out.println("Pushed 3 edits. Try to push 4th: " + buffer.push("Edit 4"));
        
        System.out.println("Popping: " + buffer.pop());
        System.out.println("Popping: " + buffer.pop());
        
        buffer.push("Edit 4 (new)");
        System.out.println("Peek top: " + buffer.peek());
        
        System.out.println("Popping: " + buffer.pop());
        System.out.println("Popping: " + buffer.pop());
    }
}
