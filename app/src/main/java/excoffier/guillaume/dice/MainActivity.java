package excoffier.guillaume.dice;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.R.attr.button;
import static android.R.attr.numberPickerStyle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;

        rollButton= (Button) findViewById(R.id.rollbutton);

        final ImageView leftDice= (ImageView) findViewById(R.id.imageView_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.imageView_rightDice);

        final int[] diceArray={R.drawable.dice1,
                        R.drawable.dice2,
                        R.drawable.dice3,
                        R.drawable.dice4,
                        R.drawable.dice5,
                        R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator= new Random();
                int number= randomNumberGenerator.nextInt(6);
                leftDice.setImageResource(diceArray[number]);
                number= randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);
            }
        });

    }
}
