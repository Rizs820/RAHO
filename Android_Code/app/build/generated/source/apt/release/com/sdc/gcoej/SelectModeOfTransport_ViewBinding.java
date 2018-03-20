// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SelectModeOfTransport_ViewBinding implements Unbinder {
  private SelectModeOfTransport target;

  @UiThread
  public SelectModeOfTransport_ViewBinding(SelectModeOfTransport target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SelectModeOfTransport_ViewBinding(SelectModeOfTransport target, View source) {
    this.target = target;

    target.car = Utils.findRequiredViewAsType(source, R.id.car, "field 'car'", LinearLayout.class);
    target.train = Utils.findRequiredViewAsType(source, R.id.train, "field 'train'", LinearLayout.class);
    target.bus = Utils.findRequiredViewAsType(source, R.id.bus, "field 'bus'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SelectModeOfTransport target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.car = null;
    target.train = null;
    target.bus = null;
  }
}
