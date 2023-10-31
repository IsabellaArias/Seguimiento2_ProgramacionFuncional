package BiConsumer;

public class Gym {
    private String food;
    private int days;
    private int relaxDay;

    public Gym(String food, int days, int relaxDay) {
        this.food = food;
        this.days = days;
        this.relaxDay = relaxDay;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getRelaxDay() {
        return relaxDay;
    }

    public void setRelaxDay(int relaxDay) {
        this.relaxDay = relaxDay;
    }
}
