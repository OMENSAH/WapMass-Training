package bawo.recyclerview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import bawo.recyclerview.data.Data;
import bawo.recyclerview.model.InstagramPost;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Getting sent intent data
        Bundle bundle = getIntent().getExtras();
        if(bundle.get("index") != null){
//            Toast.makeText(this, bundle.get("index").toString(), Toast.LENGTH_SHORT).show();
            int position = bundle.getInt("index");
            InstagramPost instagramPost = Data.getData().get(position);
            ImageView imageView = findViewById(R.id.detail_imageView_image);
            imageView.setImageResource(instagramPost.getImageId());

            TextView title = findViewById(R.id.detail_textView_title);
            title.setText(instagramPost.getTitle());
            title.setTextColor(Color.BLACK);

        }
    }
}
