import java.util.List;

public class Main {
    public static void main(String[] args) {
        MelodyGenerator generator = new MelodyGenerator();
        MelodySaver saver = new MelodySaver();
        List<Melody> melodies = generator.generateAllMelodies();
        saver.saveMelodies(melodies);
        System.out.println("All melodies saved successfully.");
    }
}
