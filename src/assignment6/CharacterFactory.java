package assignment6;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<String, Character> characterMap = new HashMap<>();

    public Character getCharacter(char value, String font, int size) {
        String key = value + font + size;
        if (!characterMap.containsKey(key)) {
            Character character = new Character(value, font, size);
            characterMap.put(key, character);
        }
        return characterMap.get(key);
    }

    public int getTotalCharacters() {
        return characterMap.size();
    }
}