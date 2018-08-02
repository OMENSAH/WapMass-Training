package bawo.recyclerview.data;

import java.util.ArrayList;

import bawo.recyclerview.R;
import bawo.recyclerview.model.InstagramPost;

public class Data {

    public static ArrayList<InstagramPost> getData(){
        ArrayList<InstagramPost> dataSets = new ArrayList<>();

        int[] imageIds = {
                R.drawable.post1, R.drawable.post2, R.drawable.post3,
                R.drawable.post4, R.drawable.post5, R.drawable.post6
        };

        String[] titles = {
                "Post 1", "Post 2", "Post 3",
                "Post 4", "Post 5", "Post 6"
        };

        for(int i = 0; i < imageIds.length;  i += 1){
            InstagramPost instagramPost = new InstagramPost();
            instagramPost.setImageId(imageIds[i]);
            instagramPost.setTitle(titles[i]);
            dataSets.add(instagramPost);
        }
        return dataSets;
    }
}
