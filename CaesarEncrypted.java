import java.util.Scanner;

public class caesarencrypted {
    public static void main(String... s) {
        String message, encryptedMessage = "";
        int key;
        char ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nachricht eingeben: ");
        message = sc.nextLine();

        System.out.println("Schlüssel eingeben: ");
        key = sc.nextInt();

        for (int i = 0; i < message.length(); ++i) {
            ch = message.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) (base + (ch - base + key) % 26);
            }

            encryptedMessage += ch;
        }

        System.out.println("verschlüsselte Nachricht = " + encryptedMessage);
        sc.close();
    }
}
