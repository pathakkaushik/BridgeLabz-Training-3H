package StringFile.level1;

public class NullPointerDemo {

    // Method that generates NullPointerException
    public static void generateNPE() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method that handles NullPointerException
    public static void handleNPE() {
        try {
            String text = null;
            // Trying to access length of null string
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
        }
    }

    public static void main(String[] args) {
        // Uncomment to see program crash
        // generateNPE();

        // Safe handling
        handleNPE();
    }
}
