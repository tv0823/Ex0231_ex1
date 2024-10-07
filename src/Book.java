public class Book extends Product{

    public Book(Double price, String description, String name) {
        super(price, description, name);
    }

    @Override
    public String getName()
    {
        return "book name is: " + super.getName();
    }

    @Override
    public double getPrice()
    {
        return super.getPrice() + 5;
    }

    @Override
    public String getDescription()
    {
        return "The descriptions of the book is" + super.getDescription();
    }
}
