public class Android implements OperatingSystem{

    @Override
    public void print(String text) {
        if (text != null)
            System.out.println("@Android: " + text);
    }

    @Override
    public String getName() {
        return "Android";
    }
}
