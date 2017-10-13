package gamemoble.com.jay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityA extends AppCompatActivity {
    private EditText edt_de_tai , edt_noi_dung;
    private Button btn_send_nude;

    public static final String DETAI="De tai";
    public static final String NOIDUNG="noi dung";
    public static final String BUNDLE="bundle";

    public MainActivityA (){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        edt_de_tai= (EditText)findViewById(R.id.edt_de_tai);
        edt_noi_dung=(EditText) findViewById(R.id.edt_noi_dung);
        btn_send_nude=(Button) findViewById(R.id.btn_send_nude);

        btn_send_nude.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String noi_dung=edt_noi_dung.getText().toString();
                String de_tai=edt_de_tai.getText().toString();

               // byExtras(de_tai,noi_dung);
                byBundle(de_tai,noi_dung);
            }
        });
    }
    public void byExtras(String de_tai, String noi_dung){
        Intent intent= new Intent(MainActivityA.this, MainActivityB.class);
        intent.putExtra(DETAI,de_tai);
        intent.putExtra(NOIDUNG,noi_dung);
        startActivity(intent);
    }

    public void byBundle(String de_tai, String noi_dung){

        Intent intent= new Intent(MainActivityA.this, MainActivityB.class);
        Bundle bundle=new Bundle();
        bundle.putString(DETAI,de_tai);
        bundle.putString(NOIDUNG,noi_dung);
        intent.putExtra(BUNDLE,bundle);
        startActivity(intent);
    }
}
