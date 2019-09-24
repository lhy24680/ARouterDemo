package com.example.lhy.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.lhy.base.Constance;

@Route(path = Constance.LOGIN_URL)
public class LoginMainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnToModulefrist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
        setContentView(R.layout.activity_main_login);
        btnToModulefrist = (Button) findViewById(R.id.login_btn_to_modulefrist);
        btnToModulefrist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login_btn_to_modulefrist) {
            ARouter.getInstance().build(Constance.MODULEFRIST_URL).navigation();
        }
    }
}
