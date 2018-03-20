// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ScrollView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MapRealTimeActivity_ViewBinding implements Unbinder {
  private MapRealTimeActivity target;

  @UiThread
  public MapRealTimeActivity_ViewBinding(MapRealTimeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MapRealTimeActivity_ViewBinding(MapRealTimeActivity target, View source) {
    this.target = target;

    target.sc = Utils.findRequiredViewAsType(source, R.id.data, "field 'sc'", ScrollView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MapRealTimeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.sc = null;
  }
}
