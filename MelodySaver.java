import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MelodySaver {
    private static final String FILENAME = "melodies.txt";

    public void saveMelodies(List<Melody> melodies) {
        try {
            FileWriter writer = new FileWriter(FILENAME, false); // Overwrite existing content
            for (Melody melody : melodies) {
                writer.write(melodyToString(melody) + "\n");
            }
            writer.close();
            System.out.println("All melodies saved to " + FILENAME + ".");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String melodyToString(Melody melody) {
        StringBuilder sb = new StringBuilder();
        for (String note : melody.getNotes()) {
            sb.append(note).append(" ");
        }
        return sb.toString().trim();
    }
}
