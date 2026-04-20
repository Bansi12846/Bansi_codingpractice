import java.io.*;

public class pr26 {
    public static void main(String[] args) {
        int characters = 0;
        int words = 0;
        int lines = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();
                String[] w = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    words += w.length;
                }
            }
            br.close();
            System.out.println("Characters: " + characters);
            System.out.println("Words: " + words);
            System.out.println("Lines: " + lines);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide file name");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

// Run example:
// java Main test.txt

// Output:
// Characters: 120
// Words: 25
// Lines: 5
