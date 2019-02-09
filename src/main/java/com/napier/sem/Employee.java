package com.napier.sem;

/**
 * Represents an employee
 */
public class Employee {
    /**
     * Employee number
     */
    public int emp_no;

    /**
     * Employee's first name
     */
    public String first_name;

    /**
     * Employee's last name
     */
    public String last_name;

    /**
     * Employee's job title
     */
    public String title;

    /**
     * Employee's salary
     */
    public int salary;

    /**
     * Employee's current department
     */
    public String dept_name;

    /**
     * Employee's manager
     */
    public String manager;


    /**
     * Print employee data to "System.out"
     */
    public void DisplayEmployee() {
        System.out.println(
                this.emp_no + " "
                        + this.first_name + " "
                        + this.last_name + "\n"
                        + this.title + "\n"
                        + "Salary:" + this.salary + "\n"
                        + this.dept_name + "\n"
                        + "Manager: " + this.manager + "\n");
    }
}