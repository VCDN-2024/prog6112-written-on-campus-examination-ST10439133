/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movieticketsalesreport.pkg2024;

/**
 *
 * @author camry
 */

import javax.swing.JOptionPane;
public class MovieTicketSalesReport2024 
{

   
    public static void main(String[] args) 
    {
        // Create an instance of the MovieTickets class
        MovieTickets movieTickets = new MovieTickets();
        
        // Calculate the movie sales for each movie
        movieTickets.calculateMovieSales();
        
        // Get the detailed report of movie sales
        String report = movieTickets.generateReport();
        
        // Display the report using JOptionPane
        JOptionPane.showMessageDialog(null, report, "Movie Sales Report", JOptionPane.INFORMATION_MESSAGE);
        
        // Get and display the top-performing movie
        String topMovie = movieTickets.getTopPerformingMovie();
        JOptionPane.showMessageDialog(null, topMovie, "Top Performing Movie", JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
//Title: Estate Agent Report
//Author: ChatGPT
//Date:N/A
//Code version:1
//Availability:https://chatgpt.com/

