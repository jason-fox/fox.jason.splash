/*
 *  This file is part of the DITA-OT Passthrough Plug-in project.
 *  See the accompanying LICENSE file for applicable licenses.
 */

package fox.jason.splash.tasks;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

//   This function extracts the num count from the XKCD API
//   response and then selects a random entry. The parsing has
//.  been done using simple string manipulation instead
//   of loading the data as JSON.

public class XkcdSelectTask extends Task {

  /**
   * Creates a new <code>XkcdSelectTask</code> instance.
   */
  public XkcdSelectTask() {
    super();
  }

  /**
   * Method execute.
   *
   * @throws BuildException if something goes wrong
   */
  @Override
  public void execute() {
    String input = getProject().getProperty("xkcd.latest");
    int pos = input.indexOf("\"num\": ");
    int len = input.indexOf(",", pos);

    getProject()
      .setProperty(
        "num",
        Integer.toString(
          (int) Math.floor(
            Math.random() * Integer.parseInt(input.substring(pos + 7, len)) + 1
          )
        )
      );
  }
}
