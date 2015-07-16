package net.simonvt.numberpicker.samples;

import net.simonvt.numberpicker.R;
import net.simonvt.numberpicker.view.NumberPicker;
import android.app.Activity;
import android.os.Bundle;

public class LightThemeActivity extends Activity {
	String[] strs = { "00:00", "01:00", "02:00", "03:00", "04:00", "05:00",
			"06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00",
			"13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00",
			"20:00", "21:00", "22:00", "23:00" };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_light);

		final NumberPicker np = (NumberPicker) findViewById(R.id.year);
		NumberPicker month = (NumberPicker) findViewById(R.id.month);
		NumberPicker day = (NumberPicker) findViewById(R.id.day);
		np.setMaxValue(23);
		np.setMinValue(0);
		np.setFocusable(true);
		np.setFocusableInTouchMode(true);
		np.setLabel("年");
		np.setDisplayedValues(strs);
		
		
		month.setMaxValue(12);
		month.setMinValue(0);
		month.setFocusable(true);
		month.setFocusableInTouchMode(true);
		month.setLabel("月");
		
		day.setMaxValue(30);
		day.setMinValue(0);
		day.setFocusable(true);
		day.setFocusableInTouchMode(true);
		day.setLabel("日");
		
	}
	

}
