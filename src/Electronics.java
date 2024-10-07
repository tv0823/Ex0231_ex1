public class Electronics extends Product{
    public Electronics(Double price, String description, String name) {
        super(price, description, name);
    }

    @Override
    public String getName()
    {
        return "name of electronics is: " + super.getName();
    }

    @Override
    public double getPrice()
    {
        return super.getPrice() + 1;
    }

    @Override
    public String getDescription()
    {
        return "The descriptions of the electronics is" + super.getDescription();
    }
}
