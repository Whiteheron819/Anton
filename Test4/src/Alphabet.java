public class Alphabet {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Y'; ch++) {
            if (ch % 2 != 0) {
                char ch2 = (char) (ch + 33);
                System.out.print(" " + ch + " " + ch2);
            }
        }
    }
}
