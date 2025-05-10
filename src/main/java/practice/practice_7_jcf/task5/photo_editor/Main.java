package practice_7_jcf.task5.photo_editor;

public class Main {
    public static void main(String[] args) {
        PhotoEditor photoEditor = new PhotoEditor();

        photoEditor.addAction("Correction of eyes");
        photoEditor.addAction("Correction of ears");
        photoEditor.addAction("Correction of hips");
        photoEditor.addAction("Correction of cheeks");

        photoEditor.printActions();
        photoEditor.undoLastAction();
        photoEditor.undoLastAction();
        photoEditor.printActions();
    }
}
