package id.web.krstudio.simpleapps;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import id.web.krstudio.simpleapps.data.PrefManager;
import id.web.krstudio.simpleapps.databinding.ActivityLoginBinding;

import static id.web.krstudio.simpleapps.UtilsApp.getActivityComponent;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding mBinding;
    @Inject
    PrefManager mPrefmanager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        getActivityComponent(this).inject(this);
        mPrefmanager.putIsLogin(true);
        Toast.makeText(this,mPrefmanager.isLoggedin()+ " ggwp",Toast.LENGTH_LONG).show();
    }
}
