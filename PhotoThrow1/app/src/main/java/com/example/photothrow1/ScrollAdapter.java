package com.example.photothrow1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class ScrollAdapter extends RecyclerView.Adapter<ScrollAdapter.ViewHolder>{
        public static final int ACTIVITY_FILE_UPLOAD = 0;
        public static final int GALLERY = 1;

        private List<String> mData;
        private int whichView;

        public class ViewHolder extends RecyclerView.ViewHolder {
            //            public TextView mTextView;
            public ViewHolder(View v) {
                super(v);
//                mTextView = (TextView) v.findViewById(R.id.info_text);
            }
        }

        public ScrollAdapter(List<String> data, int whichView) {
            mData = data;
            this.whichView = whichView;
        }

        @Override
        public ScrollAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v;

            switch (whichView) {
                case GALLERY:
                    v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.gallery_item, parent, false);
                    break;
                default:
                    v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.activity_file_upload_item, parent, false);
                    break;
            }
            ViewHolder vh = new ViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
////            holder.mTextView.setText(mData.get(position));
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
