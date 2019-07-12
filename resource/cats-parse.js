/*
 *  This file is part of the DITA-OT Splash Screen project.
 *  See the accompanying LICENSE file for applicable licenses.
 */

//   This function extracts the image URL and attribution from the Cat API
//   response. The parsing has been done using simple string manipulation instead
//   of loading the data as XML.

var input = project.getProperty("cats.info");
var posImgUrl = input.indexOf("&lt;url&gt;");
var lenImgUrl = input.indexOf("&lt;/url&gt;", posImgUrl);
var posTitle = input.indexOf("&lt;source_url&gt;");
var lenTitle = input.indexOf("&lt;/source_url&gt;", posTitle + 12);

project.setProperty(
  "splash.image.url",
  input.substring(posImgUrl + 5, lenImgUrl)
);
project.setProperty(
  "splash.title",
  "Picture from " + input.substring(posTitle + 12, lenTitle)
);
