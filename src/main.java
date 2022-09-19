import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        try {
            // read csv file
            Scanner inFile = new Scanner(new FileReader(args[0]));
            // create list of lists to save data
            ArrayList<List<Integer>> file = new ArrayList<>();

            // save data
            setup.createList(inFile, file);

            // true positive, true negative, false positive, false negative
            int TP = 0;
            int TN = 0;
            int FP = 0;
            int FN = 0;

            // formula for y
            int[] formula = new int[] {24, -15, -38, -7, -41, 35, 0, -2, 19, 33, -3, 7, 3, -47, 26, 10, 40, -1, 3, 0};

            List<Integer> dataLine;
            int y = 0;

            for(int i = 0; i < file.size(); i++) {
                y = 0;
                dataLine = file.get(i);
                for(int j = 0; j < formula.length; j++) {
                    y += dataLine.get(j) * formula[j];
                }
                y -= 6;
                if(y > 0) {
                    if(dataLine.get(dataLine.size()-1) == 1)
                        TP++;
                    else
                        FN++;
                } else {
                    if(dataLine.get(dataLine.size()-1) == 1)
                        FP++;
                    else
                        TN++;
                }
            }

            System.out.println("TP is " + TP);
            System.out.println("TN is " + TN);
            System.out.println("FP is " + FP);
            System.out.println("FN is " + FN);

            float Accuracy = (float)(TP + TN) / (float)(TP + FN + FP + TN);

            System.out.println("The accuracy is " + Accuracy);

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist or is not proper file.");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter file to analyze");
        }
    }
}
