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

            // Linear model for y
            int[] model = new int[] {24, -15, -38, -7, -41, 35, 0, -2, 19, 33, -3, 7, 3, -47, 26, 10, 40, -1, 3, 0};
            int constant = -1000;

            List<Integer> dataLine;
            int y = 0;

            for(int i = 0; i < file.size(); i++) {
                y = 0;
                dataLine = file.get(i);
                for(int j = 0; j < model.length; j++) {
                    y += dataLine.get(j) * model[j];
                }
                y -= constant;
                if(y > 0) {
                    if(dataLine.get(dataLine.size()-1) == 1)
                        TP++;
                    else
                        FP++;
                } else {
                    if(dataLine.get(dataLine.size()-1) == 1)
                        FN++;
                    else
                        TN++;
                }
            }

            System.out.println("TP: " + TP);
            System.out.println("TN: " + TN);
            System.out.println("FP: " + FP);
            System.out.println("FN: " + FN);

            float Accuracy = (float)(TP + TN) / (float)(TP + FN + FP + TN);

            System.out.println("The accuracy is " + Accuracy);

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist or is not proper file.");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter file to analyze");
        }
    }
}
