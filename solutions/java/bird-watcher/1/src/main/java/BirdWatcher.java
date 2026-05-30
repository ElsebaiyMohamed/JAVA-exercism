class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int day : birdsPerDay) {
            if (day == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int summ = 0;
        numberOfDays = numberOfDays > birdsPerDay.length ? birdsPerDay.length : numberOfDays;
        for (int i = 0; i < numberOfDays; i++) {
            summ += birdsPerDay[i];
        }
        return summ;
    }

    public int getBusyDays() {
        int count = 0;
        for (int day : birdsPerDay) {
            if (day >= 5) {
                count++;
            }
        }
        return count;
    }
}
