package com.example.administrator.exp3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubmitSucActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_suc);

        Intent intent = getIntent();
        String comment = intent.getStringExtra(CommentActivity.EXTRA_COMMENT);

        TextView textView = findViewById(R.id.comment_text_view);
        textView.setText(comment);
    }

    public void back2Comment(View view) {
        SubmitSucActivity.this.finish();
    }

}
