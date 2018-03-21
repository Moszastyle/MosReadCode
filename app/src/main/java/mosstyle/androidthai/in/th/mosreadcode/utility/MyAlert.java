package mosstyle.androidthai.in.th.mosreadcode.utility;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import mosstyle.androidthai.in.th.mosreadcode.R;

/**
 * Created by User on 21/3/2561.
 */

public class MyAlert {

    private Context context;

    public MyAlert(Context context) {
        this.context = context;

    }

    public void myDialog(String titleSting, String messageString) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.ic_action_name);
        builder.setTitle(titleSting);
        builder.setMessage(messageString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();

    }


}   //Main Class
