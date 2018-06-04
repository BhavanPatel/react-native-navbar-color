# React Native Footer Navigation Bar Color and Status Bar
[![NPM version](https://img.shields.io/npm/v/react-native-navbar-color.svg)](https://www.npmjs.com/package/react-native-navbar-color) [![GitHub issues](https://img.shields.io/github/issues/BhavanPatel/react-native-navbar-color.svg)](https://github.com/BhavanPatel/react-native-navbar-color/issues) [![GitHub forks](https://img.shields.io/github/forks/BhavanPatel/react-native-navbar-color.svg)](https://github.com/BhavanPatel/react-native-navbar-color/network) [![GitHub stars](https://img.shields.io/github/stars/BhavanPatel/react-native-navbar-color.svg)](https://github.com/BhavanPatel/react-native-navbar-color/stargazers)

[![NPM](https://nodei.co/npm/react-native-navbar-color.png?downloads=true&downloadRank=true&stars=true)](https://nodei.co/npm/react-native-navbar-color/)

# react-native-navbar-color

Simple package that will set footer navigation bar color.

### Do you need this?
if yes you are at right place!!!

![actual](/screenshot/actual.png)

# Installation

Install the dependencies and then after start the packager.

```sh
$ npm install --save react-native-navbar-color
```


# Linking library
You need to register package in your app.
follow steps

#### Automatic
Use react-native link command to link library.
```sh
react-native link react-native-navbar-color
```

#### Manual
1. [`REACT_NATIVE_PROJECT/android/app/src/main/java/PROJECT_ID/MainApplication.java`]

    Make sure you include in `MainApplication.java` file. 

    ```
    import com.bhavan.RNNavBarColor.RNNavBarColor;
    ```

    In the ***getPackages*** method, add the following instantiation to the returned list.
    ```
    new RNNavBarColor()
    ```

2. [`REACT_NATIVE_PROJECT/android/app/build.gradle`]

    In the `build.gradle` file add inside ***dependencies { .... }*** 
    ```
    compile project(':react-native-navbar-color')
    ```

3. [`REACT_NATIVE_PROJECT/android/settings.gradle`]

    In the `settings.gradle` file add 
    ```
    include ':react-native-navbar-color'
    project(':react-native-navbar-color').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-navbar-color/android')
    ```
    
# API

| Method | Parameters  | Default | Type | Description | Platform
| ------ | ------ |  ------ |------ |------ | ----- |
| setColor | hexcolor | - | *String* | Navbar color in **hex format** in string| **Android** and **API_Level >=21** |
| setStatusBarColor| hexcolor, animation | -  , `true` | *String,Boolean* |  Statusbar color in **hex format**, Show animation **true/false** | **Android**|
| setStatusBarTheme | one of `light`/`dark`/`default` , animation | `default`,`true` | *String*, *Boolean* | Theme of Statusbar Light/Dark/Default in **String**, Show animation **true/false**  | **Android/iOS**|

# Example
This is how you can set footer navigationbar color in android.

import package from node_modules
```
import NavigationBar from 'react-native-navbar-color'
```

method to **set nav color**
```
NavigationBar.setColor('#ffab8e')
```
method to **set statusbar color**
```
NavigationBar.setStatusBarColor('#ffab8e',false)
```
method to **set statusbar theme**
```
NavigationBar.setStatusBarTheme('dark',true)
```

### Here it is full example.

```
import React, { Component } from 'react'
import { View, Text } from 'react-native'
import NavigationBar from 'react-native-navbar-color'

export default class App extends Component {
    componentDidMount() {
        NavigationBar.setColor('#ffab8e')
    }

    render() {
        return (
            <View>
                <Text>
                    This is how we can set the navigation bar color!
                </Text>
            </View>
        )
    }
}
```

#### Output

![example](/screenshot/example.png)




# Todos

 - Write MORE good methods

License
----
MIT
