# Crouton Sample Code

Displays the use of the [Crouton](https://github.com/keyboardsurfer/Crouton) library with three use cases:

 * Basic preset crouton
 * Styled crouton
 * Custom view crouton
 
Demo:

<img src="http://i.imgur.com/4aRRnAe.gif" width="350" />

Screens:

<img src="http://i.imgur.com/QlbGZe8.png" width="350" />&nbsp;
<img src="http://i.imgur.com/LtPAkoX.png" width="350" />

See [this tutorial](http://www.grokkingandroid.com/useful-android-libraries-crouton/) for more details.

## Quick Usage

Show simple text crouton alert based on string resource:

```java
Crouton.showText(this, R.string.simple_text_message, Style.INFO);
```

Show styled text crouton alert:

```java
// Define configuration options
Configuration croutonConfiguration = new Configuration.Builder()
    .setDuration(2500).build();
// Define custom styles for crouton
Style style = new Style.Builder()
    .setBackgroundColorValue(Color.parseColor("#daffc0"))
    .setGravity(Gravity.CENTER_HORIZONTAL)
    .setConfiguration(croutonConfiguration)
    .setHeight(150)
    .setTextColorValue(Color.parseColor("#323a2c")).build();
// Display notice with custom style and configuration
Crouton.showText(this, R.string.styled_text_message, style);
```

Show custom crouton alert:

```java
// Inflate any custom view
View customView = getLayoutInflater().inflate(R.layout.custom_crouton_layout, null);
// Display the view just by calling "show"
Crouton.show(this, customView);
```

and `res/layout/custom_crouton_layout.xml` with the content for the notice:

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/LinearLayout1"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#c9dfff"
    android:layout_gravity="center"
    android:orientation="vertical"
    android:paddingTop="15dp"  
    android:paddingBottom="15dp" >

    <RelativeLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center" >

        <ImageView
            android:id="@+id/imageView1"
            android:layout_width="50dp"
            android:layout_height="50dp"
            android:src="@drawable/ic_info" />

        <TextView
            android:id="@+id/textView2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignLeft="@+id/textView1"
            android:layout_below="@+id/textView1"
            android:text="With More Information" />

        <TextView
            android:id="@+id/textView1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentTop="true"
            android:layout_toRightOf="@+id/imageView1"
            android:layout_marginLeft="10dp"
            android:text="Custom Crouton"
            android:textAppearance="?android:attr/textAppearanceLarge" />

    </RelativeLayout>

</LinearLayout>
```

That's it!
