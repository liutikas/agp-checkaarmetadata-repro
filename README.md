# Repro for AGP suggesting to bump compileSdk for test dependencies

`./gradlew mylibraryC:assembleAndroidTest`

```
* What went wrong:
Execution failed for task ':mylibraryC:checkDebugAndroidTestAarMetadata'.
> A failure occurred while executing com.android.build.gradle.internal.tasks.CheckAarMetadataWorkAction
   > An issue was found when checking AAR metadata:
     
       1.  Dependency ':mylibraryB' requires libraries and applications that
           depend on it to compile against version 35 or later of the
           Android APIs.
     
           :mylibraryC is currently compiled against android-34.
     
           Recommended action: Update this project to use a newer compileSdk
           of at least 35, for example 35.
     
           Note that updating a library or application's compileSdk (which
           allows newer APIs to be used) can be done separately from updating
           targetSdk (which opts the app in to new runtime behavior) and
           minSdk (which determines which devices the app can be installed
           on).
```
