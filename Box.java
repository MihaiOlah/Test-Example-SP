import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box extends Item implements Visitee{
    List<Item> content_;

    public Box()
    {
        content_ = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (!item.getParent())
        {
            content_.add(item);
            item.setParent(true);
        }
    }

    @Override
    public void remove(Item item) {
        if (content_.remove(item))
        {
            item.setParent(false);
        }
    }

    @Override
    public void print() {
        System.out.println("Box:");

        for (Item item : content_)
        {
            item.print();
        }
    }

    public  List<Item> getContent()
    {
        return Collections.unmodifiableList(content_);
    }

    public void accept(Visitor visitor)
    {
        visitor.visitBox(this);
    }
}
