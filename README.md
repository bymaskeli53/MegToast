# Meg Toast

A lightweight and customizable Android Toast library for displaying messages in your Android applications.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Output](#output)

 ## Installation

To use this library in your Android project, add the following dependency to your settings.gradle file:

```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
and in your app module's build.gradle file
```gradle
dependencies {
	        implementation 'com.github.bymaskeli53:MegToast:v1.0.1'
	}
```
## Usage

```Kotlin
// Show successful toast message for 5 seconds.
 MegToast.makeToast(
                this ,
                MegToastTypes.SUCCESS ,
                "Network" ,
                "Network is successful",
                durationInSeconds = 5)

// Show error toast message for 3 seconds.
MegToast.makeToast(
                this ,
                MegToastTypes.ERROR ,
                "Network" ,
                "There is an error in network.",
                durationInSeconds = 3
            )
```

## Output

![success_image](https://github.com/bymaskeli53/MegToast/assets/73062239/f610299a-8156-4f49-8d58-1f7813c82ccc)

![error_image](https://github.com/bymaskeli53/MegToast/assets/73062239/f58d03e6-db12-4ea3-8f09-ef84269ca4d6)




