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

To display a random photo from the [Cat API](https://thecatapi.com/), use the `cats` transform.

```bash
PATH_TO_DITA_OT/bin/dita -f cats -i document.ditamap
```

### Displaying a random XKCD Comic Strip

To display a random XKCD comic strip from [xkcd.com](https://xkcd.com/), use the `xkcd` transform.

```bash
PATH_TO_DITA_OT/bin/dita -f xkcd -i document.ditamap
```
