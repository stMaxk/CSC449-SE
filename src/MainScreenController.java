public class MainScreenController {

    private String currentAudioSource;
    private int volumeLevel;
    private String navigationStatus;

    // Volume must stay between 0 and 25
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 25;

    public MainScreenController() {
        this.currentAudioSource = "None";
        this.volumeLevel = 0;
        this.navigationStatus = "No Route";
    }

    // Sets the current audio source (e.g., "Radio", "Bluetooth", "USB").

    public void setAudioSource(String source) {
        if (source == null || source.isEmpty()) {
            throw new IllegalArgumentException("Audio source cannot be null or empty.");
        }
        this.currentAudioSource = source;
    }

    public String getAudioSource() {
        return currentAudioSource;
    }

    // Sets the volume level. Must be between MIN_VOLUME and MAX_VOLUME.

    public void setVolumeLevel(int volume) {
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            throw new IllegalArgumentException(
                    "Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME + "."
            );
        }
        this.volumeLevel = volume;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    //Sets the navigation status (e.g., "En Route to Downtown", "Arrived").

    public void setNavigationStatus(String status) {
        if (status == null || status.isEmpty()) {
            throw new IllegalArgumentException("Navigation status cannot be null or empty.");
        }
        this.navigationStatus = status;
    }

    public String getNavigationStatus() {
        return navigationStatus;
    }
}
