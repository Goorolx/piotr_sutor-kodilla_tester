public class User {
    String userName;
    int userAge;
    int averageAge;


    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public String getUserName() {
        return this.userName;
    }

    public int getUserAge() {
        return userAge;
    }
    public int getAvgAge() {
        return averageAge;
    }
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

        }
        averageAge = result / userLength;
        System.out.println("Average Age = "+ averageAge + " - This are Users with age below average: ");


        for (int i = 0; i < userLength; i++){
            if (users[i].getUserAge() < averageAge) {

                System.out.println( users[i].userName);
            }
        }
    }



}
