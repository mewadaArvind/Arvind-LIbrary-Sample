package com.example.mewadatoastsample;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Toast;
import com.airbnb.lottie.LottieAnimationView;


public class MasterClassLottieAnimation extends LottieAnimationView {

    public MasterClassLottieAnimation(Context context) {
        super(context);
    }

    public MasterClassLottieAnimation(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MasterClassLottieAnimation(Context context, AttributeSet attrs, int defStyleAttr) {
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

}
