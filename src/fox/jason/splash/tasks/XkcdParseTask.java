/*
 *  This file is part of the DITA-OT Passthrough Plug-in project.
 *  See the accompanying LICENSE file for applicable licenses.
 */

package fox.jason.splash.tasks;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

//   This function extracts the image title and URL from the XKCD API
//   response. The parsing has been done using simple string manipulation instead
//   of loading the data as JSON.

public class XkcdParseTask extends Task {


	/**
	 * Creates a new <code>XkcdParseTask</code> instance.
	 */
	public XkcdParseTask() {
		super();
	}

	
	/**
     * Method execute.
     *
     * @throws BuildException if something goes wrong
     */
	@Override
    public void execute(){

		String input = getProject().getProperty("xkcd.info");
		int posImgUrl = input.indexOf("https://imgs.xkcd.com");
		int lenImgUrl = input.indexOf('"', posImgUrl);
		int posTitle = input.indexOf("\"title\": ");
		int lenTitle = input.indexOf('"', posTitle + 10);

		getProject().setProperty("splash.image.url", input.substring(posImgUrl, lenImgUrl));
		getProject().setProperty("splash.title", input.substring(posTitle + 10, lenTitle));

	}
}
