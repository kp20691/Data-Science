// Generated code from Butter Knife. Do not modify!
package com.demo.EComplain.Activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.demo.EComplain.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlacePickerMapActivity_ViewBinding implements Unbinder {
  private PlacePickerMapActivity target;

  @UiThread
  public PlacePickerMapActivity_ViewBinding(PlacePickerMapActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PlacePickerMapActivity_ViewBinding(PlacePickerMapActivity target, View source) {
    this.target = target;

    target.txttitle = Utils.findRequiredViewAsType(source, R.id.txttitle, "field 'txttitle'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PlacePickerMapActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txttitle = null;
  }
}
