package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Storing numbers into an array list of Strings
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("lutti", "one", R.drawable.number_one));
        words.add(new Word("otiiko", "two", R.drawable.number_two));
        words.add(new Word("tolookosu", "three", R.drawable.number_three));
        words.add(new Word("oyyisa", "four", R.drawable.number_four));
        words.add(new Word("massokka", "five", R.drawable.number_five));
        words.add(new Word("temmokka", "six", R.drawable.number_six));
        words.add(new Word("kenekaku", "seven", R.drawable.number_seven));
        words.add(new Word("kawinta", "eight", R.drawable.number_eight));
        words.add(new Word("wo’e", "nine", R.drawable.number_nine));
        words.add(new Word("na’aacha", "ten", R.drawable.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.activity_numbers_list);
        listView.setAdapter(itemsAdapter);

    }
}
