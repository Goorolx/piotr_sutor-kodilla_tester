public class UserMain {
    public static void main(String[] args) {

        User antek = new User("Antek", 20);
        User beata = new User("Beata", 25);
        User celina = new User("Celina", 30);
        User daniel = new User("Daniel", 35);
        User edward = new User("Edward", 40);

        User[] users = {antek, beata, celina, daniel, edward};

        int result = 0;
        int averageAge;
        int userLength = users.length;

        for (int i = 0; i < userLength; i++) {
            result = result + users[i].userAge;
            System.out.println(users[i].userName + " " + result);
        }
            averageAge = result / userLength;
            System.out.println(averageAge);


        for (int i = 0; i < userLength; i++){
            if (users[i].getUserAge() < averageAge) {

               // String displayUserMoreAverage = User.getUserName();
                System.out.println(users[i].userName);
            }
        }
    }
}
