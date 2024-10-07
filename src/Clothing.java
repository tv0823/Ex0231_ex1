public class Clothing extends Product{
    public Clothing(Double price, String description, String name) {
        super(price, description, name);
    }

    @Override
    public String getName()
    {
        return "name of clothing brand is: " + super.getName();
    }

    @Override
    public double getPrice()
    {
        return super.getPrice() + 2;
    }

    @Override
    public String getDescription()
    {
        return "The descriptions of the clothing is" + super.getDescription();
    }
}
