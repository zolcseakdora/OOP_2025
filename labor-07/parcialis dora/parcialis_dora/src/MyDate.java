public class MyDate {
    private final int year;
    private final int month;
    private final int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public boolean equals(MyDate other){
        if(other.getYear()==year && other.getMonth()==month && other.getDay()==day){
            return true;
        }
        else return false;
    }
    public boolean isAfter(MyDate other){
        if(this.equals(other)){
            return true;
        }
        else{
            return false;
        }

    }
    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
