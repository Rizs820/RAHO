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

public class TravelFragment_ViewBinding implements Unbinder {
  private TravelFragment target;

  @UiThread
  public TravelFragment_ViewBinding(TravelFragment target, View source) {
    this.target = target;

    target.vehicle = Utils.findRequiredViewAsType(source, R.id.vehicle, "field 'vehicle'", LinearLayout.class);
    target.acc = Utils.findRequiredViewAsType(source, R.id.accomo, "field 'acc'", LinearLayout.class);
    target.shop = Utils.findRequiredViewAsType(source, R.id.shopping, "field 'shop'", LinearLayout.class);
    target.realtime = Utils.findRequiredViewAsType(source, R.id.realtime, "field 'realtime'", LinearLayout.class);
    target.mytrips = Utils.findRequiredViewAsType(source, R.id.mytrips, "field 'mytrips'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TravelFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vehicle = null;
    target.acc = null;
    target.shop = null;
    target.realtime = null;
    target.mytrips = null;
  }
}
