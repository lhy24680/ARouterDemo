package com.example.lhy.arouterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.lhy.base.Constance;

public class MainActivity extends AppCompatActivity {

    private Button toLoginBtn;
    private Button toFristModuleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
        setContentView(R.layout.activity_main);
        toLoginBtn = findViewById(R.id.btn_to_login);
        toFristModuleBtn = findViewById(R.id.btn_to_frist);
        toLoginBtn.setOnClickListener(listener);
        toFristModuleBtn.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_to_login:
                    ARouter.getInstance().build(Constance.LOGIN_URL).navigation();
                    break;
                case R.id.btn_to_frist:
                    ARouter.getInstance().build(Constance.MODULEFRIST_URL).navigation();
                    break;
                default:
                    break;
            }
        }
    };


}
