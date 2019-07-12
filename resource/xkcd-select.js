/*
 *  This file is part of the DITA-OT Splash Screen project.
 *  See the accompanying LICENSE file for applicable licenses.
 */

//   This function extracts the num count from the XKCD API
//   response and then selects a random entry. The parsing has
//.  been done using simple string manipulation instead
//   of loading the data as JSON.

var input = project.getProperty("xkcd.latest");
var pos = input.indexOf('"num": ');
var len = input.indexOf(",", pos);

project.setProperty(
  "num",
  Math.floor(Math.random() * input.substring(pos + 6, len) + 1)
);
