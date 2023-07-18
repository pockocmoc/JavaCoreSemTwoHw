public class CaesarCipher {
    public static String caesarCipher(String message, boolean encrypt, int key) {
        StringBuilder result = new StringBuilder();

        if (encrypt) {
            // Зашифрование
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                if (Character.isLetter(ch)) {
                    char shifted = (char) (ch + key);
                    if ((Character.isUpperCase(ch) && shifted > 'Z') || (Character.isLowerCase(ch) && shifted > 'z')) {
                        shifted = (char) (shifted - 26);
                    }
                    result.append(shifted);
                } else {
                    result.append(ch);
                }
            }
        } else {
            // Расшифрование
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                if (Character.isLetter(ch)) {
                    char shifted = (char) (ch - key);
                    if ((Character.isUpperCase(ch) && shifted < 'A') || (Character.isLowerCase(ch) && shifted < 'a')) {
                        shifted = (char) (shifted + 26);
                    }
                    result.append(shifted);
                } else {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}
