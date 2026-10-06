public class Timespan{
    private int minutes;
    private int hours;

    public Timespan(){
        minutes = 0;
        hours = 0;
    }

    public Timespan(int minutes){
        if(minutes >= 0){
            while(minutes >= 60) {
                minutes -= 60;
                hours++;
            }
            this.minutes = minutes;
        } else{
            System.out.println("Кількість хвилин має бути додатною.");
        }

    }

    public Timespan(int minutes, int hours){
        int i = 0;
        if(minutes >= 0 && hours >= 0){

            while(minutes >= 60) {
                minutes -= 60;
                i++;
            }
            this.minutes = minutes;
            this.hours = hours + i;
        } else {
            System.out.println("Кількість хвилин та годин має бути додатною.");
        }

    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public Timespan(Timespan span) {
        if (span != null) {
            this.hours = span.getHours();
            this.minutes = span.getMinutes();
        } else {
            System.out.println("Переданий об'єкт є null.");
            this.hours = 0;
            this.minutes = 0;
        }
    }

    public void whatTime(){
        System.out.println("Time is: " + hours + " hours " + minutes + " minutes");
    }

    public void add(int hours, int minutes) {
        if (hours >= 0 && minutes >= 0 && minutes <= 59) {
            int totalMinutes = this.hours * 60 + this.minutes + hours * 60 + minutes;
            this.hours = totalMinutes / 60;
            this.minutes = totalMinutes % 60;
        } else {
            System.out.println("Некоректні вхідні дані для додавання.");
        }
    }

    public void add(int minutes) {
        if (minutes >= 0) {
            int addHours = minutes / 60;
            int addMins = minutes % 60;
            add(addHours, addMins);
        } else {
            System.out.println("Кількість хвилин має бути додатною.");
        }
    }

    public void add(Timespan span) {
        if (span != null) {
            add(span.getHours(), span.getMinutes());
        }
    }

    public void subtract(int hours, int minutes) {
        if (hours >= 0 && minutes >= 0 && minutes <= 59) {
            int currentTotalMinutes = this.hours * 60 + this.minutes;
            int subtractTotalMinutes = hours * 60 + minutes;

            if (subtractTotalMinutes <= currentTotalMinutes) {
                int resultMinutes = currentTotalMinutes - subtractTotalMinutes;
                this.hours = resultMinutes / 60;
                this.minutes = resultMinutes % 60;
            } else {
                System.out.println("Неможливо відняти більший інтервал від меншого.");
            }
        } else {
            System.out.println("Некоректні вхідні дані для віднімання.");
        }
    }

    public void subtract(int minutes) {
        if (minutes >= 0) {
            int subHours = minutes / 60;
            int subMins = minutes % 60;
            subtract(subHours, subMins);
        } else {
            System.out.println("Кількість хвилин має бути додатною.");
        }
    }

    public void subtract(Timespan span) {
        if (span != null) {
            subtract(span.getHours(), span.getMinutes());
        }
    }

    public double getTotalHours(){
        return this.hours + (this.minutes / 60.0);
    }

    public int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    public void scale(int factor) {
        if (factor > 0) {
            int totalMins = getTotalMinutes() * factor;
            this.hours = totalMins / 60;
            this.minutes = totalMins % 60;
        } else {
            System.out.println("Множник має бути більшим за 0.");
        }
    }

}
