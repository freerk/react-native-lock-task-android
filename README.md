
# react-native-lock-task-android

## Getting started

`$ npm install react-native-lock-task-android --save`

### Mostly automatic installation

`$ react-native link react-native-lock-task-android`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.throwjojo.locktaskandroid.RNLockTaskAndroidPackage;` to the imports at the top of the file
  - Add `new RNLockTaskAndroidPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-lock-task-android'
  	project(':react-native-lock-task-android').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-lock-task-android/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-lock-task-android')
  	```


## Usage
```javascript
import RNLockTaskAndroid from 'react-native-lock-task-android';

// TODO: What to do with the module?
RNLockTaskAndroid;
```
  