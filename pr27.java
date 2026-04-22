import java.io.*;

public class pr27 {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");
            fw.write("1 Bansi 85\n");
            fw.write("2 Raj 78\n");
            fw.write("3 Amit 90\n");
            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error occurred");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}

// Output:
// 1 Bansi 85
// 2 Raj 78
// 3 Amit 90
