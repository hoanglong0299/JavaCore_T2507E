public class FoodProduct extends Product {
    private int expiryDays;


    public FoodProduct(String productID, String name, double price, int expiryDays) {
        super(productID, name, price);
        this.expiryDays = expiryDays;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    public void setExpiryDays(int expiryDays) {
        this.expiryDays = expiryDays;
    }

    public String getInfo(){
        return super.getInfo() + "Hạn dùng còn" + expiryDays +"ngày.";
    }
    public double calculateDiscountPrice(){
        if (expiryDays <  3){
            return getPrice() *0.7;
        } else if (expiryDays <=7) {
            return getPrice() *0.9;
        }
        return getPrice();
    }
}
