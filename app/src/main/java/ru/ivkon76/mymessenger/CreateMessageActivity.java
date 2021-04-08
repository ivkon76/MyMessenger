package ru.ivkon76.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view){
        EditText edit = (EditText) findViewById(R.id.message);
        String messageString = edit.getText().toString();
        //Intent intent = new Intent(this , ReceiveMessageActivity.class);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageString);
        //intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageString);
        startActivity(intent);
    };
}