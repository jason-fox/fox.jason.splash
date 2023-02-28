/*
 *  This file is part of the DITA-OT Passthrough Plug-in project.
 *  See the accompanying LICENSE file for applicable licenses.
 */

package fox.jason.splash.tasks;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import java.util.Random;

//   This function selects a random entry using the 
//   ThisAnimeDoesNotExist API

public class AnimeSelectTask extends Task {

  private Random random;

  /**
   * Creates a new <code>AnimeSelectTask</code> instance.
   */
  public AnimeSelectTask() {
    super();
    this.random = new Random();
  }

  /**
   * Method execute.
   *
   * @throws BuildException if something goes wrong
   */
  @Override
  public void execute() {
    getProject()
      .setProperty(
        "anime.psi",
        Double.toString(
          (this.random.nextInt(17) + 3)/10.0
        )
      );

     getProject()
      .setProperty(
        "anime.seed",
        Integer.toString(
          this.random.nextInt(9998) + 1
        )
      );
  }
}
