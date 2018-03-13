## IN DEVELOPMENT

[![NPM version](https://img.shields.io/npm/v/react-native-navbar-color.svg)](https://www.npmjs.com/package/react-native-navbar-color)

[![GitHub issues](https://img.shields.io/github/issues/BhavanPatel/react-native-navbar-color.svg)](https://github.com/BhavanPatel/react-native-navbar-color/issues)

[![GitHub forks](https://img.shields.io/github/forks/BhavanPatel/react-native-navbar-color.svg)](https://github.com/BhavanPatel/react-native-navbar-color/network)

[![GitHub stars](https://img.shields.io/github/stars/BhavanPatel/react-native-navbar-color.svg)](https://github.com/BhavanPatel/react-native-navbar-color/stargazers)

[![NPM](https://nodei.co/npm/react-native-navbar-color.png?downloads=true&downloadRank=true&stars=true)](https://nodei.co/npm/react-native-navbar-color/)

# react-native-navbar-color [android only]

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
Try to link library using link command but it may fails sometimes.
```sh
react-native link react-native-navbar-color
```
#### Manual
1. Make sure you include in `MainApplication.java` file.

    ```
    import com.bhavan.RNNavBarColor.RNNavBarColor;
    ```

2. In the ***getPackages*** method, add the following instantiation to the returned list.
    ```
    new RNNavBarColor()
    ```
3. In the `build.gradle` file add inside ***dependencies { .... }***
    ```
    compile project(':react-native-navbar-color')
    ```
4. In the `settings.gradle` file add 
    ```
    include ':react-native-navbar-color'
    project(':react-native-navbar-color').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-navbar-color/android')
    ```
    
# Example
This is how you can set footer navigationbar color in android.

import package from node_modules
```
import NavigationBar from 'react-native-navbar-color'
```

Call method to set color
```
NavigationBar.setColor('#ffab8e')
```


### Here it is full example.

```
import React, { Component } from 'react'
import { View, Text } from 'react-native'
import NavigationBar from 'react-native-navbar-color'

export default class App extends Component {
    componentWillMount() {
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