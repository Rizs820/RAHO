package com.sdc.gcoej.login;

/**
 * Created by Team SDC on 19/03/18.
 */

public interface LoginView {

    void rememberUserInfo(String id, String name, String num);

    void startMainActivity();

    void showError();

    void showLoadingDialog();

    void dismissLoadingDialog();

    void getRunTimePermissions();

    void checkUserSession();

    void openSignUp();

    void openLogin();

}
