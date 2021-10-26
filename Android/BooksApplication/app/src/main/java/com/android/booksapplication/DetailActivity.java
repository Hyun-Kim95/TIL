package com.android.booksapplication;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    Button btn_rental;
    int rental;
    int num = -1;
    TextView detail_rental;

    void changeRental(){
        if(rental == 0){
            rental = 1;
        }else{
            rental = 0;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle(getResources().getString(R.string.detail_info));

        btn_rental = (Button) findViewById(R.id.btn_rental);
        detail_rental = (TextView) findViewById(R.id.detail_rental);

        btn_rental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("button","rental");
                if(num == -1){
                    return;
                }
                // update books set rental=1 where num=2;

                changeRental();
                ContentValues cv = new ContentValues();
                cv.put("rental",rental);
                // selectionArgs 미사용
                int result = getContentResolver().update(MyContentProvider.URI, cv,"num="+num,null);
                if(result == 1){
                    showBookInfo(rental);
                }else{
                    changeRental();
                }
            }
        });
        Intent intent = getIntent();
//        Book book = (Book)intent.getSerializableExtra("book");
        Book book = intent.getParcelableExtra("book");

//        int num = intent.getIntExtra("num", 0);
//        String title = intent.getStringExtra("title");
//        String author = intent.getStringExtra("author");
//        String publisher = intent.getStringExtra("publisher");
//        String summary = intent.getStringExtra("summary");
//        int rental = intent.getIntExtra("rental", 0);
        num = book.getNum();
        String title = book.getTitle();
        String author = book.getAuthor();
        String publisher = book.getPublisher();
        String summary = book.getSummary();

        ((TextView)findViewById(R.id.detail_title)).setText("책 제목 : "+title);
        ((TextView)findViewById(R.id.detail_author)).setText("지은이 : "+author);
        ((TextView)findViewById(R.id.detail_publisher)).setText("출판사 : "+publisher);
        ((TextView)findViewById(R.id.detail_summary)).setText("줄거리 : "+summary);

        rental = getBookRental(num);
        showBookInfo(rental);
    }
    public void showBookInfo(int rental){
        String isRental = "대출가능";
        String btnRental = "대출";

        if(rental == 1){
            isRental = "대출중";
            btnRental = "반납";
        }
        ((TextView)findViewById(R.id.detail_rental)).setText("대출여부 : "+isRental);
        btn_rental.setText(btnRental);
    }

    int getBookRental(int num){
        String[] columns = new String[]{"rental"};
        String[] selectionArgs = {String.valueOf(num)}; // selectionArgs 사용
        Cursor cursor =  getContentResolver().query(MyContentProvider.URI, columns, "num=?", selectionArgs, null);
        int result = -1;
        if(cursor != null){
            if(cursor.moveToNext()){
                result = cursor.getInt(0);
            }
        }
        return result;
    }
}