package bawo.firebaseauth;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    private Button register, login;
    private EditText editTextEmail;
    private EditText editTextPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();

        register = findViewById(R.id.main_button_register);
        login = findViewById(R.id.main_button_login);

        editTextEmail = findViewById(R.id.main_editText_email);
        editTextPass = findViewById(R.id.main_editText_password);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextEmail.getText().toString().equals("") || editTextPass.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Complete the form", Toast.LENGTH_SHORT).show();
                } else {
                    registerNewUser(editTextEmail.getText().toString(), editTextPass.getText().toString());
                }
            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            Toast.makeText(this, "Hey You are logged in", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You are not logged in", Toast.LENGTH_SHORT).show();
        }
    }


    private void registerNewUser(String email, String password) {

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = mAuth.getCurrentUser();
                            Toast.makeText(MainActivity.this, "Authentication Successful.",
                                    Toast.LENGTH_SHORT).show();
                            //sign out user out from automatic login by firebase
                            mAuth.signOut();
                            //sending the user to login page
                            Intent login = new Intent(MainActivity.this, LoginActivity.class);
                            startActivity(login);

                        } else {
                            Toast.makeText(MainActivity.this, task.getException().toString(),
                                    Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });
    }


}

