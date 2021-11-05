public class Headphones extends Product{
    private String name_;
    private final int price_;

    public Headphones(String name, int price)
    {
        name_ = name;
        price_ = price;
    }

    public int getPrice()
    {
        return price_;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name_);
        System.out.println("Price: " + price_);
    }

    public void accept(Visitor visitor) { visitor.visitHeadphones(this); }
}
