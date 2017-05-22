
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

## Minimum API Level
The Lock Task(task pinning) API only works from API 21(Lollipop) onwards as a result of that, this module has a minimum API target of 21 so for your project to compile properly it will also need a minimum API target of 21. This might change in the future if I can find something comparable to use for <21.

## Starting/Stopping Lock Task
```javascript
import { LockTaskAndroid } from 'react-native-lock-task-android';

// START
LockTaskAndroid.stopLockTask();

// STOP
LockTaskAndroid.startLockTask();
```

# A more robust toggle example
**isLockTaskOn** is an async function so that checks whether task is currently being pinned.

```javascript
import { LockTaskAndroid } from 'react-native-lock-task-android';

toggleLockTask = async() => {
    let active = await LockTaskAndroid.isLockTaskOn();
    if (active) {
      LockTaskAndroid.stopLockTask();
    } else {
      LockTaskAndroid.startLockTask();
    }
};

toggleLockTask();
```