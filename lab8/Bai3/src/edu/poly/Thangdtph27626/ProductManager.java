package edu.poly.Thangdtph27626;

public class ProductManager {

    public static void main(String[] args) {
        Product pd1 = new Product("iPhone9", 1000.0);
        Product pd2 = new Product("Samsung Start", 3000.0);
        ProductDAO dao = new ProductDAO();
        dao.add(pd1);
        dao.add(pd2);

        Product p = dao.find("iPhone9");
        System.out.printf("Name:%-20s gia: %-10.0f ", p.getName(), p.getPrice());

        ProductDAO dao2 = new ProductDAO();
        dao.store("C:\\Users\\LENOVO\\Desktop\\product.txt");
        dao2.load("C:\\Users\\LENOVO\\Desktop\\product.txt");
    }
}
