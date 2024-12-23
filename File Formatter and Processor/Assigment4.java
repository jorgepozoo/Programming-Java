package com.mycompany.assigment4;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author jorge
 */
public class Assigment4 extends javax.swing.JFrame {

    /**
     * Creates new form Assigment4
     */
    public Assigment4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void fileProcess() {

        String inFileName = inputField.getText();
        String outFileName = outputField.getText();
        int fieldWidth = 0, precision = 0, columns = 0;
        boolean nextStepQuestionMark = true;

        try {
            fieldWidth = Integer.parseInt(fieldWidthField.getText());
            precision = Integer.parseInt(precisionField.getText());
            columns = Integer.parseInt(columnsField.getText());
            if (columns < 1 || columns > 5) {
                JOptionPane.showMessageDialog(this, "Columns must be between 1 and 5", "Error", JOptionPane.ERROR_MESSAGE);
                nextStepQuestionMark = false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input for field width, precision, or columns", "Error", JOptionPane.ERROR_MESSAGE);
            nextStepQuestionMark = false;
        }
        File inputFile = new File(inFileName);
        if (!inputFile.exists()) {
            JOptionPane.showMessageDialog(this, "Input file does not exist", "Error", JOptionPane.ERROR_MESSAGE);
            nextStepQuestionMark = false;
        }
        File outputFile = new File(outFileName);
        if (outputFile.exists()) {
            JOptionPane.showMessageDialog(this, "Output file already exists", "Error", JOptionPane.ERROR_MESSAGE);
            nextStepQuestionMark = false;
        } else {

        }
        if (nextStepQuestionMark) {
            try {
                PrintWriter writeOutput = new PrintWriter(outputFile);
                Scanner scaner = new Scanner(inputFile);
                fieldWidth = Integer.parseInt(fieldWidthField.getText());
                precision = Integer.parseInt(precisionField.getText());
                columns = Integer.parseInt(columnsField.getText());
                int count = 0;
                while (scaner.hasNext()) {
                    double number = scaner.nextDouble();
                    String formattedNumber = String.format("%" + fieldWidth + "." + precision + "f", number);
                    writeOutput.print(formattedNumber);
                    count++;
                    if (count % columns == 0) {
                        writeOutput.println();
                    } else {
                        writeOutput.print(" ");
                    }
                }
                scaner.close();
                writeOutput.close();
                JOptionPane.showMessageDialog(this, "File processing completed successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "Error processing files", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputField = new javax.swing.JTextField();
        browseInput = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        outputField = new javax.swing.JTextField();
        browseOutput = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fieldWidthField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        precisionField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        columnsField = new javax.swing.JTextField();
        processButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("File Processor");

        jLabel1.setText("Input File:");

        browseInput.setText("Browse");
        browseInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseInputActionPerformed(evt);
            }
        });

        jLabel2.setText("Output File:");

        browseOutput.setText("Browse");
        browseOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseOutputActionPerformed(evt);
            }
        });

        jLabel3.setText("Field Width:");

        jLabel4.setText("Pressision:");

        jLabel5.setText("Columns (1-5):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(outputField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(browseInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(browseOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldWidthField, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(columnsField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precisionField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(precisionField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(browseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(browseOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fieldWidthField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(columnsField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        processButton.setText("Process");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseInputActionPerformed
        JFileChooser findInFile = new JFileChooser();
        if (findInFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            inputField.setText(findInFile.getSelectedFile().getAbsolutePath());
            JOptionPane.showMessageDialog(this, "Now write your path and and next to the last \" \\ \" write the name of the new file you want to create\n                                                                   OR \nSelect your path/folder and type the name of the file you want to create on the File Name box.", "Next step", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_browseInputActionPerformed

    private void browseOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseOutputActionPerformed
        JFileChooser findOutpFile = new JFileChooser();
        if (findOutpFile.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            outputField.setText(findOutpFile.getSelectedFile().getAbsolutePath());
        }

    }//GEN-LAST:event_browseOutputActionPerformed

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        fileProcess();
    }//GEN-LAST:event_processButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assigment4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseInput;
    private javax.swing.JButton browseOutput;
    private javax.swing.JTextField columnsField;
    private javax.swing.JTextField fieldWidthField;
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField outputField;
    private javax.swing.JTextField precisionField;
    private javax.swing.JButton processButton;
    // End of variables declaration//GEN-END:variables
}
