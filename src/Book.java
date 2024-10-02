public class Book extends Product{
    private String author;

    public Book(Double price, String description, String name, String author) {
        super(price, description, name);
        this.author = author;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + " The author is: " + this.author;
    }
}
