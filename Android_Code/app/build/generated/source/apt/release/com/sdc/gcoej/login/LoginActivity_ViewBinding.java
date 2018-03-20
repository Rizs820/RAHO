// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej.login;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dd.processbutton.FlatButton;
import com.sdc.gcoej.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target, View source) {
    this.target = target;

    target.signup = Utils.findRequiredViewAsType(source, R.id.signup, "field 'signup'", TextView.class);
    target.login = Utils.findRequiredViewAsType(source, R.id.login, "field 'login'", TextView.class);
    target.sig = Utils.findRequiredViewAsType(source, R.id.signup_layout, "field 'sig'", LinearLayout.class);
    target.log = Utils.findRequiredViewAsType(source, R.id.loginlayout, "field 'log'", LinearLayout.class);
    target.num_login = Utils.findRequiredViewAsType(source, R.id.input_num_login, "field 'num_login'", EditText.class);
    target.pass_login = Utils.findRequiredViewAsType(source, R.id.input_pass_login, "field 'pass_login'", EditText.class);
    target.num_signup = Utils.findRequiredViewAsType(source, R.id.input_num_signup, "field 'num_signup'", EditText.class);
    target.pass_signup = Utils.findRequiredViewAsType(source, R.id.input_pass_signup, "field 'pass_signup'", EditText.class);
    target.name = Utils.findRequiredViewAsType(source, R.id.input_name_signup, "field 'name'", EditText.class);
    target.ok_login = Utils.findRequiredViewAsType(source, R.id.ok_login, "field 'ok_login'", FlatButton.class);
    target.ok_signup = Utils.findRequiredViewAsType(source, R.id.ok_signup, "field 'ok_signup'", FlatButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.signup = null;
    target.login = null;
    target.sig = null;
    target.log = null;
    target.num_login = null;
    target.pass_login = null;
    target.num_signup = null;
    target.pass_signup = null;
    target.name = null;
    target.ok_login = null;
    target.ok_signup = null;
  }
}
