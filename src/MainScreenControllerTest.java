import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Unit Tests for MainScreenController

/* "As a driver, I need the system to display status information (current source, volume level, navigation status)
on the main screen so that I have full awareness of the system state at a glance."*/

public class MainScreenControllerTest {

    private MainScreenController controller;

    @BeforeEach
    void setUp() {
        controller = new MainScreenController();
    }

    // Unit Test 1: Volume Level Display

    // Verifies that when the driver adjusts the volume, the main screen correctly reflects the updated volume level.

    @Test
    void testVolumeLevelDisplaysCorrectly() {
        // Arrange: choose a volume level to set
        int expectedVolume = 23;

        // Act: set the volume through the controller
        controller.setVolumeLevel(expectedVolume);

        // Assert: the displayed volume matches what was set
        assertEquals(expectedVolume, controller.getVolumeLevel(),
            "Volume level displayed on screen should match the value that was set.");
    }

    // Unit Test 2: Audio Source Display

    // Verifies that when the driver switches the audio source, the main screen correctly shows the active source.

    @Test
    void testAudioSourceDisplaysCorrectly() {
        // Arrange: define the expected audio source
        String expectedSource = "Bluetooth";

        // Act: update the audio source
        controller.setAudioSource(expectedSource);

        // Assert: the displayed source matches what was set
        assertEquals(expectedSource, controller.getAudioSource(),
            "Audio source displayed on screen should match the selected source.");
    }
}
