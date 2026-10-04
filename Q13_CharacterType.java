import java.util.Scanner;

class CharacterType {
    char character;

    void check() {
        String result = Character.isLetter(character)
                ? ((character == 'a' || character == 'e' || character == 'i' ||
                    character == 'o' || character == 'u' ||
                    character == 'A' || character == 'E' || character == 'I' ||
                    character == 'O' || character == 'U')
                    ? "Vowel" : "Consonant")
                : (Character.isDigit(character) ? "Digit" : "Special Symbol");

        System.out.println("Character type: " + result);
    }
}

public class Q13_CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CharacterType obj = new CharacterType();

        System.out.print("Enter a character: ");
        obj.character = sc.next().charAt(0);

        obj.check();

        sc.close();
    }
}