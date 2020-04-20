import java.util.Scanner;

public class LengthArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i = 0;
        System.out.println("Введи размер массива: ");
        int size = s.nextInt();
        String s1 = s.nextLine();
        String[] words = new String[size];
        System.out.println("Введи значения массива: ");
        for (i = 0; i < size; i++) {
            words[i] = s.nextLine();
        }
        int maxLengthWord = 0;
        for (int j = 0; j < words.length; j++) {
            if (words[j].length() > maxLengthWord){
                maxLengthWord = words[j].length();
            }
        }
        for (int j = 0; j < words.length; j++) {
            if (words[j].length() == maxLengthWord){
                System.out.println(words[j]);
            }
        }
    }
}
