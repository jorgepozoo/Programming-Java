
package assignments;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Commission extends Employee implements Payroll {
   private double commissionRate;
    private double sales;

    // Constructor
    public Commission(String id, String name, double rate) {
        super(id, name);
        commissionRate = rate;
}
@Override
    public void setPayPeriodDetails() {
        sales = Double.parseDouble(JOptionPane.showInputDialog("Enter sales for the pay period: "));
    }

    @Override
    public double calculatePay() {
        return sales * (commissionRate / 100.0);
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "  ID: " + super.getId()+ "  Pay: $" + calculatePay();
    }
}