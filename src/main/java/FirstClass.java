public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600gram",590,2019);
        notebook.checkPrice();
        notebook.checkYear();
        //notebook.checkWeight();    //wyłączyłem gdyż szuka zmiennej w formacie int
        notebook.ourRecomendation();

        Notebook oldNotebook = new Notebook("1200",1500,2012);
        oldNotebook.checkPrice();
        oldNotebook.checkYear();
       // oldNotebook.checkWeight();
        oldNotebook.ourRecomendation();

        Notebook heavyNotebook = new Notebook("2000",2000,2018);
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();
        //heavyNotebook.checkWeight();
        heavyNotebook.ourRecomendation();

        Notebook heavyOldNotebook = new Notebook("2000",350,2011);
        heavyOldNotebook.checkPrice();
        heavyOldNotebook.checkYear();
       // heavyOldNotebook.checkWeight();
        heavyOldNotebook.ourRecomendation();

        Notebook andNotebook = new Notebook("800",1099,2020);
        andNotebook.checkPrice();
        andNotebook.checkYear();
        //andNotebook.checkWeight();
        andNotebook.ourRecomendation();

        Notebook intNotebook = new Notebook("5400",1999,2007);
        intNotebook.checkPrice();
        intNotebook.checkYear();
        //intNotebook.checkWeight();
        intNotebook.ourRecomendation();


        String notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight);

    }
}

