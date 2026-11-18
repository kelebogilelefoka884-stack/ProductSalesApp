public class Product implements IProduct {
private String[] productNames;
private int[][] salesData;

public Product(String[] productNames, int[][] salesData) {
this.productNames = productNames;
this.salesData = salesData;
}

@Override
public int GetTotalProductsSold() {
int total = 0;
for (int i = 0; i < salesData.length; i++) {
for (int j = 0; j < salesData[i].length; j++) {
total += salesData[i][j];
}
}
return total;
}

@Override
public double GetAverageProductSold() {
int totalProducts = productNames.length;
if (totalProducts == 0) return 0.0;
return (double) GetTotalProductsSold() / totalProducts;
}

@Override
public String GetMostPopularProduct() {
int maxSales = -1;
String mostPopular = "";

for (int i = 0; i < salesData.length; i++) {
int productTotal = 0;
for (int j = 0; j < salesData[i].length; j++) {
productTotal += salesData[i][j];
}
if (productTotal > maxSales) {
maxSales = productTotal;
mostPopular = productNames[i] + " (" + maxSales + ")";
}
}
return mostPopular;
}
}