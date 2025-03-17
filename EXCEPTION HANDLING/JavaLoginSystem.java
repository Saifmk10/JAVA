// requirements  :  login , sign in , reset
// class requirements : abstract userDetails 

import java.util.*;
import java.io.BufferedReader;
import java.lang.reflect.Array;

class UserDetails{
    private ArrayList<String> NAME = new ArrayList<>();
    private ArrayList<String> USERNAME = new ArrayList<>();
    private ArrayList<String> PASSWORD = new ArrayList<>();

    public void UserDatabase(String USERINPUTNAME , String USERINPUTUSERNAME  , String USERINPUTPASSWORD){
        // pre entred user name into the list
        USERNAME.add("saifmk10");
        USERNAME.add("newUser");
        USERNAME.add(USERINPUTNAME);

        // pre entred password for the user names
        PASSWORD.add("newpass123");
        PASSWORD.add("newpass456");
        PASSWORD.add(USERINPUTPASSWORD);
    }
}

class NewUserSignin extends UserDetails{

    public void addingNewUsers(){
        // UserDatabase()
    }
}