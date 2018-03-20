// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dd.processbutton.FlatButton;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddNewTrip_ViewBinding implements Unbinder {
  private AddNewTrip target;

  private View view2131296347;

  private TextWatcher view2131296347TextWatcher;

  @UiThread
  public AddNewTrip_ViewBinding(AddNewTrip target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddNewTrip_ViewBinding(final AddNewTrip target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.cityname, "field 'cityname' and method 'onTextChanged'");
    target.cityname = Utils.castView(view, R.id.cityname, "field 'cityname'", AutoCompleteTextView.class);
    view2131296347 = view;
    view2131296347TextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        target.onTextChanged();
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
      }
    };
    ((TextView) view).addTextChangedListener(view2131296347TextWatcher);
    target.sdate = Utils.findRequiredViewAsType(source, R.id.sdate, "field 'sdate'", FlatButton.class);
    target.edate = Utils.findRequiredViewAsType(source, R.id.edate, "field 'edate'", FlatButton.class);
    target.ok = Utils.findRequiredViewAsType(source, R.id.ok, "field 'ok'", FlatButton.class);
    target.tname = Utils.findRequiredViewAsType(source, R.id.tname, "field 'tname'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddNewTrip target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cityname = null;
    target.sdate = null;
    target.edate = null;
    target.ok = null;
    target.tname = null;

    ((TextView) view2131296347).removeTextChangedListener(view2131296347TextWatcher);
    view2131296347TextWatcher = null;
    view2131296347 = null;
  }
}
