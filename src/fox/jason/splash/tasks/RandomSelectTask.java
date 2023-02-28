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

public class RandomSelectTask extends Task {

  private Random random;

  /**
   * Creates a new <code>RandomSelectTask</code> instance.
   */
  public RandomSelectTask() {
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
    String task;

    switch(this.random.nextInt(3) +1) {
      case 1:
        task = "anime.splash";
        break;
      case 2:
        task = "xkcd.splash";
        break;
     /*case 3:
        task = "cats.not.exist.splash";
        break;
     /* case 4:
        task = "person.not.exist.splash";
        break;*/
      default:
        task = "catsapi.splash";
        break;
    }


    getProject()
      .setProperty(
        "random.select",
        task
      );
  }
}
