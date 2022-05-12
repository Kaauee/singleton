package main;


public class Main {

    public static void main(String[] args) {
            
        // Can't
        //DBAccess db = new DBAccess();
        
        DBAccess obj1 = DBAccess.getInstance();
        obj1.ShowMessage();
        
        DBAccess obj2 = DBAccess.getInstance();
        obj2.ShowMessage();
        
    }

}
