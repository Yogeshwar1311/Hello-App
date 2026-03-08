import java.util.HashMap;

public class OOPSBannerApp8 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, " ***   ***   *****   ***** ");
        map.put(2, "** ** ** **  **  **  **    ");
        map.put(3, "** ** ** **  **  **  **    ");
        map.put(4, "** ** ** **  *****   ****  ");
        map.put(5, "** ** ** **  **         ** ");
        map.put(6, "** ** ** **  **         ** ");
        map.put(7, " ***   ***   **      ***** ");

        for (int i = 1; i <= map.size(); i++) {
            System.out.println(map.get(i));
        }
    }
}