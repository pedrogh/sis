/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;

/**
 * An interface that defines what the enrollment class should support.
 * @author pedro
 */
public interface IEnrollment {
    public void addCourse(Course course);
    public void addStudentToCourse(Student student);
    public void printEnrollment();
    public int getNumberOfCourses();
}
