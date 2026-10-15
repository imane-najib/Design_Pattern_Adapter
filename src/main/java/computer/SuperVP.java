package computer;

public class SuperVP implements Hdmi,VGA{
    @Override
    public void view(byte[] data) {
        System.out.println("????????????? SUPER VP HDMI??????????????");
        String message = new String(data);
        System.out.println(message);
        System.out.println("????????????? SUPER VP HDMI ??????????????");
    }

    @Override
    public void print(String message) {
        System.out.println("=========SUPER VP VGA===========");
        System.out.println(message);
        System.out.println("=========SUPER VP VGA===========");
    }
}
