Splash Screen for DITA-OT
=========================

Copyright (c) 2018 Jason Fox

See the [LICENSE](LICENSE) file in the root of this project for license details.

Introduction
------------

This simple DITA-OT plug-in automatically displays a random cat picture or xkcd comic strip  as a splash screen whilst waiting for a build job to complete.

Prerequisites
-------------

The splash screen plug-in has been tested against [DITA-OT 3.0.x](http://www.dita-ot.org/download). It is recommended that you upgrade to the latest version. The splash screen plug-in relies on the use of ANT to obtain and display the splash screen image. ANT 1.9+ is recommended. Older versions of the `<get>` task may fail or timeout when requesting HTTPS images. 

### Installing DITA-OT

The DITA-OT Splash Screen is a plug-in for the DITA Open Toolkit.

-  Install the DITA-OT distribution JAR file dependencies by running `gradle install` from your clone of the [DITA-OT repository](https://github.com/dita-ot/dita-ot).

The required dependencies are installed to a local Maven repository in your home directory under `.m2/repository/org/dita-ot/dost/`.

-  Run the Gradle distribution task to generate the plug-in distribution package:

```bash
./gradlew dist
```

The distribution ZIP file is generated under `build/distributions`.

Installation
-----------

### Installing the Plug-in

-  Run the plug-in installation command:

```bash
dita -install https://github.com/jason-fox/fox.jason.splash/archive/v1.0.0.zip
```

The `dita` command line tool requires no additional configuration.

Usage
-----

### Automatically displaying a splash screen when running a build job

The plugin is pre-configured to run as part of the `depend.preprocess.pre` build step. Running any ordinary build job will display a random cat photo.

```bash
PATH_TO_DITA_OT/bin/dita -f pdf -o out -i document.ditamap
```

### Invoking the splash screen directly from the Command line

Like any other transform, when invoked directly, the splash screen requires an input document

#### Displaying a random Cat Photo

To display a random photo from the [Cat API](https://thecatapi.com/), use the `cats` transform.

```bash
PATH_TO_DITA_OT/bin/dita -f cats -i document.ditamap
```

#### Displaying a random XKCD Comic Strip

To display a random XKCD comic strip from [xkcd.com](https://xkcd.com/), use the `xkcd` transform.

```bash
PATH_TO_DITA_OT/bin/dita -f xkcd -i document.ditamap
```
