package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> getUserList(){
    List<User> users = new ArrayList<>();
    users.add(new User("Walter White",50,7,"Chemists"));
    users.add(new User("Jessie Pinkman",25,4648,"Sales"));
    users.add(new User("Taco Salamanca",34,45,"Manager"));
    users.add(new User("Gus Fring", 49,0,"Board"));
    users.add(new User("Gale Boaticher", 44, 2,"Chemists"));
    users.add(new User("Mike Ehrmantraut",57,0,"Security"));
        return users;
}

}
