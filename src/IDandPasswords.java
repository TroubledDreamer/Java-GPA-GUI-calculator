import java.util.HashMap;
public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("carl long","12345678");
        logininfo.put("pell ming","23456789");
        logininfo.put("cell phone","34565789");
        logininfo.put("Red brown","45678901");
        logininfo.put("Ice lian","54323235");
        logininfo.put("Polo cream","66563222");
        logininfo.put("Cake lake","76453222");
        logininfo.put("Rock lee","86452332");
        logininfo.put("Naruto paul","75544323");
        logininfo.put("Blake tom","10245673");


    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}