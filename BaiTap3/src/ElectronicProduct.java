public class ElectronicProduct extends Product {
    private int warrantyMonths;
    public ElectronicProduct(String productID, String name, double price, int warrantyMonths ){
        super(productID,name,price);
        this.warrantyMonths =warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    public String getInfo(){
        return super.getInfo()+ "Bảo hành "+ warrantyMonths +"tháng.";
    }

    public double calculateDiscountPrice(){
        if(getPrice() > 10_000_000){
            return getPrice() *0.9;
        }
        return getPrice();
    }
}
