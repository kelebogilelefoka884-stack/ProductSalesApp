import java.util.Scanner;

public class ProductSalesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Single-dimensional array for product names
        String[] products = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        // Two-dimensional array for sales (3 products x 3 months)
        int[][] sales = new int[3][3];

        // Prompt user for sales data
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + ": ");
                sales[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        // Instantiate Product and PrintProduct classes
        Product productObj = new Product(products, sales);
        PrintProduct printer = new PrintProduct();

        // Print the final report
        printer.printReport(productObj);
        
        scanner.close();
    }
}
   




