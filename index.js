
import { NativeModules } from 'react-native';

const { RNLockTaskAndroid } = NativeModules;

class LockTaskAndroid {

    // Binding for startLockTask
    static startLockTask = () => {
        RNLockTaskAndroid.startLockTask();
    };

    // Binding for stopLockTask
    static stopLockTask = () => {
        RNLockTaskAndroid.stopLockTask();
    };

    // Binding for isLockTaskOn, returns boolean value
    static isLockTaskOn = async() => {
        return await RNLockTaskAndroid.isLockTaskOn();
    };

}

export default LockTaskAndroid;
