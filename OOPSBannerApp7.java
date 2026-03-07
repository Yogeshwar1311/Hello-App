public class OOPSBannerApp7 {

    // Static inner class
    static class Printer {

        void display() {

            String[] lines = {
                " ***     ***   *******   ******* ",
                "**  **  ** **  **   **  **       ",
                "**  ** **  **  **   **  **       ",
                "**  ****   **  ******    *****   ",
                "**  ** **  **  **            **  ",
                "**  **  ** **  **            **  ",
                " ***     ***   **        *****   "
            };

            for (String line : lines) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) {

        // Creating object of static inner class
        Printer p = new Printer();

        p.display();
    }
}