/*
 *  This file is part of the DITA-OT Passthrough Plug-in project.
 *  See the accompanying LICENSE file for applicable licenses.
 */

package fox.jason.splash.tasks;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

//   This function extracts the image URL and attribution from the Dog API
//   response. The parsing has been done using simple string manipulation instead
//   of loading the data as XML.

public class DogsParseTask extends Task {

  /**
   * Creates a new <code>DogsParseTask</code> instance.
   */
  public DogsParseTask() {
    super();
  }

  /**
   * Method execute.
   *
   * @throws BuildException if something goes wrong
   */
  @Override
  public void execute() {
    String input = getProject().getProperty("dogs.info");
     int posImgUrl = input.indexOf("\"url\":");
    int lenImgUrl = input.indexOf('"', posImgUrl + 8);

    getProject()
      .setProperty(
        "splash.image.url",
        input.substring(posImgUrl + 7, lenImgUrl)
      );
    getProject()
      .setProperty(
        "splash.title",
        "Picture from the Dogs API"
      );
  }
}
