public class Holidays {
    private String date;
    private String holiday;

    public Holidays(String date, String holiday) {
        this.date = date;
        this.holiday = holiday;
    }

    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return this.date;
    }
    public void setHoliday(String holiday){
        this.holiday = holiday;
    }
    public String getHoliday(){
        return this.holiday;
    }
}
