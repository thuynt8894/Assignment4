package Assignment4;

public class Main {
    public static void main(String[] args) {
        DatHang order = new DatHang();
        Sanpham sp1 = new Sanpham(1, "Sanpham 1", 120, 20);
        Sanpham sp2 = new Sanpham(2, "Sanpham 2", 215, 0);
        Sanpham sp3 = new Sanpham(3, "Sanpham 3", 116, 25);

        order.addItem(sp1);
        order.addItem(sp2);
        order.addItem(sp3, 15);

        System.out.println("Danh sach san pham");
        for (Sanpham item: order.getProductList()) {
            System.out.println(item.getName());
        }
        System.out.println("Tong so tien:");
        System.out.println(order.getTotal());
    }
}
