import java.util.ArrayList;
import java.util.List;

public class Phone extends Product{
    private String name_;
    private final int price_;
    private OperatingSystem os_;
    private List<String> messages_;

    public Phone(String name, int price)
    {
        name_ = name;
        price_ = price;
        os_ = null;
        messages_ = new ArrayList<>();
    }

    public void addMessage(String message)
    {
        messages_.add(message);
    }

    public void removeMessage(String message)
    {
        messages_.remove(message);
    }

    public void setOS(OSTypes os)
    {
        os_ = (new OSFactory()).create(os);
    }

    public int getPrice()
    {
        return price_;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name_);
        System.out.println("Price: " + price_);

        if (os_ == null)
            System.out.println("OS: N/A");
        else
            System.out.println("OS: " + os_.getName());

        System.out.println("Messages: ");

        for (String message : messages_)
        {
            if (os_ != null)
                os_.print(message);
        }
    }

    public void accept(Visitor visitor) { visitor.visitPhone(this); }
}
