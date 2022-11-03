package com.example.rvj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class NewsDeatilActivity extends AppCompatActivity {
    String title,desc,content,imageURL,url;

    private TextView titleTV,subTitleTV,contentTV;
    private ImageView newsImg;
    private AppCompatButton readBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_deatil);

        title= getIntent().getStringExtra("title");
        desc =getIntent().getStringExtra("desc");
        content =getIntent().getStringExtra("content");
        imageURL =getIntent().getStringExtra("image");
        url =getIntent().getStringExtra("url");


        titleTV =findViewById(R.id.detailTitle);
        subTitleTV =findViewById(R.id.detailSub);
        contentTV =findViewById(R.id.detailContent);
        newsImg =findViewById(R.id.ImageviewNews);
        readBtn =findViewById(R.id.idBtnRead);

        titleTV.setText(title);
        subTitleTV.setText(desc);
        contentTV.setText(content);
        Picasso.get().load(imageURL).into(newsImg);

        readBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}