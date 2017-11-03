package ispector.edu.apc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.zxing.Result;
import ispector.edu.apc.global.HousekeepingApp;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

/**
 * Created by ispector on 10/17/2017.
 */

    public class ActivityQRCodeScanner extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    private ZXingScannerView mScannerView;

    private String TAG = ActivityQRCodeScanner.class.getSimpleName();
    @Override
    public void onCreate(Bundle state) {
            super.onCreate(state);
            mScannerView = new ZXingScannerView(this);   // Programmatically initialize the scanner view
            setContentView(mScannerView);                // Set the scanner view as the content view
            }

  