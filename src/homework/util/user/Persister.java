package homework.util.user;

import homework.util.Saveable;

public class Persister implements Saveable {
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
