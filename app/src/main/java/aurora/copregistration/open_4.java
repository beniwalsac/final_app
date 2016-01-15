package aurora.copregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class open_4 extends AppCompatActivity {

    private Button next_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_4);

        next_4 = (Button) findViewById(R.id.next_button4);
    }

    public void onClick(View view) {
        if(view == next_4) {
            step5();
        }
    }

    private void step5() {

    }
}
