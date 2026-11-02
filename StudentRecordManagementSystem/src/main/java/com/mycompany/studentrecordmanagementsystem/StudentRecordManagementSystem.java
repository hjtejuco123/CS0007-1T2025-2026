/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentrecordmanagementsystem;

/**
 *
 * @author hadjitejuco
 * 
 * 
 */
import javax.swing.SwingUtilities;

public class StudentRecordManagementSystem {

     public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new StudentManagementGUI().setVisible(true);
        });
    }
}
