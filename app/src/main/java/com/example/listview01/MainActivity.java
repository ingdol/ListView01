package com.example.listview01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity { //클래스 ListActivity를 상속받아 MainActivity를 작성한다.
    //ListActivity는 ListView를 화면으로 사용하는 액티비티이다.

    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreate 메소드의 매개변수는 이전 실행 상태를 전달한다.
        super.onCreate(savedInstanceState); //부모클래스의 onCreate를 호출한다.
        String[] values = {"Apple", "Apricot", "Avocado", "Banana", "Blackberry"}; //배열에 저장된 데이터

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values); //배열 어댑터를 생성한다.
        setListAdapter(adapter); //adapter을 파라미터로 제공하여 리스트 뷰에 어댑터를 설정한다.
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        //사용자가 리스트 뷰의 항목을 크릭하게 되면 onListItemClick이 호출된다.
        //ListActivity가 가지고 있는 메소드이다.
        String item = (String) getListAdapter().getItem(position); //아이템의 위치 정보를 받아와
        Toast.makeText(this, item +" selected", Toast.LENGTH_LONG).show();
        //토스트 메시지가 표시된다.
    }
}
