package com.example.july_8_we;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    @NonNull
private ArrayList<StudentModel> studentList;
    private itemClickLIstner itemClickLIstner;
    public StudentAdapter(ArrayList<StudentModel> studentList,itemClickLIstner itemClickLIstner){
        this.studentList=studentList;
        this.itemClickLIstner=itemClickLIstner;
    }



    @Override
    public StudentViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new StudentViewHolder(view,itemClickLIstner);
    }

    @Override
    public void onBindViewHolder( StudentViewHolder holder, int position) {
    StudentModel studentModel=studentList.get(position);
    holder.setDate(studentModel,position);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
