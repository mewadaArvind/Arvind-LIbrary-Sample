package com.example.mewadatoastsample;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;

public class MasterClass {
    public static void s(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }

    public static void progresssDialog (Context context,String title, String descriptionMessage){
        ProgressDialog.show(context,title,descriptionMessage);
    }

    private static  int accessUser(Context context, int cal){
        cal =  12 * 10;
        return cal;
    }
}
