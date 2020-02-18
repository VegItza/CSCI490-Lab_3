# CSCI490-Lab_3

Android provides the ListView class (amoung others) which are capable of displaying a scrollable list of items. This can be a complex topic, so we will cover the basics and you will introduced to deeper concepts as the semester progresses.

## Problem
This lab will have you creating a listview that will contain your classes you have taken over the last two semesters. Have at least five classes to list, even if you have to fake it.

## Purpose
This lab will introduce some basic features of the ArrayAdapter and the ListView.  

## Steps
### Create Views:
* Open Android Studio and create a basic project. Name the project whatever you like, **ListViewDemo** is a good candidate. Choose **API 23: Android 6.0 (Marshmallow)**. Next choose just an **Empty Activity**.
* In the **activity_main.xml**, replace the default TextView with 
```xml 
    <ListView
        android:id="@+id/class_schedule"
        android:layout_height="match_parent"
        android:layout_width="match_parent">
    </ListView> 
 ```
* Create a Java reference in **MainActivity.java**.
* Create a String Array with your classes over the last few semesters. Have at least five classes.
* Create an ArrayAdapter with the Application Context, the Android provided **android.R.layout.simple_list_item_1**, and the array.
* Have your ListView object set an adapter with the ArrayAdapter you created in the last step.
* Run your application and test.

### Add Click Listeners:
* **ListView** affords you the option to apply listeners to each item in the list. 
* On your ListView object, set a **OnItemClickListener** and a **OnItemLongClickListener**. Create a different Toast message for each. **NOTE: If you return false on the LongClickListener, it will all for other Listeners**. Test your Click Listeners and observe how the regular click is automatically called after the long click.
* Change the LongClickListener to return true and test again. Observe how the regular click no longer is called.

### Style the ListView
* Add the following lines to the ListView in **activity_main.xml**:
```xml
<ListView
    ...
    android:dividerHeight="5.0sp"
    android:divider="@android:color/black"
    android:padding="45sp">
</ListView>
```
* Test your code one final time.
* Share, commit, and push lab to your GitHub account
