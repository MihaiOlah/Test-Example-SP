public abstract class Product extends Item{
    public void add(Item item) {
        throw new UnsupportedOperationException();
    }

    public void remove(Item item) {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
