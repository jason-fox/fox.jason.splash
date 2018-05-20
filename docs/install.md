Install
=======

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
