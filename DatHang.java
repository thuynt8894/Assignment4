package Assignment4;

import java.util.ArrayList;

public class DatHang {
    private int ID;
    private int total;
    private ArrayList<Sanpham> productList = new ArrayList<>();

    public void addItem(Sanpham item) {
        if (item.getQuantity() > 0) {
            this.productList.add(item);
            item.setQuantity(item.getQuantity() - 1);
            this.total += item.getPrice();
        } else {
            System.out.println(item.getName() + " out of product");
        }
    }

    public void addItem(Sanpham item, int discount) {
        if (item.getQuantity() > 0) {
            this.productList.add(item);
            item.setQuantity(item.getQuantity() - 1);
            this.total += item.getPrice() * (100 - discount) / 100;
        } else {
            System.out.println(item.getName() + " out of product");
        }
    }

    public ArrayList<Sanpham> getProductList() {
        return productList;
    }

    public int getTotal() {
        return total;
    }
}
