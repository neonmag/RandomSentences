package com.example.somesentences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView sentenceTextView;

    private String[] whoList = {"Кот", "Пес", "Человек", "Робот", "Дракон"};
    private String[] whereList = {"на крыше", "в лесу", "на пляже", "в горах", "на дне моря"};
    private String[] whenList = {"вчера", "сегодня", "завтра", "на прошлой неделе", "в следующем месяце"};
    private String[] withWhomList = {"с другом", "с соседом", "со случайным прохожим", "со знакомым", "с алиеном"};
    private String[] whatDidList = {"играли в футбол", "читали книгу", "смотрели фильм", "готовили пиццу", "строили дом"};
    private String[] whatHappenedList = {"случайно упал", "нашел сокровище", "встретил знаменитость", "получил приз", "нарисовал картину"};
    private String[] moralList = {"Учись, чему-то новому", "Будь активным", "Всегда оставайся позитивным", "Не бойся новых вызовов", "Живи ярко"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sentenceTextView = findViewById(R.id.sentenceTextView);
    }

    public void generateSentence(View view) {
        String who = whoList[new Random().nextInt(whoList.length)];
        String where = whereList[new Random().nextInt(whereList.length)];
        String when = whenList[new Random().nextInt(whenList.length)];
        String withWhom = withWhomList[new Random().nextInt(withWhomList.length)];
        String whatDid = whatDidList[new Random().nextInt(whatDidList.length)];
        String whatHappened = whatHappenedList[new Random().nextInt(whatHappenedList.length)];
        String moral = moralList[new Random().nextInt(moralList.length)];

        String sentence = who + " был " + where + " " + when + ". Вместе " + withWhom + " они " + whatDid + ", и тут " + whatHappened + ". Мораль истории: " + moral;

        sentenceTextView.setText(sentence);
    }
}