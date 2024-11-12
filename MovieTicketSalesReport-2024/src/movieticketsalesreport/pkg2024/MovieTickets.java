/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieticketsalesreport.pkg2024;

/**
 *
 * @author camry
 */
class MovieTickets implements IMovieTickets 
{
  // Declare a 2D array to store movie ticket sales for each movie over 3 months
    private int[][] sales = {
        {3000, 1500, 1700},  // Sales for Movie A in Month 1, Month 2, and Month 3
        {3500, 1200, 1600}   // Sales for Movie B in Month 1, Month 2, and Month 3
    };
    
    // Declare an array to store total sales for each movie
    private int[] totalSales = new int[2]; // Total sales for Movie A and Movie B
    private String[] movieNames = {"Napoleon", "Oppenheimer"}; // Movie names
    private String[] months = {"Jan", "Feb", "Mar"}; // Month names for Jan, Feb, and Mar
    // Method to calculate total sales for each movie
    @Override
    public void calculateMovieSales() {
        // Loop through the 2D array to calculate the total sales for each movie
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                totalSales[i] += sales[i][j];  // Add sales for the current movie
            }
        }
    }
    
    // Method to determine the top-performing movie
    @Override
    public String getTopPerformingMovie() {
        // Find the movie with the highest total sales
        int maxSales = totalSales[0];  // Assume Movie A has the highest sales initially
        String topMovie = movieNames[0];
        
        // Compare total sales of Movie A and Movie B
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                topMovie = movieNames[i]; // Update top-performing movie
            }
        }
        
        return topMovie + " with total sales of " + maxSales + " tickets.";
    }

    // Method to generate a detailed report of movie sales
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        
        // Loop through the movies and months to generate a sales report
        for (int i = 0; i < sales.length; i++) {
            report.append(movieNames[i]).append(" Sales Report:\n");
            for (int j = 0; j < sales[i].length; j++) {
                report.append("  Month ").append(j + 1).append(": ").append(sales[i][j]).append(" tickets\n");
            }
            report.append("Total Sales for ").append(movieNames[i]).append(": ").append(totalSales[i]).append(" tickets\n\n");
        }
        
        return report.toString();  
}
    // Getter for total sales
    public int[] getTotalSales() {
        return totalSales;
    }

    // Setter for sales (for testing purposes)
    public void setSales(int[][] sales) {
        this.sales = sales;
        this.totalSales = new int[2]; // Reset total sales
}
}
