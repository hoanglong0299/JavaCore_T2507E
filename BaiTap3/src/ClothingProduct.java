public class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String productID, String name, double price, String size) {
        super(productID, name, price);
        this.size = size;
    }

    public String getsize() {
        return size;
    }

    public void setSize(String size) {
        size = size;
    }
    public String getInfo(){
        return super.getInfo() + "Sản phẩm có size:" +size;
    }

    public double calculateDiscountPrice(){
        return getPrice() * 0.85;
    }
}
