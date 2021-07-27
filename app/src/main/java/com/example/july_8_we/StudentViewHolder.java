package com.example.july_8_we;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvStudentImg;
    private TextView mTvName;
    private TextView Mtvage;
    private TextView mTvDOB;
    private TextView mTvaddress;
    private RelativeLayout relativeLayout1;
    private itemClickLIstner itemClickLIstner;
    public StudentViewHolder(View itemView, com.example.july_8_we.itemClickLIstner itemClickLIstner) {
        super(itemView);
        initViews(itemView);
        this.itemClickLIstner=itemClickLIstner;
    }

    private void initViews(View itemView){
        mIvStudentImg=itemView.findViewById(R.id.ivStudentImg);
        mTvName=itemView.findViewById(R.id.tvName);
        mTvDOB=itemView.findViewById(R.id.tvDob);
        mTvaddress=itemView.findViewById(R.id.tvAddress);
        Mtvage=itemView.findViewById(R.id.tvAge);
        relativeLayout1=itemView.findViewById(R.id.relativelayout);
    }
    public void setDate(StudentModel studentModel,int position){
        mIvStudentImg.setImageResource(studentModel.getImageId());
        mTvName.setText(studentModel.getName()+"");
        mTvDOB.setText(studentModel.getDOB()+"");
        mTvaddress.setText(studentModel.getAddress()+"");
        Mtvage.setText(studentModel.getAge()+"");
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickLIstner.onItemClicked(studentModel,position );
            }
        });
    }

}
