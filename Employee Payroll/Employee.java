/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;


public class Employee {

    private String id;
    private String name;

    public Employee() {
        id = "";
        name = "";
    }

    public Employee(String i, String n) {
        id = i;
        name = n;
    }

    public void setId(String i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "\nName: " + name;
    } 
}
