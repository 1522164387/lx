package com.example.lx;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InputShopItemActivity extends AppCompatActivity {

    public static final int RESULT_CODE_SUCCESS = 666;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_shop_item);

        position= this.getIntent().getIntExtra("position",0);
        String title=this.getIntent().getStringExtra("title");
        String author=this.getIntent().getStringExtra("author");

        EditText editTextTitle=findViewById(R.id.edittext_shop_item_title);
        EditText editTextAuthor=findViewById(R.id.edittext_shop_item_author);
        TextView book_old_title=findViewById(R.id.book_old_name);
        if(null!=title)
        {
            book_old_title.setText("change: "+title);
            editTextTitle.setText(title);
            editTextAuthor.setText(author.toString());
        }


        Button buttonOk=findViewById(R.id.button_ok);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                Bundle bundle=new Bundle();
                bundle.putString("title",editTextTitle.getText().toString());
                bundle.putString("author",editTextAuthor.getText().toString());
                bundle.putInt("position",position);

                intent.putExtras(bundle);
                setResult(RESULT_CODE_SUCCESS,intent);
                InputShopItemActivity.this.finish();
            }
        });

        Button buttoncancel=findViewById(R.id.button_cancel);
        buttoncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputShopItemActivity.this.finish();
            }
        });
    }
}