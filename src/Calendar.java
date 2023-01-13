public class Calendar {
    private Holidays[] holidays = new Holidays[11];

    void addHolidaysDates(){

        holidays[0] = new Holidays("01/01/2023", "Confraternização mundial");
        holidays[1] = new Holidays("21/02/2023", "Carnaval");
        holidays[2] = new Holidays("17/04/2023", "Páscoa");
        holidays[3] = new Holidays("21/04/2023", "Tiradentes");
        holidays[4] = new Holidays("01/05/2023", "Dia do trabalho");
        holidays[5] = new Holidays("08/06/2023", "Corpus Christi");
        holidays[6] = new Holidays("07/09/2023", "Independência do Brasil");
        holidays[7] = new Holidays("12/10/2023" , "Nossa Senhora Aparecida");
        holidays[8] = new Holidays("02/11/2023", "Finados");
        holidays[9] = new Holidays("15/11/2023", "Proclamação da República");
        holidays[10] = new Holidays("25/12/2023", "Natal");
    }
    
    public void getAllHolidays(){
        for(int i=0; i<holidays.length; i++){
            System.out.println("Data: " + holidays[i].getDate() + " - " + holidays[i].getHoliday());
        }
    }

    public void isHoliday(String date){
        for(int i=0; i<holidays.length; i++){
            if(holidays[i].getDate().equals(date)){
                System.out.println("A data: " + holidays[i].getDate() + " é feriado de " + holidays[i].getHoliday());
                return;
            }
        }
        System.out.println("Não há feriado(s) na data " + date);
    }
    }


