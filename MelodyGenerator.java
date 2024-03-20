import java.util.ArrayList;
import java.util.List;

public class MelodyGenerator {
    private static final String[] NOTES = {"C", "D", "E", "F", "G", "A", "B"}; // Musical note names

    public List<Melody> generateAllMelodies() {
        List<Melody> melodies = new ArrayList<>();
        generateMelodiesRecursively(new String[8], 0, melodies);
        return melodies;
    }

    private void generateMelodiesRecursively(String[] currentMelody, int index, List<Melody> melodies) {
        if (index == 8) {
            melodies.add(new Melody(currentMelody.clone()));
            return;
        }
        for (String note : NOTES) {
            currentMelody[index] = note;
            generateMelodiesRecursively(currentMelody.clone(), index + 1, melodies);
        }
    }
}
