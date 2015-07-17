# NumberPicker
android 修改系统NumberPicker中间的edittext颜色、内容等
![image](https://github.com/tuzhong/NumberPicker/blob/master/img.png)

LinedEditText 控制光标的高度，光标的样式都可以，主要设置android:textCursorDrawable="@drawable/shape"  
shape.xml
<?xml version="1.0" encoding="utf-8"?>
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
[shape.xml](https://github.com/xiaoxiaoying/NumberPicker/blob/master/samples/res/drawable-hdpi/shape.xml)

效果图
![image](https://github.com/xiaoxiaoying/NumberPicker/blob/master/QQ%E5%9B%BE%E7%89%8720150717123716.png)

#从这里找到了灵感
(http://stackoverflow.com/questions/11641997/how-to-change-edittext-cursor-height)

[Download apk](https://github.com/xiaoxiaoying/NumberPicker/blob/master/samples/bin/SampleActivity.apk)





