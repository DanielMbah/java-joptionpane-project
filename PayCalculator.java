import javax.swing.JOptionPane;

public class PayCalculator {

    public static void main(String[] args) {
        
        //Get input
        double rate = Double.parseDouble(
            JOptionPane.showInputDialog("Enter hourly pay rate:")

        );

        double hours = Double.parseDouble(
            JOptionPane.showInputDialog("Enter hours worked:")

        );

        //Method call
        double grossPay = calculateGross(rate, hours);
        double tax = calculateTax(grossPay);
        double netPay = grossPay - tax;

        //Output
        JOptionPane.showMessageDialog(null,
            "Gross Pay: $" + grossPay +
            "\nTax (15%): $" + tax +
            "\nNet Pay: $" + netPay);

    }

    //Method to calculate Gross Pay
    public static double calculateGross(double rate, double hours) {
        return rate * hours;
    }

    //Method to Calculate Tax
    public static double calculateTax(double gross) {
        return gross * 0.15;
    }

    
        
}
