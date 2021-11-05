public class TestMain {
    public static void main(String[] args) throws Exception {
        Box b1 = new Box();
        Charger c1 = new Charger("Incarcator 1", 12);
        Headphones h1 = new Headphones("Casti 1", 30);
        Phone p1 = new Phone("Telefon 1", 240);
        Charger c2 = new Charger("Incarcator 2", 44);
        Phone p2 = new Phone("Telefon 2", 120);

        p1.addMessage("AAA");
        p1.addMessage("BBBB");
        p2.addMessage("CCCC");

        p1.setOS(OSTypes.IOS);
        p1.setOS(OSTypes.WP);

        b1.add(c1);
        b1.add(h1);
        b1.add(p1);
        b1.add(c2);
        b1.add(p2);

        Box b2 = new Box();
        b2.add(p1);
        b2.add(b1);


        //b2.remove(p1);
        b2.print();

        TotalPriceVisitor totalPrices = new TotalPriceVisitor();
        b2.accept(totalPrices);
        totalPrices.print();
    }
}
