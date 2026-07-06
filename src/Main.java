public class Main {
    public static void main(String[] args) {
        String productSmartphone = "Product No 1: smartphone";
        double totalSmartphone = 12153.41;
        double salesSmartphone = (totalSmartphone / 5 );

        System.out.println(productSmartphone);
        System.out.println("total sales for 5 days is EUR " + totalSmartphone );
        System.out.println("by day is EUR " + salesSmartphone );


        String productLaptop = "Product No 2: laptop";
        double totalLaptop = 10486.85;
        double salesLaptop = (totalSmartphone / 7 );


        System.out.println(productLaptop);
        System.out.println("total sales for 7 days is EUR " + totalLaptop );
        System.out.printf("Sales by day is EUR %.2f%n", salesLaptop);
    }

}
