import org.junit.Test;

public class ProductTest {

@Test
public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
// Arrange
String[] products = {
"Cozy Nights Monarch mattress",
"Restonic Barbados mattress",
"Sealy Phuket mattress"
};
int[][] sales = {
{25, 18, 20}, // Total = 63
{15, 10, 12}, // Total = 37
{18, 15, 20} // Total = 53
}; // Grand Total = 153

Product product = new Product(products, sales);

// Act
int totalSales = product.GetTotalProductsSold();

// Assert
assertEquals(153, totalSales);
}

@Test
public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
// Arrange
String[] products = {
"Cozy Nights Monarch mattress",
"Restonic Barbados mattress",
"Sealy Phuket mattress"
};
int[][] sales = {
{25, 18, 20},
{15, 10, 12},
{18, 15, 20}
}; // Grand Total = 153, divided by 3 products = 51.0 average total per product

Product product = new Product(products, sales);

// Act
double averageSales = product.GetAverageProductSold();

// Assert
assertEquals(51.0, averageSales, 0.01);
}

    private void assertEquals(int totalSales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}