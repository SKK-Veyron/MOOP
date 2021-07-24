package binus.app.castlevscastle;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Activity myActivity = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final BattleSystem start = new BattleSystem();
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        final TextView text = findViewById(R.id.announcement);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = start.battle1();
                if (res == 1){
                    text.setText("Your Army Wins Battle 1");
                }
                else if (res == 2){
                    text.setText("The Enemy Wins Battle 1");
                }
                else {
                    text.setText("Draw");
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = start.battle2();
                if (res == 1){
                    text.setText("Your Army Wins Battle 2");
                }
                else if (res == 2){
                    text.setText("The Enemy Wins Battle 2");
                }
                else {
                    text.setText("Draw");
                }
            }
        });
    }

}