package homework;

import homework.util.user.Persister;
import homework.util.user.User;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persister pers = new Persister(user);
        user.report();
        pers.save();
    }
}