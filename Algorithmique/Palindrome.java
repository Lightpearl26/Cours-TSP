public class Palindrome {
    public static void main(String[] args) throws Exception {
        char[][] words = {
            { 'a', 'n', 'i', 'm', 'a', 'l' },
            { 'r', 'a', 'd', 'a', 'r' },
            { 'r', 'e', 's', 'u', 'm', 'a' },
            { 'r', 'e', 's', 's', 'a', 's', 's', 'e', 'r' },
            { 'r', 'e', 'l', 'a', 'c', 'e', 'r' },
            { 'k', 'a', 'y', 'a', 'k' },
            { 'v', 'i', 'v', 'e', ' ', 'J', 'a', 'v', 'a', ' ', '!' }
        };
        reverseWords(words);
        printWords(words);
    }

    public static void printWord(char[] word) {
        for (int i=0; i<word.length; i++) {
            System.out.print(word[i]);
        }
        System.out.println();
    }

    public static void printWords(char[][] words) {
        for (int i=0; i<words.length; i++) {
            printWord(words[i]);
        }
    }

    public static boolean isPalindrome(char[] word) {
        boolean result = true;
        for (int i=0; i<word.length/2; i++) {
            if (word[i] != word[word.length-i-1]) {
                result = false;
            }
        }
        return result;
    }

    public static void printPalindrome(char[][] words) {
        for (int i=0; i<words.length; i++) {
            if (isPalindrome(words[i])) {
                printWord(words[i]);
            }
        }
    }

    public static void reverseWord(char[] word) {
        for (int i=0; i<word.length/2; i++) {
            char temp = word[i];
            word[i] = word[word.length-i-1];
            word[word.length-i-1] = temp;
        }
    }

    public static void reverseWords(char[][] words) {
        for (int i=0; i<words.length; i++) {
            reverseWord(words[i]);
        }
    }
}
