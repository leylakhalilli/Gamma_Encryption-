import java.util.Scanner;
class Encryption {

    static void encryption(String number1, String number2) {

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < number1.length(); i++) {
            sb.append(number1.charAt(i) ^ number2.charAt(i));
        }
        System.out.println("encrypted word-" + sb);
    }

    static void decryption(String number2, String sb) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < number2.length(); i++) {
            s.append(number2.charAt(i) ^ sb.charAt(i));
        }
        System.out.println("decrypted word-" + s);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("introductory word:");
        String number1 = scan.next();
        System.out.print("Gamma word:");
        String number2 = scan.next();
        Encryption.encryption(number1, number2);
        System.out.println("");
        System.out.print("encrypted word:");
        String sb = scan.next();
        Encryption.decryption(number2, sb);
    }

}
