// Generated code from Butter Knife. Do not modify!
package com.sdc.gcoej.destinations.description;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.sdc.gcoej.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FinalCityInfo_ViewBinding implements Unbinder {
  private FinalCityInfo target;

  @UiThread
  public FinalCityInfo_ViewBinding(FinalCityInfo target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FinalCityInfo_ViewBinding(FinalCityInfo target, View source) {
    this.target = target;

    target.temp = Utils.findRequiredViewAsType(source, R.id.temp, "field 'temp'", TextView.class);
    target.humidity = Utils.findRequiredViewAsType(source, R.id.humidit, "field 'humidity'", TextView.class);
    target.weatherinfo = Utils.findRequiredViewAsType(source, R.id.weatherinfo, "field 'weatherinfo'", TextView.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.head, "field 'title'", TextView.class);
    target.iv = Utils.findRequiredViewAsType(source, R.id.image, "field 'iv'", ImageView.class);
    target.ico = Utils.findRequiredViewAsType(source, R.id.icon, "field 'ico'", ImageView.class);
    target.des = Utils.findRequiredViewAsType(source, R.id.expand_text_view, "field 'des'", ExpandableTextView.class);
    target.funfact = Utils.findRequiredViewAsType(source, R.id.funfact, "field 'funfact'", LinearLayout.class);
    target.restau = Utils.findRequiredViewAsType(source, R.id.restau, "field 'restau'", LinearLayout.class);
    target.hangout = Utils.findRequiredViewAsType(source, R.id.hangout, "field 'hangout'", LinearLayout.class);
    target.monum = Utils.findRequiredViewAsType(source, R.id.monu, "field 'monum'", LinearLayout.class);
    target.shopp = Utils.findRequiredViewAsType(source, R.id.shoppp, "field 'shopp'", LinearLayout.class);
    target.trend = Utils.findRequiredViewAsType(source, R.id.trends, "field 'trend'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FinalCityInfo target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.temp = null;
    target.humidity = null;
    target.weatherinfo = null;
    target.title = null;
    target.iv = null;
    target.ico = null;
    target.des = null;
    target.funfact = null;
    target.restau = null;
    target.hangout = null;
    target.monum = null;
    target.shopp = null;
    target.trend = null;
  }
}
