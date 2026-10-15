package computer;

public class Ecran implements VGA {
    @Override
    public void print(String message) {
        System.out.println("====================");
        System.out.println(message);
        System.out.println("====================");
    }
}
