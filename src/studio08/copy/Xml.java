/*<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.javaex.bit.ex08.MainActivity">

    <TextView
        android:id="@+id/tv"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textSize="20sp" />

    <EditText
        android:id="@+id/etID"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="text"
        android:hint="아이디를 입력하세요"
        android:textColorHint="#FF3366CC" />

    <EditText
        android:id="@+id/etPass"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textPassword"
        android:hint="비밀번호를 입력하세요"
        android:maxLength="20"/>

    <Spinner
        android:id="@+id/sp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:entries="@array/location"
        >

    </Spinner>

    <Button
        android:id="@+id/btnLogin"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="로그인"/>

   <!-- <EditText
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:inputType="textEmailAddress"/>

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="number"/>-->

</LinearLayout>
*/