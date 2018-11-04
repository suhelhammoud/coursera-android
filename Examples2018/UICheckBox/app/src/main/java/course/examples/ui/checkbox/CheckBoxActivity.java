package course.examples.ui.checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class CheckBoxActivity extends Activity {

    private static final String CHECKBOX_CHECKED_STATE_KEY = "CHECKBOX_CHECKED_STATE_KEY";
    private static final String CHECKBOX_VISIBILITY_STATE_KEY = "CHECKBOX_VISIBILITY_STATE_KEY";
    private static final String BUTTON_TEXT_STATE_KEY = "BUTTON_TEXT_STATE_KEY";
    private CheckBox mCheckBox;
    private Button mButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Get a reference to the CheckBox
        mCheckBox = findViewById(R.id.checkbox);

        // Get a reference to the Button
        mButton = findViewById(R.id.button);

        mCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCheckBox.isChecked()) {
                    mCheckBox.setText(R.string.im_checked_string);
                } else {
                    mCheckBox.setText(R.string.im_not_checked_string);
                }
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toggle the CheckBox's visibility state
                // Set the Button text accordingly
                if (mCheckBox.isShown()) {
                    mCheckBox.setVisibility(View.INVISIBLE);
                    mButton.setText(R.string.unhide_checkbox_string);
                } else {
                    mCheckBox.setVisibility(View.VISIBLE);
                    mButton.setText(R.string.hide_checkbox_string);
                }


            }
        });
    }
}