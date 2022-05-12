package main;

public class DBAccess {

    private static DBAccess instance;

    private DBAccess() {
    }

    public static DBAccess getInstance(){
    if (instance == null){
    instance = new DBAccess();
    }
    return instance;
    }
    
    
    public void ShowMessage(){
        System.out.println("Single Object : " + this);
    }
    
}
