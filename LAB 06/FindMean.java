
package findmean;

import java.io.*;
import java.util.*;

//andrew
public class FindMean {

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {
        int num=0;
        double sum=0, mean=0;
        File file = new File("numbers.txt");
        Scanner fin = new Scanner(file);
        while(fin.hasNext()) {
            num++;
            sum= sum+ fin.nextInt();
            //System.out.println();
        }
        mean = (sum/num);
        System.out.println("The number of values is " + num);
        System.out.println("The sum of all the values is " + (int)sum);
        System.out.printf("The mean of the values is %.2f\n", mean);
        fin.close();
    }
    
}
