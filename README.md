LangUtils Example Plugin
=================

[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/MeowInnovation/LanguageUtils?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

An example plugin for [LangUtils](https://github.com/MeowInnovation/LanguageUtils "LangUtils").

Status: [![Build Status](https://snap-ci.com/MeowInnovation/LangUtilsExample/branch/master/build_image)](https://snap-ci.com/MeowInnovation/LangUtilsExample/branch/master) [![Build Status](https://drone.io/github.com/MeowInnovation/LangUtilsExample/status.png)](https://drone.io/github.com/MeowInnovation/LangUtilsExample/latest)

This demo add a command `/itemname`, which basically tells you the name of the item you are holding. You can change your language to test multi-language compatibility.

Screenshot:

![2015-07-01_00 21 42](https://cloud.githubusercontent.com/assets/5229241/8436019/acb40f0c-1f87-11e5-9414-acc596f343ff.png)

This plugin uses Gradle for build automation. If you want to build the plugin yourself, please run `gradle build`. If you want to edit this plugin, run `gradle idea` or `gradle eclipse` to generate IDE project. If you don't have Gradle installed, use `gradlew` or `./gradlew` instead.