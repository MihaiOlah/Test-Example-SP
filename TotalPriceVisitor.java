public class TotalPriceVisitor implements Visitor{
    private double totalPricePhones_;
    private double totalPriceChargers_;
    private double totalPriceHeadphones_;

    public TotalPriceVisitor()
    {
        totalPriceChargers_ = totalPriceHeadphones_ = totalPricePhones_ = 0;
    }

    @Override
    public void visitPhone(Phone phone) {
        totalPricePhones_ += phone.getPrice();
    }

    @Override
    public void visitHeadphones(Headphones headphones) {
        totalPriceHeadphones_ += headphones.getPrice();
    }

    @Override
    public void visitCharger(Charger charger) {
        totalPriceChargers_ += charger.getPrice();
    }

    @Override
    public void visitBox(Box box) {
        for (Item item : box.getContent())
        {
            if (item instanceof Box)
            {
                ((Box)item).accept(this);
            }
            else if (item instanceof Phone)
            {
                ((Phone)item).accept(this);
            }
            else if (item instanceof Charger)
            {
                ((Charger)item).accept(this);
            }
            else if (item instanceof Headphones)
            {
                ((Headphones)item).accept(this);
            }

        }
    }

    public void print()
    {
        System.out.println("Phones: " + totalPricePhones_);
        System.out.println("Chargers: " + totalPriceChargers_);
        System.out.println("Headphones: " + totalPriceHeadphones_);
    }
}
