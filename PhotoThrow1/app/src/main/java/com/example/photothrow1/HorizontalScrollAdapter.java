package com.example.photothrow1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ntub106403 on 2017/7/12.
 */

public class HorizontalScrollAdapter extends RecyclerView.Adapter<HorizontalScrollAdapter.ViewHolder>{
        private List<String> mData;

        public class ViewHolder extends RecyclerView.ViewHolder {
            //            public TextView mTextView;
            public ViewHolder(View v) {
                super(v);
//                mTextView = (TextView) v.findViewById(R.id.info_text);
            }
        }

        public HorizontalScrollAdapter(List<String> data) {
            mData = data;
        }

        @Override
        public HorizontalScrollAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item, parent, false);
            ViewHolder vh = new ViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
//            holder.mTextView.setText(mData.get(position));
//            holder.itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent();
//                    intent.setClass(MainActivity.this, SubActivity.class);
//                    startActivity(intent);
//                    MainActivity.this.finish();
////                    Toast.makeText(MainActivity.this, "Item " + position + " is clicked.", Toast.LENGTH_SHORT).show();
//                }
//            });
//            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
//                @Override
//                public boolean onLongClick(View v) {
//                    Toast.makeText(MainActivity.this, "Item " + position + " is long clicked.", Toast.LENGTH_SHORT).show();
//                    return true;
//                }
//            });
        }

        @Override
        public int getItemCount() {
            return mData.size();
        }
}
