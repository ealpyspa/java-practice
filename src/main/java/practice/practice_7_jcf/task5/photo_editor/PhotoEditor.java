package practice_7_jcf.task5.photo_editor;

import java.util.Stack;

public class PhotoEditor {
    // хранить последние действия
    private Stack<String> actions;

    public PhotoEditor() {
        this.actions = new Stack<>();
    }

    // добавить новое действие
    public void addAction(String action) {
        actions.push(action);
    }
    // иметь возможность откатить последнее действие
    public void undoLastAction() {
        actions.pop();
    }

    public void printActions(){
        System.out.println("All actions: ");
        actions.forEach(System.out::println);
    }
}
