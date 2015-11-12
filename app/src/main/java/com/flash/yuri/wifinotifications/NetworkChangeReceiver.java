package com.flash.yuri.wifinotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.widget.Toast;

/**
 * Created by Yuri Rodrigues on 12/11/2015.
 */
public class NetworkChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
try{
        ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifi = connMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        //NetworkInfo mobile = connMgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        /*boolean isConnected = wifi != null && wifi.isConnectedOrConnecting();
        if (isConnected) {
            Log.d("Network Available ", "YES");
            Toast.makeText(context.getApplicationContext(), "Network Available",
                    Toast.LENGTH_SHORT).show();
        } else {
            Log.d("Network Available ", "NO");
            Toast.makeText(context.getApplicationContext(), "Network Unavailable",
                    Toast.LENGTH_SHORT).show();
        }
*/
    WifiManager wifiManager = (WifiManager) context.getSystemService(context.WIFI_SERVICE);
    WifiInfo wifiInfo = wifiManager.getConnectionInfo();
    String ssid = wifiInfo.getSSID();
    Toast.makeText(context.getApplicationContext(), ssid,
            Toast.LENGTH_SHORT).show();

    }catch (Exception e){
            e.toString();
        }
    }}