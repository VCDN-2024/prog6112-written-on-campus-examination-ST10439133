/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package movieticketsalesreport.pkg2024;

/**
 *
 * @author camry
 */
 interface IMovieTickets 
{
 // Method to calculate the total movie sales for each movie
    void calculateMovieSales();
    
    // Method to find the top-performing movie based on total sales
    String getTopPerformingMovie();   
}
