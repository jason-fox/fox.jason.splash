# Splash Screen for DITA-OT [<img src="https://jason-fox.github.io/fox.jason.splash/splash.png" align="right" width="300">](https://splash-screen-plug-in-for-dita-ot.rtfd.io/)

[![license](https://img.shields.io/github/license/jason-fox/fox.jason.splash.svg)](http://www.apache.org/licenses/LICENSE-2.0)
[![DITA-OT 3.3](https://img.shields.io/badge/DITA--OT-3.3-blue.svg)](http://www.dita-ot.org/3.3/)
[![Build Status](https://travis-ci.org/jason-fox/fox.jason.splash.svg?branch=master)](https://travis-ci.org/jason-fox/fox.jason.splash)
[![Coverage Status](https://coveralls.io/repos/github/jason-fox/fox.jason.splash/badge.svg?branch=master)](https://coveralls.io/github/jason-fox/fox.jason.splash?branch=master)
[![Documentation Status](https://readthedocs.org/projects/splash-screen-plug-in-for-dita-ot/badge/?version=latest)](https://splash-screen-plug-in-for-dita-ot.readthedocs.io/en/latest/?badge=latest)



This simple [DITA-OT Plug-in](https://www.dita-ot.org/plugins) automatically displays a random cat picture or xkcd comic strip as a splash screen whilst waiting for a build job to complete.


# Table of Contents

-  [Install](#install)
  -  [Installing DITA-OT](#installing-dita-ot)
  -  [Installing the Plug-in](#installing-the-plug-in)
- [Usage](#usage)
  -  [Automatically displaying a splash screen when running a build job](#automatically-displaying-a-splash-screen-when-running-a-build-job)
  -  [Invoking the splash screen directly from the Command line](#invoking-the-splash-screen-directly-from-the-command-line)
     -  [Displaying a random Cat Photo](#displaying-a-random-cat-photo)
     -  [Displaying a random XKCD Comic Strip](#displaying-a-random-xkcd-comic-strip)
- [Contribute](#contribute)
- [License](#license)


# Install

The splash screen plug-in has been tested against [DITA-OT 3.x](http://www.dita-ot.org/download). It is recommended that you upgrade to the latest version. The splash screen plug-in relies on the use of ANT to obtain and display the splash screen image. ANT 1.9+ is recommended. Older versions of the `<get>` task may fail or timeout when requesting HTTPS images. 

## Installing DITA-OT

<a href="https://www.dita-ot.org"><img src="https://www.dita-ot.org/images/dita-ot-logo.svg" align="right" height="55"></a>

The DITA-OT Splash Screen is a plug-in for the DITA Open Toolkit.

-   Full installation instructions for downloading DITA-OT can be found
    [here](https://www.dita-ot.org/3.3/topics/installing-client.html).

    1.  Download the `dita-ot-3.3.4.zip` package from the project website at
        [dita-ot.org/download](https://www.dita-ot.org/download)
    2.  Extract the contents of the package to the directory where you want to install DITA-OT.
    3.  **Optional**: Add the absolute path for the `bin` directory to the _PATH_ system variable. This defines the
        necessary environment variable to run the `dita` command from the command line.

```console
curl -LO https://github.com/dita-ot/dita-ot/releases/download/3.3.4/dita-ot-3.3.4.zip
unzip -q dita-ot-3.3.4.zip
rm dita-ot-3.3.4.zip
```

## Installing the Plug-in

-   Run the plug-in installation command:

```console
dita -install https://github.com/jason-fox/fox.jason.splash/archive/master.zip
```

The `dita` command line tool requires no additional configuration.


# Usage

## Automatically displaying a splash screen when running a build job

The plugin is pre-configured to run as part of the `depend.preprocess.pre` build step. Running any ordinary build job will display a random cat photo.

```console
PATH_TO_DITA_OT/bin/dita -f pdf -o out -i document.ditamap
```

## Invoking the splash screen directly from the Command line

Like any other transform, when invoked directly, the splash screen requires an input document

### Displaying a random Cat Photo

<a href="https://thecatapi.com"><img src="https://cdn2.thecatapi.com/logos/thecatapi_256xW.png" align="left" height="75"></a>

To display a random photo from the [Cat API](https://thecatapi.com/), use the `cats` transform.

```console
PATH_TO_DITA_OT/bin/dita -f cats -i document.ditamap
```

### Displaying a random XKCD Comic Strip

<a href="https://xkcd.com"><img src="https://xkcd.com/s/0b7742.png" align="left" height="55"></a>

To display a random XKCD comic strip from [xkcd.com](https://xkcd.com/), use the `xkcd` transform.

```console
PATH_TO_DITA_OT/bin/dita -f xkcd -i document.ditamap
```

## Contribute

PRs accepted.

## License

[Apache 2.0](LICENSE) © 2018 Jason Fox

The Program includes the following additional software component which was obtained under license:

* Ant-Swing.jar - https://ant.apache.org/ - **Apache 2.0 license**
