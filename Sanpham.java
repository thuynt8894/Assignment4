package Assignment4;

public class Sanpham {
    private int ID;
    private String name;
    private int price;
    private int quantity;

    public Sanpham(int ID, String name, int price, int quantity) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
