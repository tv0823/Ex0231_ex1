public class ShoppingCart {
    private Product[] productList;

    public ShoppingCart() {
        this.productList = new Product[10];
    }

    public double calculateTotal()
    {
        double sum = 0.0;
        for(Product p : this.productList)
        {
            sum += p.getPrice();
        }
        return sum;
    }
}
