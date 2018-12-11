package com.example.administrator.exp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CommentActivity extends AppCompatActivity {

    public static String EXTRA_COMMENT = "com.example.administrator.exp3.COMMENT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
    }

    public void submitComment(View view) {
        Intent intent = new Intent(this, SubmitSucActivity.class);
        EditText editText = (EditText) findViewById(R.id.comment_edit_text);
        String comment = editText.getText().toString();
        intent.putExtra(EXTRA_COMMENT, comment);

        TextView comment2Text = (TextView) findViewById(R.id.comment2_text_view);
        comment2Text.setText(comment);

        editText.setText(null);
        startActivity(intent);
    }

    public void cancelComment(View view) {
        EditText editText = (EditText) findViewById(R.id.comment_edit_text);
        editText.setText(null);
    }

    public void addGoodNum(View view) {
        TextView goodText = (TextView) findViewById(R.id.good_num_text_view);
        String nowGoodString = goodText.getText().toString();
        int nowGoodInt = Integer.parseInt(nowGoodString);
        nowGoodInt++;
        nowGoodString = nowGoodInt + "";
        goodText.setText(nowGoodString);
    }
    public void addBadNum(View view) {
        TextView badText = (TextView) findViewById(R.id.bad_num_text_view);
        String nowBadString = badText.getText().toString();
        int nowBadInt = Integer.parseInt(nowBadString);
        nowBadInt++;
        nowBadString = nowBadInt + "";
        badText.setText(nowBadString);
    }

    public void addLike1Num(View view) {
        TextView like1Text = (TextView) findViewById(R.id.like1_num_text_view);
        String nowLike1String = like1Text.getText().toString();
        int nowLike1Int = Integer.parseInt(nowLike1String);
        nowLike1Int++;
        nowLike1String = nowLike1Int + "";
        like1Text.setText(nowLike1String);
    }
}
