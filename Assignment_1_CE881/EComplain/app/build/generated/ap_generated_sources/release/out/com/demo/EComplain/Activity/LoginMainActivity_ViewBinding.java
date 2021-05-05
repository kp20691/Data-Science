// Generated code from Butter Knife. Do not modify!
package com.demo.EComplain.Activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.demo.EComplain.R;
import com.libizo.CustomEditText;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginMainActivity_ViewBinding implements Unbinder {
  private LoginMainActivity target;

  @UiThread
  public LoginMainActivity_ViewBinding(LoginMainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginMainActivity_ViewBinding(LoginMainActivity target, View source) {
    this.target = target;

    target.txtRegisterTitle = Utils.findRequiredViewAsType(source, R.id.txtRegisterTitle, "field 'txtRegisterTitle'", TextView.class);
    target.txtregister = Utils.findRequiredViewAsType(source, R.id.txtregister, "field 'txtregister'", TextView.class);
    target.btnlogin = Utils.findRequiredViewAsType(source, R.id.btnlogin, "field 'btnlogin'", CardView.class);
    target.edtusername = Utils.findRequiredViewAsType(source, R.id.edtusername, "field 'edtusername'", CustomEditText.class);
    target.edtpassword = Utils.findRequiredViewAsType(source, R.id.edtpassword, "field 'edtpassword'", CustomEditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginMainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtRegisterTitle = null;
    target.txtregister = null;
    target.btnlogin = null;
    target.edtusername = null;
    target.edtpassword = null;
  }
}
