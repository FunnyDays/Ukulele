package com.dd.weiwei.ukulele.Utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.dd.weiwei.ukulele.MainActivity;

/**
 * Created by Administrator on 2017/1/23.
 */

public class AppUtils {
    public static void launchApp(Activity context) {
        Intent intent = new Intent();
        ComponentName cn = new ComponentName("com.bork.dsp.datunerbeta","com.bork.dsp.datunerbeta.DaTunaTuner");
        intent.setComponent(cn);
        intent.setAction("android.intent.action.MAIN");
        try {
            context.startActivityForResult(intent, 1);
        } catch (Exception e) {
            Toast.makeText(context, "没有安装调音器",Toast.LENGTH_SHORT).show();
        }
    }

    public static Intent getLaunchAppIntent(Context context, String packageName) {
        return context.getPackageManager().getLaunchIntentForPackage(packageName);
    }
}
