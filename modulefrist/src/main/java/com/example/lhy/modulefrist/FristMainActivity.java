package com.example.lhy.modulefrist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.lhy.base.Constance;

@Route(path = Constance.MODULEFRIST_URL)
public class FristMainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
        setContentView(R.layout.activity_main_module_frist);
        btnToLogin = findViewById(R.id.frist_btn_to_login);
        btnToLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.frist_btn_to_login) {
            ARouter.getInstance().build(Constance.LOGIN_URL).navigation();
        }
    }
}
