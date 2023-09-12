public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpecs specs;

    public Guitar(String serialNumber, double price, GuitarSpecs specs) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.specs = specs;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpecs getSpecs() {
        return specs;
    }

    public void setSpecs(GuitarSpecs specs) {
        this.specs = specs;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                ", specs=" + specs +
                '}';
    }
}
