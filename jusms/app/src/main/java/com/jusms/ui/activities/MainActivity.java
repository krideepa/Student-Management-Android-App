package com.jusms.ui.activities;

import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.jusms.R;
import com.jusms.base.BaseActivity;
import com.jusms.misc.utils.Extras;
import com.jusms.misc.utils.PermissionManagers;
import com.jusms.ui.fragments.LoginProcess;
import com.jusms.ui.fragments.SubjectFragment;

import static com.jusms.misc.utils.Constants.PERMISSIONS_REQ;

/**
 * Created by Ambuja on 20/11/2018.
 */


public class MainActivity extends BaseActivity {

    private Extras prefernces;

    @Override
    protected int layoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void ui() {
    }

    @Override
    protected void function() {
        prefernces = new Extras(this);
        PermissionManagers.checkPermission(this);
        FrgamentLoader();
    }

    @Override
    protected Fragment setfragment() {
        if (!TextUtils.isEmpty(prefernces.getUserName())){
            if (prefernces.isLogged()){
                return SubjectFragment.getInstance();
            }
        }else {
            Log.d("MainActivity", "failed to check login status");
        }
        return LoginProcess.getInstance();
    }

    @Override
    public int setContainerId() {
        return R.id.container;
    }

    @Override
    public void FrgamentLoader() {
        super.FrgamentLoader();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                FragmentManager fm = getSupportFragmentManager();
                if (fm.getBackStackEntryCount() > 0) {
                    fm.popBackStack();
                } else {
                    FrgamentLoader();
                }
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case PERMISSIONS_REQ: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Log.d("Granted", "hurray");
                }else {
                    PermissionManagers.checkPermission(this);
                }
            }
        }
    }

}
