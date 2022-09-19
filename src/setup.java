import java.util.*;

public class setup {
    static void createList(Scanner inFile, ArrayList<List<Integer>> file) {
        String[] stringAry;
        int[] intAry;
        List<Integer> result;

        // dummy string to skip index.
        stringAry = inFile.nextLine().split(",");

        while(inFile.hasNext()) {
            result = new ArrayList<>();
            stringAry = inFile.nextLine().split(",");
            intAry = new int[stringAry.length];

            for(int i = 0; i < stringAry.length; i++) {
                intAry[i] = Integer.valueOf(stringAry[i]);
            }

            for (int i : intAry) {
                result.add(i);
            }
            file.add(result);
        }
    }
}
