package com.jk.rx.multitype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.jk.rx.R;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

public class MultitypeActivity extends AppCompatActivity {
    private RecyclerView mRvMultitype;
    private MultiTypeAdapter mMultiAdapter;
    private Items mItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multitype);
        initView();
        initData();
    }

    private void initData() {
        for (int i = 0; i < 10; i++) {
            Category entity = new Category();
            entity.setName("哈哈" + i);
            mItems.add(entity);
        }
//        mMultiAdapter.notifyDataSetChanged();
        mRvMultitype.setAdapter(mMultiAdapter);
    }

    private void initView() {
        mRvMultitype = (RecyclerView) findViewById(R.id.rv_multitype);
        mItems = new Items();
        mMultiAdapter = new MultiTypeAdapter(mItems);
        mMultiAdapter.register(Category.class, new CategoryViewBinder());
    }
}
