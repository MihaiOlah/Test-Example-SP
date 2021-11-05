public class WindowsPhone implements OperatingSystem{

    @Override
    public void print(String text) {
        if (text != null)
            System.out.println("@WP: " + text);
    }

    @Override
    public String getName() {
        return "Windows Phone";
    }
}
