// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SelectCity_ViewBinding implements Unbinder {
  private SelectCity target;

  @UiThread
  public SelectCity_ViewBinding(SelectCity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SelectCity_ViewBinding(SelectCity target, View source) {
    this.target = target;

    target.source = Utils.findRequiredViewAsType(source, R.id.source, "field 'source'", Spinner.class);
    target.dest = Utils.findRequiredViewAsType(source, R.id.destination, "field 'dest'", Spinner.class);
    target.pb = Utils.findRequiredViewAsType(source, R.id.pb, "field 'pb'", ProgressBar.class);
    target.ok = Utils.findRequiredViewAsType(source, R.id.ok, "field 'ok'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SelectCity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.source = null;
    target.dest = null;
    target.pb = null;
    target.ok = null;
  }
}
