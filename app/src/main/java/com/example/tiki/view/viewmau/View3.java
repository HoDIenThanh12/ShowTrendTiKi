package com.example.tiki.view.viewmau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tiki.R;
import com.example.tiki.retofits.Retrofits;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class View3 extends AppCompatActivity {

    private  TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view3);
        tx=findViewById(R.id.tx_rs);


//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://jsonplaceholder.typicode.com/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        jsonAPI jsonAPI = retrofit.create(com.example.tiki.view.viewmau.jsonAPI.class);
//
//
//        Call<List<Post>> call = jsonAPI.getPost();
//
//
//        call.enqueue(new Callback<List<Post>>() {
//            @Override
//            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
//                if(!response.isSuccessful()){
//                    tx.setText("code: "+response.code());
//                    return;
//                }
//                List<Post> p =response.body();
//                for(Post p2:p){
//                    String conten="";
//                    conten+="ID:  "+p2.getId() + "\n";
//                    conten += "userId: "+p2.getUseId()+"\n";
//                    conten += "title: "+p2.getTitle()+"\n";
//                    conten += "text: "+p2.getText()+"\n\n";
//                    tx.append(conten);
//                }
//                Toast.makeText(getApplicationContext(), "-----thành công", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onFailure(Call<List<Post>> call, Throwable t) {
//                tx.setText(t.getMessage());
//                Toast.makeText(getApplicationContext(), "---------thất bại", Toast.LENGTH_LONG).show();
//            }
//        });
        getData();
    }
    public void getData(){
        Call<List<Post>> call = Retrofits.getInstance().getJsonAPI().getPost();

        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                Toast.makeText(getApplicationContext(), "-----thành công", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "---------thất bại", Toast.LENGTH_LONG).show();
            }
        });
    }
}