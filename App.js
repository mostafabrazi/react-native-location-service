import React from 'react';
import { NativeModules, Button } from 'react-native';

const App = () => {
  const onPress = () => {
    // native module
    const { BackgroundService } = NativeModules;
    BackgroundService.createBackgroundThread('update_positions', '8');
    console.log('We will invoke the native module here!');
  };
  return (
    <Button
      title="Click to invoke your native module!"
      color="#841584"
      onPress={onPress}
    />
  );
};

export default App;
