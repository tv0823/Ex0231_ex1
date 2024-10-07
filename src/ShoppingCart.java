public class ShoppingCart {
    private Product[] productList;
    private int index;

    public ShoppingCart() {
        this.productList = new Product[10];
        index = 0;
    }

    public double calculateTotal()
    {
        double sum = 0.0;
        for(Product p : productList)
        {
            sum += p.getPrice();
        }
        return sum;
    }
}
