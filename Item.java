public abstract class Item extends Reference implements Visitee{
    public abstract void add(Item item);
    public abstract void remove(Item item);
    public abstract void print();
}
