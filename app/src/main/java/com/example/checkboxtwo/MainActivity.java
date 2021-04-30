package com.example.checkboxtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        // Получаем флажок
        CheckBox checkBox = (CheckBox) view;
        // Получаем, отмечен ли данный флажок
        boolean checked = checkBox.isChecked();

        TextView selection = (TextView) findViewById(R.id.selection);

        // Смотрим, какой именно из флажков отмечен
        switch(view.getId()) {
            case R.id.java:
                if (checked)
                    Toast.makeText(this, "Вы выбрали Java ",Toast.LENGTH_LONG).show();
                break;
            case R.id.kotlin:
                if (checked)
                    Toast.makeText(this, "Вы выбрали Kotlin",Toast.LENGTH_LONG).show();
                break;
            default:
                selection.setText("");
        }
    }
}