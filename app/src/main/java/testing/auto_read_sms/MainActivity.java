package testing.auto_read_sms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import swarajsaaj.smscodereader.interfaces.OTPListener;
import swarajsaaj.smscodereader.receivers.OtpReader;

public class MainActivity extends AppCompatActivity implements OTPListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OtpReader.bind(MainActivity.this,"VM-TRUCKG");
    }

    @Override
    public void otpReceived(String messageText) {
        Log.d("Otp",messageText);
        TextView txt = (TextView) findViewById(R.id.txt);
        txt.setText(messageText);
    }
}
