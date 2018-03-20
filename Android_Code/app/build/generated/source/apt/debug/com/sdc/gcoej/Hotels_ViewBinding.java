// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Hotels_ViewBinding implements Unbinder {
  private Hotels target;

  @UiThread
  public Hotels_ViewBinding(Hotels target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Hotels_ViewBinding(Hotels target, View source) {
    this.target = target;

    target.pb = Utils.findRequiredViewAsType(source, R.id.pb, "field 'pb'", ProgressBar.class);
    target.lv = Utils.findRequiredViewAsType(source, R.id.music_list, "field 'lv'", ListView.class);
    target.selectdate = Utils.findRequiredViewAsType(source, R.id.seldate, "field 'selectdate'", TextView.class);
    target.city = Utils.findRequiredViewAsType(source, R.id.city, "field 'city'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Hotels target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.pb = null;
    target.lv = null;
    target.selectdate = null;
    target.city = null;
  }
}
