package com.android.serviceapplication2;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MinusService extends IntentService {

    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    public static final String ACTION_FOO = "com.android.serviceapplication2.action.FOO";
    public static final String ACTION_BAZ = "com.android.serviceapplication2.action.BAZ";

    // TODO: Rename parameters
    private static final String EXTRA_PARAM1 = "com.android.serviceapplication2.extra.PARAM1";
    private static final String EXTRA_PARAM2 = "com.android.serviceapplication2.extra.PARAM2";

    public static final int ACTION_01 = 1;
    public static final int ACTION_02 = 2;

    public MinusService() {
        super("MinusService");
    }

    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionFoo(Context context, String param1, String param2) {
        Intent intent = new Intent(context, MinusService.class);
        intent.setAction(ACTION_FOO);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    /**
     * Starts this service to perform action Baz with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionBaz(Context context, Messenger param1, Bundle param2) {
        Intent intent = new Intent(context, MinusService.class);
        intent.setAction(ACTION_BAZ);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_FOO.equals(action)) {
                Bundle extras = intent.getExtras();
                if(extras != null){
                    CalcNum calcNum = (CalcNum) extras.get("data");
                    calcNum.setResult(calcNum.getNum1() - calcNum.getNum2());
                    Messenger messenger = (Messenger) extras.get("messenger");
                    Message msg = Message.obtain();
                    msg.arg1 = Activity.RESULT_OK;
                    msg.what = ACTION_01;
                    msg.obj = calcNum;
                    try {
                        messenger.send(msg);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            } else if (ACTION_BAZ.equals(action)) {
                Bundle extras = intent.getExtras();
                if(extras != null){
                    Messenger messenger = (Messenger) extras.get(EXTRA_PARAM1);
                    Bundle bundle = (Bundle) extras.get(EXTRA_PARAM2);
                    Message msg = Message.obtain();
                    msg.arg1 = Activity.RESULT_OK;
                    msg.what = ACTION_02;
                    msg.obj = (double)bundle.get("num1") - (double)bundle.get("num2");
                    handleActionBaz("뺄셈 결과 : "+msg.obj);
                    try {
                        messenger.send(msg);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private void handleActionFoo(String param1, String param2) {
        // TODO: Handle action Foo
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private void handleActionBaz(String param1) {
        Log.i("minus",param1);
    }
}