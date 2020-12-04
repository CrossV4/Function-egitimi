package com.stibircan.youtubefunctionogrenimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.am_TextView);

        tek();
    }

    String text()
    {
        return "text Function Yazısıdır bu";
    }

    int sayi()
    {
        Random random = new Random();
        return random.nextInt(60);
    }

    void tek()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text());
        stringBuilder.append("\n \n");
        stringBuilder.append(sayi());
        stringBuilder.append("\n \n");
        stringBuilder.append(bool());
        stringBuilder.append("\n \n");
        ArrayList<String> stringArrayList = strArray();
        for (int b = 0; b < stringArrayList.size(); b++)
        {
            stringBuilder.append(stringArrayList.get(b));
            stringBuilder.append("\n");
        }

        textView.setText(stringBuilder);
    }

    ArrayList<String> strArray()
    {
        ArrayList<String> str = new ArrayList<>();
        for (int c = 0; c < 50; c++)
        {
            str.add("MERHABA " + c);
        }
        return str;
    }

    boolean bool()
    {
        return new Random().nextBoolean();
    }
}