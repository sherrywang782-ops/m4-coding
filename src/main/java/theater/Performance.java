package theater;

/**
 * Class representing a performance of a play..
 */
public class Performance {

    private final String playID;
    private int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.setAudience(audience);
    }

    public int getAudience() {
        return audience;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }

    public String getPlayID() {
        return playID;
    }
}
