class TextState {
    String content;
    TextState prev, next;

    public TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

class TextEditor {
    private TextState head;
    private TextState current;
    private int size = 0;
    private final int LIMIT = 10;
    public void type(String newText) {
        TextState newState = new TextState(newText);
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
        }
        if (head == null) {
            head = newState;
        } else {
            newState.prev = current;
            if (current != null)
                current.next = newState;
        }

        current = newState;
        size++;
        trimHistory();
    }
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed.");
        } else {
            System.out.println("No more undo available.");
        }
    }
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed.");
        } else {
            System.out.println("No more redo available.");
        }
    }
    public void showCurrentText() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor is empty.");
        }
    }
    private void trimHistory() {
        int count = 0;
        TextState temp = current;
        while (temp != null && count < LIMIT) {
            temp = temp.prev;
            count++;
        }

        if (temp != null && temp.prev != null) {
            temp.prev.next = null;
            head = temp;
            head.prev = null;
        }
    }
}
class Main7 {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.type("Hello");
        editor.type("Hello, world!");
        editor.type("Hello, world! Welcome");
        editor.type("Hello, world! Welcome to Java.");
        editor.showCurrentText();
        editor.undo();
        editor.showCurrentText();
        editor.undo();
        editor.showCurrentText();
        editor.redo();
        editor.showCurrentText();
        editor.type("New line after undo.");
        editor.showCurrentText();
        for (int i = 1; i <= 10; i++) {
            editor.type("Edit #" + i);
        }
        editor.showCurrentText();
        editor.undo();
        editor.undo();
        editor.showCurrentText();
    }
}