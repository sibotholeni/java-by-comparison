package returnbooleandirectly.incorrect;

public class Astronaut {
    
    String name;
    int missions;

    // No need for the if statement as its clutter code
    boolean isValid() {
        if (missions < 0 || name == null || name.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
