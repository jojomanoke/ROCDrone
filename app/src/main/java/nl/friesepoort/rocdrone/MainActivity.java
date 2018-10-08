package nl.friesepoort.rocdrone;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 3;

    //Info.setText("Number of attempts remaining: 3");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button yourButton = (Button)findViewById(R.id.buttonlogin);

        yourButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){



        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

            }
        });

        Name = (EditText)findViewById(R.id.email);
        Password = (EditText)findViewById(R.id.password);
        Info = (TextView)findViewById(R.id.lainfo);
        Login = (Button)findViewById(R.id.buttonlogin);


    }


// login function
    private void validate(String userName, String userPassword){
        if((userName.equals("Admin")) && (userPassword.equals("1234"))){
            Intent intent = new Intent(MainActivity.this , home.class);
            startActivity(intent);
        }else{
            alert();
            counter--;
                Info.setText("Number of attempts remaining: " + String.valueOf(counter));
            if(counter == 0){
                Login.setEnabled(false);
            }
        }

    }
    public void alert(){
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("Wrong username or password")
            .setPositiveButton("ok", new DialogInterface.OnClickListener(){
                @Override
            public void onClick(DialogInterface dialog, int which){
                    dialog.dismiss();
                }
        } )
                .create();
            myAlert.show();

    }



}


