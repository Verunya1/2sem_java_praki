package practice1;

public class Ball {
    private String ballForSport;

    public Ball(String ball) {
     ballForSport = ball;
    }

    public String getBallForSport() {
        return ballForSport;
    }

    public void setBallForSport(String ballForSport) {
        this.ballForSport = ballForSport;
    }

    public static void main(String[] args) {
        Ball ball = new Ball("football");

    }
}
