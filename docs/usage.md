<h1>Usage</h1>

## Automatically displaying a splash screen when running a build job

The plugin is pre-configured to run as part of the `depend.preprocess.pre` build step. Running any ordinary build job
will display a random cat photo.

```bash
PATH_TO_DITA_OT/bin/dita -f pdf -o out -i document.ditamap
```

## Invoking the splash screen directly from the Command line

Like any other transform, when invoked directly, the splash screen requires an input document

### Displaying a random Cat Photo

<a href="https://thecatapi.com"><img src="https://cdn2.thecatapi.com/logos/thecatapi_256xW.png" align="left" width="112" height="75"></a>

To display a random photo from the [Cat API](https://thecatapi.com/), use the `cats` transform.

```console
PATH_TO_DITA_OT/bin/dita -f cats -i document.ditamap
```

### Displaying a random XKCD Comic Strip

<a href="https://xkcd.com"><img src="https://xkcd.com/s/0b7742.png" align="left" width="122" height="55"></a>

To display a random XKCD comic strip from [xkcd.com](https://xkcd.com/), use the `xkcd` transform.

```console
PATH_TO_DITA_OT/bin/dita -f xkcd -i document.ditamap
```
