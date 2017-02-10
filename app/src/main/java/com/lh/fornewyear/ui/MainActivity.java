package com.lh.fornewyear.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.SimpleAdapter;

import com.lh.fornewyear.R;
import com.lh.fornewyear.view.MyListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Toolbar mToolbar;
    MyListView mListView;
    FloatingActionButton mFloatBtn;
    List<Map<String, Integer>> mList = new ArrayList<Map<String, Integer>>();
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.tool);
        mFloatBtn = (FloatingActionButton) findViewById(R.id.float_btn);
//        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mListView = (MyListView) findViewById(R.id.list);
        initDate();
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        mRecyclerView.setAdapter(new MyRecyAdapter(mList, this));
//        ViewCompat.setNestedScrollingEnabled(mListView, true);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            mListView.setNestedScrollingEnabled(true);
//        }


        mListView.setAdapter(new SimpleAdapter(this, mList, android.R.layout.simple_list_item_1,
                new String[]{"1"}, new int[]{android.R.id.text1}));

    }

    private void initDate() {
        Map<String, Integer> map = new HashMap();
        map.put("1", 1);
        mList.add(map);
        map = new HashMap<>();
        map.put("1", 2);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
        mList.add(map);
    }

    public void onclick(View view) {
        Snackbar.make(findViewById(R.id.float_btn), "x", Snackbar.LENGTH_SHORT).setAction("确定",
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }).show();
    }
}
