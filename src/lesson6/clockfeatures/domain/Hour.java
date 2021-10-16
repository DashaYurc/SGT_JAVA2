package lesson6.clockfeatures.domain;

/**
 * Hour should represent a value between 0 and 24
 */
public class Hour {

    private byte hour;

    public Hour() {
    }

    public Hour(byte hour) {
        this.setHour(hour);
    }

    public byte getHour() {
        return hour;
    }

    /**
     * Validation is in place
     * byte values between 0 and 24 are allowed
     * @param hour - byte
     */
    public void setHour(byte hour) {

        if( hour < 0){
            return;
        } else if ( hour > 24){
            return;
        }
        this.hour = hour;
    }
}
