package adhanjas.com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    Button calc;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.editTextNumber);
        num2=findViewById(R.id.editTextNum2);
        calc=findViewById(R.id.calc2);
        ans=findViewById(R.id.value);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "button click", Toast.LENGTH_SHORT).show();
                String number1=num1.getText().toString();
                String number2=num2.getText().toString();
                if(number1.isEmpty()){
                    num1.setError("insert value");
                }
                else if(number2.isEmpty()){
                    num2.setError("insert value");
                }
                else if(number1.isEmpty() && number2.isEmpty()){
                    Toast.makeText(MainActivity.this, "insert values", Toast.LENGTH_SHORT).show();
                }
                else{
                    int a=Integer.parseInt(number1);
                    int b=Integer.parseInt(number2);
                    int answe=a+b;
                    ans.setText(Integer.toString(answe));
                }

            }
        });
    }
}