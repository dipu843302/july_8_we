package com.example.july_8_we;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements itemClickLIstner{
private RecyclerView recyclerView;
    StudentAdapter studentAdapter;
private ArrayList<StudentModel>studentList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        buildList();
        setRecycelerView();
    }

    private void setRecycelerView() {

        studentAdapter = new StudentAdapter(studentList,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);

    }

    private void buildList(){
        for (int i=0;i<100;i++){
            StudentModel studentModel=new StudentModel("Jeff Bezos",22,"USA",R.drawable.jeff_bezos_1,"22/02/1999");
           studentList.add(studentModel);
        }
    }

    @Override
    public void onItemClicked(StudentModel model, int position) {
        String str=model.getName()+" "+model.getAddress();
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }
}