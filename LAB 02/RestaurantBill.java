import javax.swing.JOptionPane;


//@author ats60

public class RestaurantBill {
    public static void main(String[] args) {
        final double TAX_RATE = 0.075, TIP_RATE = 0.18;
        double bill, tax, tip, total;
        String input, output;
        
        input = JOptionPane.showInputDialog("Please enter the total bill amount: ");
        bill = Double.parseDouble(input);
        
        tax = bill*TAX_RATE;
        tip = bill*TIP_RATE;
        total = tip + bill + tax;
        
        output = String.format("The tax is %.2f.\nThe tip is %.2f.\nThe total is %.2f.", tax, tip, total);
        JOptionPane.showMessageDialog(null, output);
    }
    
}
