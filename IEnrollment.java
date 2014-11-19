/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;

/**
 *
 * @author pedro
 */
public interface IEnrollment {
    public void addCourse(Course course);
    public void addStudentToCourse(Student student);
    public void printEnrollment();
}
