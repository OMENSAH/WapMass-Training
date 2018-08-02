package bawo.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //setviews as instance to activity
    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private Button addButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get views from xml and set them to activity instances
        firstNumberEditText = findViewById(R.id.calculator_editText_firstNumber);
        secondNumberEditText = findViewById(R.id.calculator_editText_secondNumber);
        addButton = findViewById(R.id.calculator_button_addNumbers);
        resultTextView = findViewById(R.id.calculator_textView_result);
        // click on button to add the two numbers

        //retrieve the entered number  frm our views
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(firstNumberEditText.getText().toString().equals("")
                        || secondNumberEditText.getText().toString().equals("")
                        ){
                    Toast.makeText(MainActivity.this, "Complete the form to add the numbers", Toast.LENGTH_SHORT).show();

                }else{
                    int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
                    int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());
                    int result = firstNumber + secondNumber;

                    resultTextView.setText(String.valueOf(result));
                }
            }
        });
    }

//    private int addTwoNumbers(int firstNumber, int secondNumber){
//        return firstNumber + secondNumber;
//    }
//
//    private void initiliazeViews(){
//        //get views from xml and set them to activity instances
//        firstNumberEditText = findViewById(R.id.calculator_editText_firstNumber);
//        secondNumberEditText = findViewById(R.id.calculator_editText_secondNumber);
//        addButton = findViewById(R.id.calculator_button_addNumbers);
//        resultTextView = findViewById(R.id.calculator_textView_result);
//    }
//    private int[] getContentViews(){
//        int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
//        int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());
//        int [] values = {firstNumber,secondNumber};
//        return values;
//    }
//
//    private int clickButtonResults(){
//       int[] contents =  getContentViews();
//       return addTwoNumbers(contents[0], contents[1]);
//    }
}
