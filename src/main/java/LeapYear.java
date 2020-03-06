public class LeapYear {

    int year;               //deklarujemy zmienną year
    boolean leapYr;         //deklarujemy boolean leap year

    public LeapYear(int year){
    this.year =year;
    }

       public static void main(String[] args) {

           LeapYear leapYear = new LeapYear(2019);
           leapYear.checkLeapYear();
           leapYear.show();

       }
        public boolean checkLeapYear() {
            if (year % 4 != 0) {                //jesli modulo z dzielenia roku przez 4 różne jak 0, leapYr = false
                leapYr = false;
            } else {                              //modulo wynosi 0, zatem rok podzielny przez 4, sprawdzamy następne warunki
                if (year < 400) {               //lata mniejsze jak 400, podzielne przez 100
                    if (year % 100 == 0) {
                        leapYr = false;
                    } else {                     // lata wieksze lub równe 400, podzielne przez 100 i podzielne przez 400 są przestępne
                        leapYr = true;
                    }
                } else {                           // lata wieksze lub równe 400
                    if (year % 100 == 0 && year % 400 != 0) {        //podzielne przez 100 i NIE podzielne przez 400 są nieprzestępne
                        leapYr = false;
                    } else if (year % 100 == 0 && year % 400 == 0) {   //pozostają tylko lata podzielne przez 4, niepodzielne przez 100
                        leapYr = true;
                    } else {
                        leapYr = true;                              //pozostaja tylko wartości podzielne przez 4, niepodzielne przez 100
                    }
                }
            }
            return leapYr;
        }
        public void show(){
        if (leapYr) {
            System.out.println("Rok " + year + " jest przestępny");
        }
        else {
            System.out.println("Rok " + year + " nie jest rokiem przestępnym");
        }

        System.out.println(leapYr);
    }




    }







