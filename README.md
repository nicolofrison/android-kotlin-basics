# Apps and features
Simple app projects used to learn android development with Kotlin. For each app is defined what have been used inside the app and what have been learned.

## Happy birthday app

-   The  **Layout Editor**  helps you create the UI for your Android app.
-   Almost everything you see on the screen of your app is a  `View`.
-   A  `TextView`  is a UI element for displaying text in your app.
-   A  `ConstraintLayout`  is a container for other UI elements.
-   `Views`  need to be constrained horizontally and vertically within a  `ConstraintLayout`.
-   One way to position a  `View`  is with a margin.
-   A margin says how far a  `View`  is from an edge of the container it's in.
-   You can set attributes on a  `TextView`  like the font, text size, and color.
-   The  **Resource Manager**  in Android Studio helps you add and organize your images and other resources.
-   An  `ImageView`  is a UI element for displaying images in your app.
-   `ImageViews`  should have a content description to help make your app more accessible.
-   Text that is shown to the user like the birthday greeting should be extracted into a string resource to make it easier to translate your app into other languages.

## Roll dice app

-   Add a  `Button`  in an Android app using the  **Layout Editor**.
-   Modify the  `MainActivity.kt`  class to add interactive behavior to the app.
-   Pop up a  `Toast`  message as a temporary solution to verify you're on the right track.
-   Set an on-click listener for a  `Button`  using  `setOnClickListener()`  to add behavior for when a  `Button`  is clicked.
-   When the app is running, you can update the screen by calling methods on the  `TextView`,  `Button`, or other UI elements in the layout.
-   Comment your code to help other people who are reading your code understand what your approach was.
-   Reformat your code and clean up your code.
-   Use  [`setImageResource()`](https://developer.android.com/reference/android/widget/ImageView#setImageResource(int))  to change the image that's displayed in an  `ImageView`
-   Use control flow statements like  `if / else`  expressions or  `when`  expressions to handle different cases in your app, for example, showing different images under different circumstances.

## Tip time app
-   XML (Extensible Markup Language) is a way of organizing text, made of tags, elements, and attributes.
-   Use XML to define the layout of an Android app.
-   Use  `EditText`  to let the user input or edit text.
-   An  `EditText`  can have a hint to tell the user what is expected in that field.
-   Specify the  `android:inputType`  attribute to limit what type of text the user can input into an  `EditText`  field.
-   Make a list of exclusive options with  `RadioButtons`, grouped with a  `RadioGroup`.
-   A  `RadioGroup`  can be vertical or horizontal, and you can specify which  `RadioButton`  should be selected initially.
-   Use a  `Switch`  to let the user toggle between two options.
-   You can add a label to a  `Switch`  without using a separate  `TextView`.
-   Each child of a  `ConstraintLayout`  needs to have vertical and horizontal constraints.
-   Use "start" and "end" constraints to handle both Left to Right (LTR) and Right to Left (RTL) languages.
-   Names of the constraint attributes follow the form  `layout_constraint<Source>_to<Target>Of`.
-   To make a  `View`  as wide as the  `ConstraintLayout`  it's in, constrain the start and end to the start and end of the parent, and set the width to 0dp.
-   View binding lets you more easily write code that interacts with the UI elements in your app.
-   The  `Double`  data type in Kotlin can store a decimal number.
-   Use the  `checkedRadioButtonId`  attribute of a  `RadioGroup`  to find which  `RadioButton`  is selected.
-   Use  `NumberFormat.getCurrencyInstance()`  to get a formatter to use for formatting numbers as currency.
-   You can use string parameters like  `%s`  to create dynamic strings that can still be easily translated into other languages.
-   Testing is important!
-   You can use  **Logcat**  in Android Studio to troubleshoot problems like the app crashing.
-   A stack trace shows a list of methods that were called. This can be useful if the code generates an exception.
-   Exceptions indicate a problem that code didn't expect.
-   `Null`  means "no value."
-   Not all code can handle  `null`  values, so be careful using it.
-   Use  **Analyze > Inspect Code**  for suggestions to improve your code.