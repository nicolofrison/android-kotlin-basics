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

### Color theming
-   Use the  [Material palette generator](https://m2.material.io/inline-tools/color/)  to help select a color palette.
-   Declare color resources in the  `colors.xml`  file to make it easier to reuse them.
-   Dark theme can reduce power usage and make your app easier to read in low light.
-   Place app icon files in the  `mipmap`  resource directories.
-   Provide different versions of an app icon bitmap image in each density bucket (`mdpi`,  `hdpi`,  `xhdpi`,  `xxhdpi`,  `xxxhdpi`) for backwards compatibility with older versions of Android.
-   Add resource qualifiers onto resource directories to specify resources that should be used on devices with a certain configuration (e.g.  `v26`).
-   Vector drawables are Android's implementation of vector graphics. They are defined in XML as a set of points, lines, and curves along with associated color information. Vector drawables can be scaled for any density without loss of quality.
-   Adaptive icons were introduced to the Android platform in API 26. They are made up of a foreground and background layer that follow specific requirements, so that your app icon looks high-quality on a range of devices with different OEM masks.
-   Use Image Asset Studio in Android Studio to create legacy and adaptive icons for your app.

### Apply Material UI
-   Use Material Design Components where possible to adhere to Material Design guidelines and allow for more customization.
-   Add icons to give users visual cues about how parts of your app will function.
-   Use  `ConstraintLayout`  to position elements in your layout.
-   Test your app for edges cases (e.g. rotating your app in landscape mode) and make improvements where applicable.
-   Reformat your code and clean up your code to make it as concise as possible.

### Instrumental testing
-   Android Studio generates the necessary test classes when the project is created. However, if you encounter a project that doesn't have them, you can create them manually.
-   Test rules run before every test in a test class.
-   Espresso is a fundamental component of instrumentation tests. It enables interaction with UI components using code.

## Affirmations app
-   `RecyclerView`  widget helps you display a list of data.
-   `RecyclerView`  uses the adapter pattern to adapt and display the data.
-   `ViewHolder`  creates and holds the views for  `RecyclerView`.
-   `RecyclerView`  comes with built in  `LayoutManagers`.  `RecyclerView`  delegates how items are laid out to  `LayoutManagers`.

To implement the adapter:

-   Create a new class for the adapter, for example,  `ItemAdapter`.
-   Create a custom  `ViewHolder`  class that represents a single list item view. Extend from  `RecyclerView.ViewHolder`  class.
-   Modify the  `ItemAdapter`  class to extend from the  `RecyclerView`.`Adapter`  class with the custom  `ViewHolder`  class.
-   Implement these methods within the adapter:  `getItemsCount()`,  `onCreateViewHolder()`, and  `onBindViewHolder()`.

### Complex item
-   To display additional content in a  `RecyclerView`, modify the underlying data model class and data source. Then update the list item layout and adapter to set that data onto the views.
-   Use resource annotations to help ensure that the right type of resource ID is passed into a class constructor.
-   Use the  **Material Components for Android library**  to have your app more easily follow the recommended Material Design guidelines.
-   Use  `MaterialCardView`  to display content in a Material card.
-   Small visual tweaks to your app in terms of color and spacing can make the app look more polished and consistent.