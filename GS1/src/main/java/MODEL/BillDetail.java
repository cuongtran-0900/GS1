package MODEL;

public class BillDetail {
    private String NameProduct;
    private String productId;
    private int quantity;
    private double Price;
    private double subtotal;

    public BillDetail() {
    }

    public BillDetail(String NameProduct, String productId, int quantity, double Price, double subtotal) {
        this.NameProduct = NameProduct;
        this.productId = productId;
        this.quantity = quantity;
        this.Price = Price;
        this.subtotal = subtotal;
    }



    // Getters and Setters

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }  

    public String getNameProduct() {
        return NameProduct;
    }

    public void setNameProduct(String NameProduct) {
        this.NameProduct = NameProduct;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
}