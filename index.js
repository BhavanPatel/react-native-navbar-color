import { Platform, StatusBar, NativeModules } from 'react-native'

let NavigationBar = NativeModules.RNNavBarColor;

module.exports = {
   getAPILevel: () => {
      if (Platform.OS == 'android') {
         return NavigationBar.apiLevel;
      }
   },
   setColor: (color) => {
      if (Platform.OS == 'android' && NavigationBar.apiLevel >= 21) {
         return NavigationBar.setColor(color);
      }
   },
   setStatusBarColor: (color, animation) => {
      if (Platform.OS == 'android') {
         return StatusBar.setBackgroundColor(color, animation);
      }
   },
   setStatusBarTheme: (theme, animation) => {
      if (theme == 'light') {
         return StatusBar.setBarStyle('light-content', animation);
      }
      else if (theme == 'dark') {
         return StatusBar.setBarStyle('dark-content', animation);
      }
      else {
         return StatusBar.setBarStyle('default', animation);
      }
   }
}