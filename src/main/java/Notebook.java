public class Notebook{

    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public String getWeight() {
        return this.weight;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("Price is: " + this.price + "$ - This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1100) {
            System.out.println("Price is: " + this.price + "$ - the price is good.");
        } else {
            System.out.println("Price is: " + this.price + "$ - This notebook is expensive.");
        }
    }



   // public void checkWeight(){
       // if (this.weight <700) {
       //     System.out.println("It waigths: "+this.weight + "gram - this laptop is pretty lightweight");
      //      }
      //  else if (this.weight >=700 && this.weight<=1600){
      //      System.out.println("It waigths: "+this.weight+"gram - this laptop should be considered as midweigth");
      //      }
      //  else {
      //      System.out.println("It waigths: "+this.weight+"gram - this laptop is rather heavyweigth!");
       //     }
      //  }
        public void checkYear() {
            if (this.year >= 2019) {
                System.out.println("YoM is: " + this.year + " - this laptop is pretty new!");
            } else if (this.year <= 2018 && this.year >= 2016) {
                System.out.println("YoM is: " + this.year + " - this laptop is not too old");
            } else {
                System.out.println("YoM is: " + this.year + " - this laptop is pretty old");
            }
        }
        public void ourRecomendation(){
            if (this.year >=2020 && this.price <1000) {
                System.out.println("We recomend this laptop is new, and price is also very good: ");
            }
            else if (this.year >= 2020 && this.price>=1000) {
                System.out.println("This laptop is a very good choice, but on expensive side");
            }
            else if (this.year < 2020 && this.year >2016 && this.price<1000) {
                System.out.println("This laptop is a very good choice, not too old, not too expensive");
            }
            else if (this.year < 2020 && this.year >2016 && this.price>=1000){
                    System.out.println("This laptop is also a good choice, but on expensive side");
           }
            else if (this.year<=2016 && this.price<1000){
                System.out.println("This laptop a bit old, but still reasonably priced");
            }
            else if (this.year<=2016 && this.price>=1000 && this.price <=1500){
                System.out.println("This laptop is old and a bit expensive, we don't recomend it");
            }
            else {
                System.out.println("IMHO this laptop is not worth your money");
            }
    }
}
