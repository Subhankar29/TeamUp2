package app.first.in.collegeprofiles;

/**
 * Created by venkateshtata on 01/11/16.
 */

public class UserData {

    private String username;
    private String discription;


    public UserData(){

    }

    public String getName(){
        return username;
    }

    public void setName(String username){
        this.username = username;
    }

    public String getDiscription(){
        return discription;
    }

    public void setDiscription(String discription){
        this.discription = discription;
    }

}
