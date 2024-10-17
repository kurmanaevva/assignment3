package assignment6;

public class TextEditorApp {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        TextEditor textEditor = new TextEditor(characterFactory);

        textEditor.insertCharacter('H', "Arial", 12, 0, 0);
        textEditor.insertCharacter('e', "Arial", 12, 10, 0);
        textEditor.insertCharacter('l', "Arial", 12, 20, 0);
        textEditor.insertCharacter('l', "Arial", 12, 30, 0);
        textEditor.insertCharacter('o', "Arial", 12, 40, 0);
        textEditor.insertCharacter(' ', "Arial", 12, 50, 0);
        textEditor.insertCharacter('W', "Arial", 12, 60, 0);
        textEditor.insertCharacter('o', "Arial", 12, 70, 0);
        textEditor.insertCharacter('r', "Arial", 12, 80, 0);
        textEditor.insertCharacter('l', "Arial", 12, 90, 0);
        textEditor.insertCharacter('d', "Arial", 12, 100, 0);

        textEditor.renderDocument();

        System.out.println("Total unique characters created: " + characterFactory.getTotalCharacters());
    }
}