package assignments;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Hourly extends Employee implements Payroll {

    private double regularPayRate;
    private double hoursWorkedOne;
    private double hoursWorkedTwo;

    protected Hourly(String id, String name, double regPrate) {
        super(id, name);
        regularPayRate = regPrate;
    }

    @Override
    public void setPayPeriodDetails() {
        hoursWorkedOne = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked in week 1: "));
        hoursWorkedTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked in week 2: "));

    }

    @Override
    public double calculatePay() {
     double totalPay = (hoursWorkedOne + hoursWorkedTwo) * regularPayRate;
        if (hoursWorkedOne > 40) {
            totalPay += (hoursWorkedOne - 40) * regularPayRate * 0.5;
        }
        if (hoursWorkedTwo > 40) {
            totalPay += (hoursWorkedTwo - 40) * regularPayRate * 0.5;
        }
        return totalPay;   

    }

     @Override
    public String toString() {
        return getClass().getSimpleName() + "\nName: " + super.getName() + "  ID: " + super.getId()+ "  Pay: $" + calculatePay();
                
                
    }
    
}
