import java.io.*;

public class pr28{
    public static void main(String[] args) {
        int lines = 0;
        int words = 0;
        int characters = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                String trimmed = line.trim();
                if (trimmed.length() > 0) {
                    String[] w = trimmed.split("\\s+");
                    words += w.length;
                }

                characters += line.replace(" ", "").length();
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters (no spaces): " + characters);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

// Example Output:
// Lines: 5
// Words: 20
// Characters (no spaces): 95
