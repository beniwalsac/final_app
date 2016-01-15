package aurora.copregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class open_3 extends AppCompatActivity {

    private Button next_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_3);

        next_3 = (Button) findViewById(R.id.next_button3);
    }

    public void onClick(View view) {
        if(view == next_3) {
            step4();
        }
    }

    private void step4() {
        Intent intent = new Intent(this, open_4.class);
        startActivity(intent);
    }
}
