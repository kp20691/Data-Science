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

public class SplashScreenActivity_ViewBinding implements Unbinder {
  private SplashScreenActivity target;

  @UiThread
  public SplashScreenActivity_ViewBinding(SplashScreenActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SplashScreenActivity_ViewBinding(SplashScreenActivity target, View source) {
    this.target = target;

    target.txtversion = Utils.findRequiredViewAsType(source, R.id.txtversion, "field 'txtversion'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SplashScreenActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtversion = null;
  }
}
