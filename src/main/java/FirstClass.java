public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,590,2019);
        notebook.checkPrice();
        notebook.checkYear();
        notebook.checkWeight();
        notebook.ourRecomendation();

        Notebook old_notebook = new Notebook(1200,1500,2012);
        old_notebook.checkPrice();
        old_notebook.checkYear();
        old_notebook.checkWeight();
        old_notebook.ourRecomendation();

        Notebook heavy_notebook = new Notebook(2000,2000,2018);
        heavy_notebook.checkPrice();
        heavy_notebook.checkYear();
        heavy_notebook.checkWeight();
        heavy_notebook.ourRecomendation();

        Notebook heavy_old_notebook = new Notebook(2000,350,2011);
        heavy_old_notebook.checkPrice();
        heavy_old_notebook.checkYear();
        heavy_old_notebook.checkWeight();
        heavy_old_notebook.ourRecomendation();

        Notebook and_notebook = new Notebook(800,1099,2020);
        and_notebook.checkPrice();
        and_notebook.checkYear();
        and_notebook.checkWeight();
        and_notebook.ourRecomendation();

        Notebook int_notebook = new Notebook(5400,1999,2007);
        int_notebook.checkPrice();
        int_notebook.checkYear();
        int_notebook.checkWeight();
        int_notebook.ourRecomendation();

    }
}
