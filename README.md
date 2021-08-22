# AndroidDateRangePicker
Android Date Range Picker

<p align="center">
  <img src="https://github.com/swapnillengure333/AndroidDateRangePicker/blob/master/Screenshot_2021-08-22-18-29-48-257_com.swapnillengure.daterangepicker.jpg" width="250" title="Screenshot">
  <img src="https://github.com/swapnillengure333/AndroidDateRangePicker/blob/master/Screenshot_2021-08-22-18-30-04-298_com.swapnillengure.daterangepicker.jpg" width="250" alt="Screenshot">
</p>

>Step 1. Add the JitPack repository to your build file
<h3>Add it in your root build.gradle at the end of repositories:</h3>

```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
  >Step 2. Add the dependency
  
  ```gradle
  dependencies {
	        implementation 'com.github.swapnillengure333:AndroidDateRangePicker:Tag'
	}
  ```
  
  >Step 3. Create DateSelectListener to get selected dates in your activity
  
  
  ```gradle
     DateSelectListener dateSelectListener = new DateSelectListener() {
            @Override
            public void onItemClick(List<Date> dateList) {
                Toast.makeText(MainActivity.this, "list " + dateList.toString(), Toast.LENGTH_LONG).show();
            }
        };
  ```
  
  >Step 4. Call CalenderInit method with param activity and DateSelectListener
  
  
  ```gradle
       CalenderRange.CalenderInit(MainActivity.this, dateSelectListener);
  ```
  
  
