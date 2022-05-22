package sg.edu.np.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.app.AlertDialog;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        AlertDialog.Builder builder;
        ImageView image = findViewById(R.id.ListImage);
        builder = new AlertDialog.Builder(this);
        TextView name = findViewById(R.id.textView2);
        name.setText(user1.name);
        ArrayList<user> userlist = new ArrayList<>();
        userlist.add(user1);

//        image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                builder.setTitle("Profile");
//                builder.setMessage("MADness");
//                builder.setPositiveButton(
//                    "VIEW",
//                    new DialogInterface.OnClickListener() {
//                        public void onClick(DialogInterface dialog, int id) {
//                            Intent myIntent = new Intent(ListActivity.this, MainActivity.class);
//                            startActivity(myIntent);
//                        }
//                    });
//                builder.setNegativeButton(
//                        "Close",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//                                dialog.cancel();
//                            }
//                        });
//                builder.show();
//            }
//        });
    }
    private int randomOTP(){
        Random ran = new Random();
        int value = ran.nextInt(999999999);
        return value;
    }
    private user createUser(){
        user user1 = new user();
        int ran = randomOTP();
        user1.name = "MAD" + " " + ran;
        user1.followed = false;
        return user1;
    }
}