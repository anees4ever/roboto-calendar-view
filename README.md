Roboto Calendar View
==============

Android Roboto Calendar View provides an easy and customizable calendar view using the awesome library [Calligraphy](https://github.com/chrisjenx/Calligraphy) for fonts

Sample
------

A sample application is available inside of the library

![screenshot](http://i63.tinypic.com/vnjdw5.jpg)

Compatibility
-------------

This library is compatible from API 14.

Usage
-----

Take a look of the sample Activity.

You can override any style and customize your calendar.

Gradle - anees4ever
------
add the library in your specific project build.gradle:

``` xml
    implementation 'com.anees4ever:roboto-calendar-view:3.6.1'
```

if the library is not resolving, add the following line in the root gradle file

``` xml
repositories {
	    maven {
	        url "https://dl.bintray.com/anees4ever/anees4ever"
	    }
	}
```


Gradle - By author
------

RobotoCalendarView uses the awesome tool [Jitpack] (https://jitpack.io/#marcohc/robotocalendarview)

This library uses the awesome tool [![](https://jitpack.io/v/marcohc/robotocalendarview.svg)](https://jitpack.io/#marcohc/robotocalendarview)

Add the repository to your general build.gradle:

``` xml
repositories {
	    maven {
	        url "https://jitpack.io"
	    }
	}
```

And then add the library in your specific project build.gradle:

``` xml
    compile 'com.github.marcohc:robotocalendarview:<release>'
```
 
Credits
-------

 * [Calligraphy](https://github.com/chrisjenx/Calligraphy)

License
-------

    Copyright 2016
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
    http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
