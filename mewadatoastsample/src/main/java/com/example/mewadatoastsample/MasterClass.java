package com.example.mewadatoastsample;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import android.widget.Toast;

public class MasterClass extends android.support.v7.widget.AppCompatButton implements View.OnClickListener {

    public MasterClass(Context context) {
        super(context);
    }

    public MasterClass(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MasterClass(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

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

    @Override
    public void onClick(View v) {
      progresssDialog(getContext(),"Title","Description");
    }
}
