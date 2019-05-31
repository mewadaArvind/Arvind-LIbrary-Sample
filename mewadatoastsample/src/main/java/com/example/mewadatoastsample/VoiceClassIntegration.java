package com.example.mewadatoastsample;

import android.content.Context;
import android.util.AttributeSet;

import com.airbnb.lottie.LottieAnimationView;

public abstract class VoiceClassIntegration extends LottieAnimationView {


    public VoiceClassIntegration(Context context) {
        super(context);
    }

    public VoiceClassIntegration(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VoiceClassIntegration(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private static int noAccessUserThis(Context context, int calculation){
        calculation  = 12 * 12;
        return calculation;
    }

    public static  int accessUser(Context context, int cal){
        cal =  12 * 10;
        return cal;
    }
}
