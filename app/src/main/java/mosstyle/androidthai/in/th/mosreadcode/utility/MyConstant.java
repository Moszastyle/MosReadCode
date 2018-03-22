package mosstyle.androidthai.in.th.mosreadcode.utility;

/**
 * Created by User on 22/3/2561.
 */

public class MyConstant {

    //    About URL
    private String urlPostUserString = "http://androidthai.in.th/mar/postUser.php";
    private String urlGetAllUserString = "http://androidthai.in.th/mar/getAllUser.php";

    // About Array
    private String[] loginStrings = new String[]{"id","Name","User","Password"};

    public String[] getLoginStrings() {
        return loginStrings;
    }

    public String getUrlGetAllUserString() {
        return urlGetAllUserString;
    }

    public String getUrlPostUserString() {
        return urlPostUserString;


    }
} //main class
