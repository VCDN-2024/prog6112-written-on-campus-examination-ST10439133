/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieticketsq2;

/**
 *
 * @author camry
 */
    import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MovieTicketSalesReport 
{

/**
 *
 * @author camry
 */



public class MovieTicketSalesReport implements MovieTicketsQ2
{

    public double CalculateTotalPriceOfMovies(String NumberOfTickets, String TicketPrice) {
        try {
            int numTickets = Integer.parseInt(NumberOfTickets); // Convert number of tickets to integer
            double ticketPrice = Double.parseDouble(TicketPrice); // Convert ticket price to double
            
            // Calculate total price
            return numTickets * ticketPrice;
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format for tickets or price.");
            return 0;
        }
    }

    // Validate data for movie name, ticket price, and number of tickets
    @Override
    public boolean DataValidation(String Movie, String TicketPrice, String NumberOfTickets) {
        if (Movie.isEmpty()) {
            System.out.println("Error: Movie name cannot be empty.");
            return false;
        }
        if (TicketPrice.isEmpty() || NumberOfTickets.isEmpty()) {
            System.out.println("Error: Ticket price and number of tickets cannot be empty.");
            return false;
        }
        
        try {
            Double.parseDouble(TicketPrice); // Check if the ticket price is a valid number
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid ticket price.");
            return false;
        }

        try {
            Integer.parseInt(NumberOfTickets); // Check if the number of tickets is a valid integer
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number of tickets.");
            return false;
        }

        return true;
    }
}


}
