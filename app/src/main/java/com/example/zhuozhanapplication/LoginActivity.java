package com.example.zhuozhanapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.zhuozhanapplication.httpUtils.BaseUrlUtils;
import com.example.zhuozhanapplication.httpUtils.MyService;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends Activity implements View.OnClickListener {

    private EditText usernameEdit;
    private EditText passwordEdit;
    private Button login_Btn;
    private String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        initView();
    }

    private void initView() {
        usernameEdit = (EditText) findViewById(R.id.usernameEdit);
        passwordEdit = (EditText) findViewById(R.id.passwordEdit);
        login_Btn = (Button) findViewById(R.id.login_Btn);

        login_Btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_Btn:
                String name = usernameEdit.getText().toString();
                String pass = passwordEdit.getText().toString();
                if (name.isEmpty()||pass.isEmpty()){
                    submit();
                }else {
                    OkHttpClient client = new OkHttpClient.Builder().build();
                    Retrofit retrofit=new Retrofit.Builder().client(client)
                            .baseUrl(BaseUrlUtils.NET_BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                    MyService service = retrofit.create(MyService.class);
                    Call<ResponseBody> login = service.getLogin(name, pass);
                    login.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                            try {
                                String string = response.body().string();
                                Log.e("aaa",""+string);
                                JSONObject jsonObject=new JSONObject(string);
                                int code = jsonObject.getInt("code");
                                if (code==1){
                                    JSONObject data=jsonObject.getJSONObject("data");
                                    token = data.getString("token");
                                    Log.e("token",""+ token);
                                    Toast.makeText(LoginActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
                                    Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                                    intent.putExtra("token",token);
                                    startActivity(intent);
                                    finish();
                                }else {
                                    String message = jsonObject.getString("message");
                                    Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {
                            Log.e("aaa",""+t);
                            Toast.makeText(LoginActivity.this, "网络请求失败", Toast.LENGTH_SHORT).show();
                        }
                    });

                }
                break;
        }
    }

    private void submit() {
        // validate
        String usernameEditString = usernameEdit.getText().toString().trim();
        if (TextUtils.isEmpty(usernameEditString)) {
            Toast.makeText(this, "用户名不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String passwordEditString = passwordEdit.getText().toString().trim();
        if (TextUtils.isEmpty(passwordEditString)) {
            Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something
    }
}
