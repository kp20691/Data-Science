// Generated code from Butter Knife. Do not modify!
package com.demo.EComplain.Activity;

import android.view.View;
import android.widget.ImageView;
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

public class RegisterMainActivity_ViewBinding implements Unbinder {
  private RegisterMainActivity target;

  @UiThread
  public RegisterMainActivity_ViewBinding(RegisterMainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegisterMainActivity_ViewBinding(RegisterMainActivity target, View source) {
    this.target = target;

    target.txtRegister = Utils.findRequiredViewAsType(source, R.id.txtRegister, "field 'txtRegister'", TextView.class);
    target.imagecrose = Utils.findRequiredViewAsType(source, R.id.imagecrose, "field 'imagecrose'", ImageView.class);
    target.edtusername = Utils.findRequiredViewAsType(source, R.id.edtusername, "field 'edtusername'", CustomEditText.class);
    target.edtmonbileno = Utils.findRequiredViewAsType(source, R.id.edtmonbileno, "field 'edtmonbileno'", CustomEditText.class);
    target.edtemailid = Utils.findRequiredViewAsType(source, R.id.edtemailid, "field 'edtemailid'", CustomEditText.class);
    target.edtpassword = Utils.findRequiredViewAsType(source, R.id.edtpassword, "field 'edtpassword'", CustomEditText.class);
    target.btnregister = Utils.findRequiredViewAsType(source, R.id.btnregister, "field 'btnregister'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RegisterMainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtRegister = null;
    target.imagecrose = null;
    target.edtusername = null;
    target.edtmonbileno = null;
    target.edtemailid = null;
    target.edtpassword = null;
    target.btnregister = null;
  }
}
