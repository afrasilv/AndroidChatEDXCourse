package com.afrasilv.androidchatedxcourse.signup.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.afrasilv.androidchatedxcourse.R;
import com.afrasilv.androidchatedxcourse.contactlist.ui.ContactListActivity;
import com.afrasilv.androidchatedxcourse.login.LoginPresenter;
import com.afrasilv.androidchatedxcourse.login.LoginPresenterImpl;
import com.afrasilv.androidchatedxcourse.login.ui.LoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignUpActivity extends AppCompatActivity implements LoginView{
    @BindView(R.id.editTxtEmail)
    EditText inputEmail;
    @BindView(R.id.editTxtPassword)
    EditText inputPassword;
    @BindView(R.id.btnSignup)
    Button btnSignup;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.layoutMainContainer)
    RelativeLayout container;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);

        setTitle(R.string.signup_title);

        loginPresenter = new LoginPresenterImpl(this);
        loginPresenter.onCreate();
    }

    @Override
    protected void onDestroy(){
        loginPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    protected void onPause(){
        loginPresenter.onPause();
        super.onPause();
    }

    @Override
    protected void onResume(){
        super.onResume();

        loginPresenter.onResume();
    }

    @Override
    public void enableInputs() {
        setInputs(true);
    }

    @Override
    public void disableInputs() {
        setInputs(false);
    }


    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @OnClick(R.id.btnSignup)
    @Override
    public void handleSignUp() {
        loginPresenter.registerNewUser(inputEmail.getText().toString(),
                inputPassword.getText().toString());
    }

    @Override
    public void handleSignIn() {
        throw new UnsupportedOperationException("Operation is not valid in SignUpActivity");
    }

    @Override
    public void navigateToMainScreen() {
        Intent intent = new Intent(this, ContactListActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);    }

    @Override
    public void loginError(String error) {
        throw new UnsupportedOperationException("Operation is not valid in SignUpActivity");
    }

    @Override
    public void newUserSuccess() {
        Snackbar.make(container, R.string.login_notice_message_signup, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void newUserError(String error) {
        inputPassword.setText("");
        String msgError = String.format(getString(R.string.login_error_message_signup), error);
        inputPassword.setError(msgError);
    }

    private void setInputs(boolean enabled){
        inputEmail.setEnabled(enabled);
        inputPassword.setEnabled(enabled);
        btnSignup.setEnabled(enabled);
    }
}
