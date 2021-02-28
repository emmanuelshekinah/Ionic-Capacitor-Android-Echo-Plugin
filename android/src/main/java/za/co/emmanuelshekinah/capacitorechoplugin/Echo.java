package za.co.emmanuelshekinah.capacitorechoplugin;

import android.content.SharedPreferences;
import android.app.Activity;
import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;



import static android.content.Context.MODE_PRIVATE;

@NativePlugin
public class Echo extends Plugin {


    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();


        SharedPreferences pref = getContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        String url=pref.getString("url", null);


        ret.put("value", url);
        call.success(ret);
    }
}

