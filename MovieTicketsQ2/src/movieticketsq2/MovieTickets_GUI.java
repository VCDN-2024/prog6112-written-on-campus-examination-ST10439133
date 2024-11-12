/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movieticketsq2;

/**
 *
 * @author camry
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieTickets_GUI extends javax.swing.JFrame 
{
    private JTextArea TicketReport;
    private JTextField movieField, ticketPriceField, numberOfTicketsField;
    private JButton submitButton;

    public MovieTickets_GUI() 
    {
        // Frame setup
        setTitle("Movie Ticket Sales");
        setLayout(new FlowLayout());
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel movieLabel = new JLabel("Movie Name:");
        movieField = new JTextField(15);

        JLabel ticketPriceLabel = new JLabel("Ticket Price:");
        ticketPriceField = new JTextField(10);

        JLabel numberOfTicketsLabel = new JLabel("Number of Tickets:");
        numberOfTicketsField = new JTextField(10);

        submitButton = new JButton("Submit");

        // Text area for displaying report
         JTextArea= new JTextArea(10, 30);
        JTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(JTextArea);

        // Add components to the frame
        add(movieLabel);
        add(movieField);
        add(ticketPriceLabel);
        add(ticketPriceField);
        add(numberOfTicketsLabel);
        add(numberOfTicketsField);
        add(submitButton);
        add(scrollPane);

        // Submit button action listener
        submitButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                // Get data from fields
                String Movie = movieField.getText().trim();
                String TicketPrice = ticketPriceField.getText().trim();
                String NumberOfTickets = numberOfTicketsField.getText().trim();

                // Call validation method
                boolean valid = DataValidation(Movie, TicketPrice, NumberOfTickets);

                // Check if data is valid
                if (valid) {
                    // Append data to the text area if valid
                    JTextArea.append("Movie: " + Movie + "\n");
                  JTextArea.append("Ticket Price: " + TicketPrice + "\n");
                    JTextArea.append("Number of Tickets: " + NumberOfTickets + "\n");
                } else {
                    // Output invalid data message
                    System.out.println("Invalid data type or empty column");
                }
            }
        });

        setVisible(true);
    }

    // Data validation method
    public boolean DataValidation(String Movie, String TicketPrice, String NumberOfTickets) {
        // Check if any field is empty
        if (Movie.isEmpty() || TicketPrice.isEmpty() || NumberOfTickets.isEmpty()) {
            return false; // Return false if any field is empty
        }

        // Check if ticket price is a valid number (double)
        try {
            Double.parseDouble(TicketPrice);
        } catch (NumberFormatException e) {
            return false; // Return false if ticket price is not a valid number
        }

        // Check if number of tickets is a valid integer
        try {
            Integer.parseInt(NumberOfTickets);
        } catch (NumberFormatException e) {
            return false; // Return false if number of tickets is not a valid integer
        }

        return true; // All data is valid
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        movieComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        numTickets = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ticketPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Tools = new javax.swing.JMenu();
        ProcessButton = new javax.swing.JMenuItem();
        ClearMenuItemActionPerformed = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MOVIE:");

        movieComboBox.setBackground(new java.awt.Color(102, 255, 255));
        movieComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Napolean", "Openheimer", "Damsel" }));

        jLabel2.setText("NUMBER OF TICKETS:");

        numTickets.setBackground(new java.awt.Color(51, 255, 255));

        jLabel3.setText("TICKET PRICE:");

        ticketPrice.setBackground(new java.awt.Color(51, 255, 255));

        jLabel4.setText("TICKET REPORT:");

        JTextArea.setBackground(new java.awt.Color(102, 255, 255));
        JTextArea.setColumns(20);
        JTextArea.setRows(5);
        jScrollPane1.setViewportView(JTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ticketPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(movieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(movieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ticketPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        Tools.setText("Tools");

        ProcessButton.setText("Process");
        Tools.add(ProcessButton);

        ClearMenuItemActionPerformed.setText("Clear");
        ClearMenuItemActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearMenuItemActionPerformedActionPerformed(evt);
            }
        });
        Tools.add(ClearMenuItemActionPerformed);

        jMenuBar1.add(Tools);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearMenuItemActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearMenuItemActionPerformedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearMenuItemActionPerformedActionPerformed

   
 

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ClearMenuItemActionPerformed;
    private javax.swing.JTextArea JTextArea;
    private javax.swing.JMenuItem ProcessButton;
    private javax.swing.JMenu Tools;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> movieComboBox;
    private javax.swing.JTextField numTickets;
    private javax.swing.JTextField ticketPrice;
    // End of variables declaration//GEN-END:variables
}
