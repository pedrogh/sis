/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;

import java.io.IOException;

/**
 * Main class.
 * @author pedro
 */
public class SIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {            
            IEnrollment enrollment = new Enrollment();
            ReadAndScan readAndScan = new ReadAndScan("courses.csv", "students.csv", enrollment);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (InvalidFileTypeException ex) {
            System.out.println(ex.getMessage());
        } catch (FailedToParseFileLineException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
