public class SimpleArray {
    public static void main (String[] args) {

    String[] shoes = new String[5];
          shoes[0] = "Adidas";
          shoes[1] = "Nike";
          shoes[2] = "Brooks";
          shoes[3] = "Salomon";
          shoes[4] = "New Balance";

        String shoe = shoes[3];
        System.out.println(shoe);

        int numOfShoes = shoes.length;
        System.out.println("mam tyle par butów: "+ numOfShoes);
    }
}
