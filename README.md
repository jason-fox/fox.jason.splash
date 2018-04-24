Splash Screen for DITA-OT
=========================

[![DITA-OT 3.0](https://img.shields.io/badge/DITA--OT-3.0-blue.svg)](http://www.dita-ot.org/3.0/)
[![DITA-OT 2.5](https://img.shields.io/badge/DITA--OT-2.5-green.svg)](http://www.dita-ot.org/2.5/)
[![Build Status](https://travis-ci.org/jason-fox/fox.jason.splash.svg?branch=master)](https://travis-ci.org/jason-fox/fox.jason.splash)
[![license](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

Copyright (c) 2018 Jason Fox

See the [LICENSE](LICENSE) file in the root of this project for license details.

This simple DITA-OT plug-in automatically displays a random cat picture or xkcd comic strip as a splash screen whilst waiting for a build job to complete.


Contents
========

- [Prerequisites](#prerequisites)
  * [Installing DITA-OT](#installing-dita-ot)
  * [Installing the Plug-in](#installing-the-plug-in)
- [Usage](#usage)
  * [Automatically displaying a splash screen when running a build job](#automatically-displaying-a-splash-screen-when-running-a-build-job)
  * [Invoking the splash screen directly from the Command line](#invoking-the-splash-screen-directly-from-the-command-line)
    + [Displaying a random Cat Photo](#displaying-a-random-cat-photo)
    + [Displaying a random XKCD Comic Strip](#displaying-a-random-xkcd-comic-strip)


Prerequisites
=============

The splash screen plug-in has been tested against [DITA-OT 3.0.x](http://www.dita-ot.org/download). It is recommended that you upgrade to the latest version. The splash screen plug-in relies on the use of ANT to obtain and display the splash screen image. ANT 1.9+ is recommended. Older versions of the `<get>` task may fail or timeout when requesting HTTPS images. 

Installing DITA-OT
------------------

The DITA-OT Splash Screen is a plug-in for the DITA Open Toolkit.

-  Install the DITA-OT distribution JAR file dependencies by running `gradle install` from your clone of the [DITA-OT repository](https://github.com/dita-ot/dita-ot).

The required dependencies are installed to a local Maven repository in your home directory under `.m2/repository/org/dita-ot/dost/`.

-  Run the Gradle distribution task to generate the plug-in distribution package:

```bash
./gradlew dist
```

The distribution ZIP file is generated under `build/distributions`.

Installing the Plug-in
----------------------

-  Run the plug-in installation command:

```bash
dita -install https://github.com/jason-fox/fox.jason.splash/archive/v1.0.0.zip
```

The `dita` command line tool requires no additional configuration.


Usage
=====

Automatically displaying a splash screen when running a build job
------------------------------------------------------------------

The plugin is pre-configured to run as part of the `depend.preprocess.pre` build step. Running any ordinary build job will display a random cat photo.

```bash
PATH_TO_DITA_OT/bin/dita -f pdf -o out -i document.ditamap
```

Invoking the splash screen directly from the Command line
---------------------------------------------------------

Like any other transform, when invoked directly, the splash screen requires an input document

### Displaying a random Cat Photo

To display a random photo from the [Cat API](https://thecatapi.com/), use the `cats` transform.

```bash
PATH_TO_DITA_OT/bin/dita -f cats -i document.ditamap
```

### Displaying a random XKCD Comic Strip

To display a random XKCD comic strip from [xkcd.com](https://xkcd.com/), use the `xkcd` transform.

```bash
PATH_TO_DITA_OT/bin/dita -f xkcd -i document.ditamap
```
