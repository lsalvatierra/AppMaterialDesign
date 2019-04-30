package pe.edu.idat.appmaterialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Intent x = new Intent(this, LoginActivity.class);

        Thread timer = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(4000);
                }catch (InterruptedException ex){

                    ex.printStackTrace();
                }finally {
                    startActivity(x);
                    finish();
                }
            }
        };

        timer.start();
    }
}
