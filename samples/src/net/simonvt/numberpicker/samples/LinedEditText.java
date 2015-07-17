package net.simonvt.numberpicker.samples;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;

public class LinedEditText extends EditText{
	
	private Paint linePaint;
	private float margin = 10;

    private int paperColor ;
    private Rect rect;
	public LinedEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		this.linePaint = new Paint();
		rect = new Rect();
	}

	public LinedEditText(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		this.linePaint = new Paint();
		rect = new Rect();
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		//canvas.drawColor(Color.WHITE);
//		canvas.drawColor(this.paperColor);
		linePaint.setColor(Color.RED);

         int i = getLineCount();

         int j = getHeight();

         int k = getLineHeight();

         int m = 1 + j / k;

         if (i < m)

             i = m;
         int n = getCompoundPaddingTop();
//        float e = getLineSpacingExtra();
         int baseline = getLineBounds(0, rect);
         canvas.drawLine(0.0F, n-10, getRight(), n-10, this.linePaint);
         for (int i2 = 0;; i2++) {

             if (i2 >= i) {

                 setPadding(20 , 10, 20, 10);

                 super.onDraw(canvas);

                 canvas.restore();

                 return;

             }

             n += k;
            
//             canvas.drawLine(0.0F, n-2, getRight(), n-2, this.linePaint);
             int uu = (n+baseline)/ 2+5;
             canvas.drawLine(0.0F, uu, getRight(), uu, this.linePaint);

             canvas.save();
             baseline += k;
             
         }
         
         
	}

}
