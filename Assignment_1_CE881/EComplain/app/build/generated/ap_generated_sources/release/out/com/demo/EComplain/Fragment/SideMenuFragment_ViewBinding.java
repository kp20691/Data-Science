// Generated code from Butter Knife. Do not modify!
package com.demo.EComplain.Fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.demo.EComplain.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SideMenuFragment_ViewBinding implements Unbinder {
  private SideMenuFragment target;

  @UiThread
  public SideMenuFragment_ViewBinding(SideMenuFragment target, View source) {
    this.target = target;

    target.afterloginlinear = Utils.findRequiredViewAsType(source, R.id.afterloginlinear, "field 'afterloginlinear'", LinearLayout.class);
    target.txtusername = Utils.findRequiredViewAsType(source, R.id.txtusername, "field 'txtusername'", TextView.class);
    target.txtmobile = Utils.findRequiredViewAsType(source, R.id.txtmobile, "field 'txtmobile'", TextView.class);
    target.txtAddComplaint = Utils.findRequiredViewAsType(source, R.id.txtAddComplaint, "field 'txtAddComplaint'", TextView.class);
    target.lnrAddComplaint = Utils.findRequiredViewAsType(source, R.id.lnrAddComplaint, "field 'lnrAddComplaint'", LinearLayout.class);
    target.txtContactUs = Utils.findRequiredViewAsType(source, R.id.txtContactUs, "field 'txtContactUs'", TextView.class);
    target.lnrContactUs = Utils.findRequiredViewAsType(source, R.id.lnrContactUs, "field 'lnrContactUs'", LinearLayout.class);
    target.txtAboutUs = Utils.findRequiredViewAsType(source, R.id.txtAboutUs, "field 'txtAboutUs'", TextView.class);
    target.lnrAboutUs = Utils.findRequiredViewAsType(source, R.id.lnrAboutUs, "field 'lnrAboutUs'", LinearLayout.class);
    target.txtShareApp = Utils.findRequiredViewAsType(source, R.id.txtShareApp, "field 'txtShareApp'", TextView.class);
    target.lnrShareApp = Utils.findRequiredViewAsType(source, R.id.lnrShareApp, "field 'lnrShareApp'", LinearLayout.class);
    target.txtLogout = Utils.findRequiredViewAsType(source, R.id.txtLogout, "field 'txtLogout'", TextView.class);
    target.lnrLogout = Utils.findRequiredViewAsType(source, R.id.lnrLogout, "field 'lnrLogout'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SideMenuFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.afterloginlinear = null;
    target.txtusername = null;
    target.txtmobile = null;
    target.txtAddComplaint = null;
    target.lnrAddComplaint = null;
    target.txtContactUs = null;
    target.lnrContactUs = null;
    target.txtAboutUs = null;
    target.lnrAboutUs = null;
    target.txtShareApp = null;
    target.lnrShareApp = null;
    target.txtLogout = null;
    target.lnrLogout = null;
  }
}
