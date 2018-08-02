package bawo.firebaseauth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Getting intent content
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String name = bundle.getString("name");
            String email = bundle.getString("email");

            TextView textViewName = findViewById(R.id.name);
            TextView textViewEmail = findViewById(R.id.email);

            textViewName.setText(name);
            textViewEmail.setText(email);
        }
    }
}
