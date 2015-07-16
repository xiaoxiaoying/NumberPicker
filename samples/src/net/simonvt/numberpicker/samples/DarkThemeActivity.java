package net.simonvt.numberpicker.samples;

import net.simonvt.numberpicker.R;
import net.simonvt.numberpicker.view.NumberPicker;
import net.simonvt.numberpicker.view.NumberPicker.OnValueChangeListener;
import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;

public class DarkThemeActivity extends Activity {
	private NumberPicker np;
	private Button btn;
	final String[] strs = { "00:00", "01:00", "02:00", "03:00", "04:00",
			"05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00",
			"12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00",
			"19:00", "20:00", "21:00", "22:00", "23:00" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_dark);

		np = (NumberPicker) findViewById(R.id.numberPicker);
		np.setMaxValue(23);
		np.setMinValue(0);
		np.setFocusable(true);
		np.setFocusableInTouchMode(true);

		np.setDisplayedValues(strs);
		np.setOnValueChangedListener(new OnValueChangeListener() {

			@Override
			public void onValueChange(NumberPicker picker, int oldVal,
					int newVal, EditText editText) {
				// editText.setTextColor(getResources().getColor(R.color.blue));
			}

		});
		btn = (Button) findViewById(R.id.show);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				show();

			}
		});
	}

	private void show() {

		View popuView = LayoutInflater.from(this).inflate(
				R.layout.popu_picker_time, null);

		init(popuView);
		PopupWindow popu = new PopupWindow(popuView,
				ViewGroup.LayoutParams.MATCH_PARENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
		popu.setBackgroundDrawable(new BitmapDrawable());
		popu.setOutsideTouchable(true);
		popu.setFocusable(true);
		int[] location = new int[2];
		btn.getLocationOnScreen(location);
		popuView.measure(0, 0);

		popu.showAtLocation(btn, Gravity.NO_GRAVITY, location[0], location[1]
				);
	}

	private void init(View view) {
		NumberPicker start = (NumberPicker) view
				.findViewById(R.id.start_numberPicker);
		NumberPicker end = (NumberPicker) view
				.findViewById(R.id.end_numberPicker);
		start.setMaxValue(23);
		start.setMinValue(0);
		start.setFocusable(true);
		start.setFocusableInTouchMode(true);
		start.setDisplayedValues(strs);
		
		end.setMaxValue(23);
		end.setMinValue(0);
		end.setFocusable(true);
		end.setFocusableInTouchMode(true);
		end.setDisplayedValues(strs);
	}

}
