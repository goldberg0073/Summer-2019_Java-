package collection;

import java.util.HashMap;


public class CharacterFrequeMap {
    public static void main(String[] args) {

        String str = "AFB$NBNAFZGVFTGFVGTLO";
        char c = firstNonRepeatedCharacter(str);

        char d = FirstNotRepeat(str);
        System.out.println("The first non repeated character is :  " + d);
    }

    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> characterhashtable = new HashMap<Character, Integer>();
        int i, length;
        Character c;
        length = str.length();  // Scan string and build hash table
        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (characterhashtable.containsKey(c)) {
                // increment count corresponding to c
                characterhashtable.put(c, characterhashtable.get(c) + 1);
            } else {
                characterhashtable.put(c, 1);
            }
        }
        // Search characterhashtable in in order of string str

        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (characterhashtable.get(c) == 1)
                return c;
        }
        return null;
    }

    public static Character FirstNotRepeat(String str) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();

        Character c;
        int i,Length=str.length();

        for ( i = 0; i < Length; i++) {
             c = str.charAt(i);
            if (characterIntegerHashMap.containsKey(c)) {
                characterIntegerHashMap.put(c, characterIntegerHashMap.get(c) + 1);
            } else {
                characterIntegerHashMap.put(c, 1);
            }
        }
        for ( i = 0; i < Length; i++) {
            c = str.charAt(i);
            if (characterIntegerHashMap.get(c) == 1)
                return c;


        }
        return null;
    }
}