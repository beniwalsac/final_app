package aurora.copregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class open_2 extends AppCompatActivity {

    private Button next_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_2);

        next_2 = (Button) findViewById(R.id.next_button2);
    }

    public void onClick(View view) {
        if(view == next_2) {
            step3();
        }
    }

    private void step3() {
        Intent intent = new Intent(this, open_3.class);
        startActivity(intent);
    }
}
