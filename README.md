LangUtils Example Plugin
=================

[![Gitter](https://badges.gitter.im/MascusJeoraly/LanguageUtils.svg)](https://gitter.im/MascusJeoraly/LanguageUtils?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

An example plugin for [LangUtils](https://github.com/MascusJeoraly/LangUtils "LangUtils").

Status: [![Build Status](https://snap-ci.com/MascusJeoraly/LangUtilsExample/branch/master/build_image)](https://snap-ci.com/MascusJeoraly/LangUtilsExample/branch/master)

This demo add two commands `/itemname` and `/showenchant`. 
- `/itemname` basically tells you the name of the item you are holding in the main hand. You can change your language to test multi-language compatibility.
- `/showenchant` lists the enchantments of the item you are holding in the main hand.

Screenshot:

![2015-07-01_00 21 42](https://cloud.githubusercontent.com/assets/5229241/8436019/acb40f0c-1f87-11e5-9414-acc596f343ff.png)

This plugin uses Gradle for build automation. If you want to build the plugin yourself, please run `gradle build`. If you want to edit this plugin, run `gradle idea` or `gradle eclipse` to generate IDE project. If you don't have Gradle installed, use `gradlew` or `./gradlew` instead.
