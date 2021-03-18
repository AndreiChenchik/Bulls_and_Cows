class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        minutes += 1;
        hours += minutes / 60;
        hours = hours % 12;
        hours = (hours == 0) ? 12 : hours;
        minutes %= 60;
    }
}