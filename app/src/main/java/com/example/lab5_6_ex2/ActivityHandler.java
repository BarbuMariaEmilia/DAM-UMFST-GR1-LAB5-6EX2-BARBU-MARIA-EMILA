package com.example.lab5_6_ex2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;

public class ActivityHandler {
    protected static Class[] ids = {MainActivity.class, Activity2.class, Activity3.class};
    protected static int currentId=0;
    protected static int nrActivities=3;
}