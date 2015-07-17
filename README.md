# NumberPicker
android 修改系统NumberPicker中间的edittext颜色、内容等
![image](https://github.com/tuzhong/NumberPicker/blob/master/img.png)

LinedEditText 控制光标的高度，光标的样式都可以，主要设置android:textCursorDrawable="@drawable/shape"  
shape.xml
<shape xmlns:android="http://schemas.android.com/apk/res/android" 
    android:shape="rectangle"
    >
    <size android:height="25dp" android:width="1dp"/>
	<solid android:color="#000"/>
	<padding 
	    android:top="1sp"
	    android:bottom="-11sp"
	    />
</shape>






