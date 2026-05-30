public class Lasagna {

    int expected_minutes_in_oven = 40;

    public int expectedMinutesInOven() {
        return expected_minutes_in_oven;
    }

    public int remainingMinutesInOven(int actual_minutes_in_oven) {
        return expectedMinutesInOven() - actual_minutes_in_oven;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int minuts) {
        return preparationTimeInMinutes(layers) + minuts;
    }
}
