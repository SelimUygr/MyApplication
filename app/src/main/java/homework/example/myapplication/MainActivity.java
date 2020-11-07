package homework.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import org.w3c.dom.Text;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText id_editText = findViewById(R.id.id_editText);
        final EditText pw_editText = findViewById(R.id.pw_editText);

        Button entry_button = (Button) findViewById(R.id.enter_button);
        entry_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = id_editText.getText().toString();
                String pw = pw_editText.getText().toString();

                if((id.equals("abc")) & (pw.equals("123"))){
                    openNewActivity();
                }
                else{
                    Toast.makeText(getApplicationContext(),"提供的用户帐户或密码不正确。",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void openNewActivity() {
        Intent intent = new Intent(this,wallPaper.class);
        startActivity(intent);
    }
}