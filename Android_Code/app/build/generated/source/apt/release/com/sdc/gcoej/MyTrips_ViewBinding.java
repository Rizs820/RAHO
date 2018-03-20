// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.GridView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyTrips_ViewBinding implements Unbinder {
  private MyTrips target;

  @UiThread
  public MyTrips_ViewBinding(MyTrips target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyTrips_ViewBinding(MyTrips target, View source) {
    this.target = target;

    target.g = Utils.findRequiredViewAsType(source, R.id.gv, "field 'g'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyTrips target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.g = null;
  }
}
