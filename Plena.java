import java.util.Scanner;

public class Plena {
    public static void main(String[] args) {
        System.out.println("Please input a string");
        Scanner scan = new Scanner(System.in);

        String userString = scan.nextLine();
        char[] letters = userString.toCharArray();
        char letter = letters[0];
        for (int i = 0; i <= letters.length; i++) {
            if (letter == letters[0]) {
                letter = letters[i];
                continue;
            } else {
                break;
            }
        }
        System.out.println("The first non repeating letter is: " + letter);

        char[] newString = new char[letters.length];
        // int count = 0;
        // int highestCount = 0;
        // char nextLetter = letters[0];
        // for(int i = 0; i <= letters.length; i++) {
        // if(letters[i] == letter) {
        // newString[i] = letter;
        // } else {
        // for(int j = 0; j < letters.length - 1; j++) {
        // if(letters[i] == letters[j]) {
        // count++;
        // }
        // if(count > highestCount) {
        // highestCount = count;
        // } else {
        // newString[i] = letters[i];
        // }
        // }
        // }
        // }

        newString[0] = letter;
        System.out.println(letter);
        for (int i = 0; i < letters.length; i++) {
            if(letters[i] == letter) {
                continue;
            } else {
                newString[i] = letters[i]; 
            }
        }
        System.out.println(newString[0]);
        System.out.println(newString);
        scan.close();
    }
}
