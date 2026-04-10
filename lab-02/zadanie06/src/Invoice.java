public class Invoice {
    private String product_number;
    private String product_description;
    private int quantity;
    private double pricePerItem;

    Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
        setProductNumber(product_number);
        setProductDescription(product_description);
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public String getProductNumber() {
        return product_number;
    }

    public void setProductNumber(String product_number) {
        this.product_number = product_number;
    }

    public String getProductDescription() {
        return product_description;
    }

    public void setProductDescription(String product_description) {
        this.product_description = product_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double Amount() {
        if (pricePerItem <= 0) {
            return 0;
        }

        if (quantity <= 0) {
            return 0;
        }

        return quantity * pricePerItem;
    }
}
