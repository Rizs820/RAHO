// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Tweets_ViewBinding implements Unbinder {
  private Tweets target;

  @UiThread
  public Tweets_ViewBinding(Tweets target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Tweets_ViewBinding(Tweets target, View source) {
    this.target = target;

    target.lv = Utils.findRequiredViewAsType(source, R.id.list, "field 'lv'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Tweets target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lv = null;
  }
}
