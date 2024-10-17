package assignment6;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private CharacterFactory characterFactory;
    private List<CharacterPosition> characters;

    public TextEditor(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
        this.characters = new ArrayList<>();
    }

    public void insertCharacter(char value, String font, int size, int x, int y) {
        Character character = characterFactory.getCharacter(value, font, size);
        characters.add(new CharacterPosition(character, x, y));
    }

    public void renderDocument() {
        for (CharacterPosition characterPosition : characters) {
            characterPosition.render();
        }
    }

    private static class CharacterPosition {
        private Character character;
        private int x, y;

        public CharacterPosition(Character character, int x, int y) {
            this.character = character;
            this.x = x;
            this.y = y;
        }

        public void render() {
            character.render(x, y);
        }
    }
}