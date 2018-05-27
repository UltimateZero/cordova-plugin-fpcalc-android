package com.uz.plugin.fpcalc;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import com.geecko.fpcalc.Fpcalc;
public class Fingerprint extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("fingerprint")) {
            String pathToFile = data.getString(0);
            String[] args = {"-length", "16", pathToFile}
            ?String result = Fpcalc.fpCalc(args);
            callbackContext.success(result);

            return true;

        } else {
            
            return false;

        }
    }
}
