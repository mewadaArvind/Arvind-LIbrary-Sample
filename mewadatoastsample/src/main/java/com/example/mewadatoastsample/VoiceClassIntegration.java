package com.example.mewadatoastsample;

import android.content.Context;

public abstract class VoiceClassIntegration extends MasterClass{

    private static int noAccessUserThis(Context context,int calculation){
        calculation  = 12 * 12;
        return calculation;
    }

    public static  int accessUser(Context context, int cal){
        cal =  12 * 10;
        return cal;
    }
}
