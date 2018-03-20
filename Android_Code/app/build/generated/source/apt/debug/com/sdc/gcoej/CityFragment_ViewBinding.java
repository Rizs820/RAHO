// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CityFragment_ViewBinding implements Unbinder {
  private CityFragment target;

  private View view2131296347;

  private TextWatcher view2131296347TextWatcher;

  @UiThread
  public CityFragment_ViewBinding(final CityFragment target, View source) {
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
    target.pb = Utils.findRequiredViewAsType(source, R.id.pb, "field 'pb'", ProgressBar.class);
    target.lv = Utils.findRequiredViewAsType(source, R.id.music_list, "field 'lv'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CityFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cityname = null;
    target.pb = null;
    target.lv = null;

    ((TextView) view2131296347).removeTextChangedListener(view2131296347TextWatcher);
    view2131296347TextWatcher = null;
    view2131296347 = null;
  }
}
