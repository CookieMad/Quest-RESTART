package ru.example.questrestart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Person player = new Person();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void nexter(View view) {
        TextView textView = findViewById(R.id.storyWindow);
        textView.setTextSize(34);

        Button kitchener = findViewById(R.id.kitchener);
        kitchener.setVisibility(View.GONE);

        Button roofer = findViewById(R.id.roofer);
        roofer.setVisibility(View.GONE);

        Bedroom bedroom = new Bedroom();
        textView.setText(bedroom.text);
        Button bedrooomer = findViewById(R.id.bedroomer);
        bedrooomer.setVisibility(View.GONE);

        Button nothin = findViewById(R.id.nothinger);
        nothin.setVisibility(View.GONE);

        Button chester = findViewById(R.id.chester);
        chester.setVisibility(View.VISIBLE);

        Button haller = findViewById(R.id.haller);
        haller.setVisibility(View.VISIBLE);
    }
    public void nothinger(View view) {
        TextView textView = findViewById(R.id.storyWindow);
        textView.setTextSize(34);

        Nothing nothing = new Nothing();
        textView.setText(nothing.text);
    }

    public void haller(View view) {
        Hall hall = new Hall();

        TextView textView = findViewById(R.id.storyWindow);
        textView.setTextSize(34);

        Button chester = findViewById(R.id.chester);
        chester.setVisibility(View.GONE);

        Button streeter = findViewById(R.id.streeter);
        streeter.setVisibility(View.VISIBLE);

        if(player.gotKey){

            Button roomer = findViewById(R.id.roomer);
            Button kitchener = findViewById(R.id.kitchener);
            Button roofer = findViewById(R.id.roofer);
            Button bedroom = findViewById(R.id.bedroomer);

            roomer.setVisibility(View.VISIBLE);
            kitchener.setVisibility(View.VISIBLE);
            roofer.setVisibility(View.VISIBLE);
            bedroom.setVisibility(View.VISIBLE);
        } else {
            textView.setTextSize(24);
            textView.setText(hall.text1);
        }

        Button haller = findViewById(R.id.haller);
        haller.setVisibility(View.GONE);

        Button bedroomer = findViewById(R.id.bedroomer);
        bedroomer.setText("Обратно в спальню");

    }

    public void chester(View view) {
        Chest chest = new Chest();

        TextView textView = findViewById(R.id.storyWindow);
        textView.setTextSize(34);

        Button chester = findViewById(R.id.chester);
        chester.setVisibility(View.GONE);

        Button haller = findViewById(R.id.haller);
        haller.setVisibility(View.GONE);

        Button bedroomer = findViewById(R.id.bedroomer);
        bedroomer.setText("Назад");
        bedroomer.setVisibility(View.VISIBLE);

        if(player.gotKey){
            textView.setText(chest.textOpened);
        } else {
            textView.setText(chest.textClosed);
        }
    }

    public void streeter(View view) {
        Street street = new Street();

        TextView textView = findViewById(R.id.storyWindow);
        textView.setTextSize(34);

        if(!player.gotKey) {
            textView.setText(street.text);

            player.gotKey = true;
        } else {
            textView.setText(street.closed);

            Button bedroomer = findViewById(R.id.bedroomer);
            bedroomer.setVisibility(View.GONE);

            Button haller = findViewById(R.id.haller);
            haller.setVisibility(View.GONE);

            Button kitchener = findViewById(R.id.kitchener);
            kitchener.setVisibility(View.GONE);

            Button roofer = findViewById(R.id.roofer);
            roofer.setVisibility(View.GONE);

            Button roomer = findViewById(R.id.roomer);
            roomer.setVisibility(View.GONE);
        }

        Button haller = findViewById(R.id.haller);

        haller.setText("В коридор");
        haller.setVisibility(View.VISIBLE);

        Button streeter = findViewById(R.id.streeter);
        streeter.setVisibility(View.GONE);

    }

    public void kitchener(View view) {

    }

    public void roofer(View view) {

    }

    public void roomer(View view) {

    }
}