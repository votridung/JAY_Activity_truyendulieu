package gamemoble.com.jay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityB extends AppCompatActivity {

    private TextView tv_de_tai, tv_noi_dung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        tv_de_tai=(TextView) findViewById(R.id.tv_de_tai);
        tv_noi_dung=(TextView) findViewById(R.id.tv_noi_dung);

        setDataByBundle();
        //setDataByExtras();


    }
    public void setDataByExtras(){
        Intent intent =getIntent();
        String de_tai= intent.getStringExtra(MainActivityA.DETAI);
        String noi_dung= intent.getStringExtra(MainActivityA.NOIDUNG);

        tv_de_tai.setText(de_tai);
        tv_noi_dung.setText(noi_dung);
    }
    public void setDataByBundle(){
        Intent intent =getIntent();
        Bundle bundle= intent.getBundleExtra(MainActivityA.BUNDLE);
        String de_tai= bundle.getString(MainActivityA.DETAI);
        String noi_dung= bundle.getString(MainActivityA.NOIDUNG);

        tv_de_tai.setText(de_tai);
        tv_noi_dung.setText(noi_dung);
    }
}
