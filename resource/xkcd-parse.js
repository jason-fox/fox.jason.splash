/*
 *  This file is part of the DITA-OT Splash Screen project.
 *  See the accompanying LICENSE file for applicable licenses.
 */

//   This function extracts the image title and URL from the XKCD API
//   response. The parsing has been done using simple string manipulation instead
//   of loading the data as JSON.

var input = project.getProperty("xkcd.info");
var posImgUrl = input.indexOf("https://imgs.xkcd.com");
var lenImgUrl = input.indexOf('"', posImgUrl);
var posTitle = input.indexOf('"title": ');
var lenTitle = input.indexOf('"', posTitle + 10);

project.setProperty("splash.image.url", input.substring(posImgUrl, lenImgUrl));
project.setProperty("splash.title", input.substring(posTitle + 10, lenTitle));
