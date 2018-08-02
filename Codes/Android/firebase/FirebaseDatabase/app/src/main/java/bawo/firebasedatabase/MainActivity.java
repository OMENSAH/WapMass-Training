package bawo.firebasedatabase;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

import bawo.firebasedatabase.model.User;

public class MainActivity extends AppCompatActivity {
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private EditText editTextName, editTextAge;
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAge = findViewById(R.id.age);
        editTextName = findViewById(R.id.name);
        loginButton = findViewById(R.id.save);


        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("users");

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                int age  = Integer.parseInt(editTextAge.getText().toString());
                User user = new User();
                user.setAge(age);
                user.setName(name);
                createUser(user);
            }
        });
        read();
    }


    public void createUser(User user){
        // Write a message to the database
        databaseReference.push().setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){

                }else{
                    Toast.makeText(MainActivity.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void read(){
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
               for(DataSnapshot singleSnapshot: dataSnapshot.getChildren()){
                   User value = singleSnapshot.getValue(User.class);
                   Toast.makeText(MainActivity.this, value.getName(), Toast.LENGTH_SHORT).show();
               }
            }

            @Override
            public void onCancelled(DatabaseError error) {
            }
        });
    }
}
