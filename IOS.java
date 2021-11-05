public class IOS implements OperatingSystem{

    @Override
    public void print(String text) {
        if (text != null)
            System.out.println("@IOS: " + text);
    }

    @Override
    public String getName() {
        return "IOS";
    }
}
