package com.example.testlayot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //--
        final Toast toast = Toast.makeText(getApplicationContext(),
                "Пора покормить кота!", Toast.LENGTH_SHORT);

        toast.show();
        toast.setGravity(Gravity.CENTER, 0, 0);

        final Toast ts= Toast.makeText(getApplicationContext(), "Click Button", Toast.LENGTH_SHORT);
        ts.show();
        //--

        //--TextView для отображения ввода из EditText

        final TextView edText = (TextView) findViewById(R.id.resultEdit);


        //--button
        Button button = (Button) findViewById(R.id.buttonClick);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Click");
                   ts.show();
            }
        });

        //EditText
        final EditText editText = (EditText) findViewById(R.id.edtext);

        final EditText edtName = (EditText) findViewById(R.id.edtName);
        final Button btEdit  =(Button) findViewById(R.id.btEdit);

        Button bt = (Button) findViewById(R.id.buttonToast);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast cl = Toast.makeText(getApplicationContext(), "Нажата кнопка" + " " + editText.getText(), Toast.LENGTH_SHORT);
                cl.show();
            }

        });

        //Обработчик для кнопки связанный с editText
        btEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //edtName.getText();
               // String value=edText.getText().toString();
                Toast c2 = Toast.makeText(getApplicationContext(), "Нажата кнопка" + " " + edtName.getText(), Toast.LENGTH_SHORT);
                c2.show();

                edText.setText("Your text is "+ edtName.getText());

            }
        });


    }

    // Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.new_game:
                Toast toastgame = Toast.makeText(getApplicationContext(), "Выбран пункт игра", Toast.LENGTH_SHORT);
                toastgame.show();
                return true;
            case R.id.help:
                Toast toasthelp =Toast.makeText(getApplicationContext(), "Выбран пункт help", Toast.LENGTH_SHORT);
                toasthelp.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
