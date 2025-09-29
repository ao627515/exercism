
class BirdWatcher {
    private int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
       return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {

        for (int numberOfBirds: birdsPerDay){
            if(numberOfBirds == 0)
                return true;
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {

        int numberOfBirds = 0;

        for (int i = 0; i < numberOfDays; i++){
            if(i == birdsPerDay.length)
                break;
            numberOfBirds+=birdsPerDay[i];
        }

        return  numberOfBirds;
    }

    public int getBusyDays() {
        int numberOfDaysBusy = 0;
        for (int numberOfBirds: birdsPerDay){
            if(numberOfBirds >= 5)
                numberOfDaysBusy++;
        }

        return numberOfDaysBusy;
    }
}
