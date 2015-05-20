package c.mars.scaloidsample

import android.app.Activity
import android.content.DialogInterface
import android.content.DialogInterface.OnClickListener
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.scaloid.common._

/**
 * Created by Constantine Mars on 5/20/15.
 */
class MainSActivity extends SActivity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.sactivity_main)

    val t = find[TextView](R.id.text)
    t.setText("Take it")

//    contentView = new SFrameLayout {
//      this += new SVerticalLayout {
//        STextView("Enter your password").<<.wrap.>>
//        SEditText().inputType(TEXT_PASSWORD)
//        STextView("Repeat your password").<<.wrap.>>
//        SEditText().inputType(TEXT_PASSWORD)
//        SButton("Sign in")
//      }.<<.fill.>>
//    }
  }
}
