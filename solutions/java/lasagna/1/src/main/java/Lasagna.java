public class Lasagna {

    int expected_minutes_in_oven = 40;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return expected_minutes_in_oven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actual_minutes_in_oven) {
        return expected_minutes_in_oven - actual_minutes_in_oven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minuts) {
        return preparationTimeInMinutes(layers) + minuts;
    }
}
