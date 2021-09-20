import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GasPrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File inputFile = new File("1994_Weekly_Gas_Averages.txt");
            Scanner fin = new Scanner(inputFile);
            double[] prices = new double[52];
            for(int i = 0; i < 52; i++) {
                prices[i] = fin.nextDouble();
            }
            int lv = findLowestValue(prices);
            System.out.println("The lowest value is in week " + (lv+1) + " and is " + prices[lv]+ " and "
                    + "occurs in " + getMonthForWeek(lv+1));
            
            int hv = findHighestValue(prices);
            System.out.println("\nThe highest value in the week " + (hv+1) + " and is " + prices[hv] +
                    " and " + "occurs in " + getMonthForWeek(hv));
            
            double Jan = 0;
            for(int i = 0; i<4; i++){
                Jan = Jan + prices[i];
            }
            Jan = Jan/4;
            
            double Feb = 0;
            for(int i=4; i<8; i++){
                Feb = Feb + prices[i];
            }
            Feb = Feb/4;
            
            double Mar = 0;
            for(int i=8; i<13; i++){
                Mar = Mar + prices[i];
            }
            Mar = Mar/5;
            
            double Apr = 0;
            for(int i=13; i<17; i++){
                Apr = Apr + prices[i];
            }
            Apr = Apr/4;
            
            double May = 0;
            for(int i=17; i<21; i++){
                May = May + prices[i];
            }
            May = May/4;
            
            double Jun = 0;
            for(int i=21; i<26;i++){
                Jun = Jun + prices[i];
            }
            Jun = Jun/5;
            
            double Jul = 0;
            for(int i=26; i<30; i++){
                Jul = Jul + prices[i];
            }
            Jul = Jul/4;
            
            double Aug = 0;
            for(int i=30; i<35; i++){
                Aug = Aug + prices[i];
            }
            Aug = Aug/5;
            
            double Sep = 0;
            for(int i=35; i<39; i++){
                Sep = Sep + prices[i];
            }
            Sep = Sep/4;
            
            double Oct = 0;
            for(int i=39; i<43; i++){
                Oct = Oct + prices[i];
            }
            Oct = Oct/4;
            
            double Nov = 0;
            for(int i=43; i<48; i++){
                Nov = Nov + prices[i];
            }
            Nov = Nov/5;
            
            double Dec = 0;
            for(int i=48; i<52; i++){
                Dec = Dec + prices[i];
            }
            Dec = Dec/4;
            
            System.out.println("The average for January: " + Jan
            + "\nThe average for February: " + Feb +
            "\nThe average for March: " + Mar +
            "\nThe average for April: " + Apr +
            "\nThe average for May: " + May +
            "\nThe average for June: " + Jun +
            "\nThe average for July: " + Jul +
            "\nThe average for August: " + Aug +
            "\nThe average for September: " + Sep +
            "\nThe average for October: " + Oct +
            "\nThe average for November: " + Nov +
            "\nThe average for December: " + Dec);
            
            fin.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
        }
    }
    
    public static int findLowestValue(double [] values) {
        int index = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[index] > values[i]) {
                index = i;
            }
        }
        return index;
    }
    
    public static int findLowestValue(ArrayList<Double> values) {
        int index = 0;
        for (int i = 1; i < values.size(); i++) {
            if (values.get(index) > values.get(i)) {
                index = i;
            }
        }
        return index;
    }
    
    public static int findHighestValue(double [] values) {
        int index = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[index] < values[i]) {
                index = i;
            }
        }
        return index;
    }
    
    public static int findHighestValue(ArrayList<Double> values) {
        int index = 0;
        for (int i = 1; i < values.size(); i++) {
            if (values.get(index) < values.get(i)) {
                index = i;
            }
        }
        return index;
    }
    
    //Takes in a number between 0 and 51 and returns the month name
    //that week falls in
    public static String getMonthForWeek(int week) {
        if (week < 4)
            return "January";
        else if (week < 8)
            return "February";
        else if (week < 13)
            return "March";
        else if (week < 17)
            return "April";
        else if (week <21)
            return "May";
        else if (week <26)
            return "June";
        else if (week <30)
            return "July";
        else if (week <35)
            return "August";
        else if (week <39)
            return "September";
        else if (week <43)
            return "October";
        else if (week <48)
            return "November";
        else
            return "December";
    }
}
