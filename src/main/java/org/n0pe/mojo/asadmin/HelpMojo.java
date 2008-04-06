/**
 * asadmin-glassfish-plugin : a maven plugin for glassfish administratives tasks
 * 
 * Copyright (C) 2008  Paul Merlin
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.n0pe.mojo.asadmin;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;


/**
 * HelpMojo.
 *
 * @goal help
 * @description AsAdmin help mojo
 * @author Paul Merlin <eskatos@n0pe.org>
 */
public class HelpMojo
        extends AbstractMojo {


    public void execute()
            throws MojoExecutionException, MojoFailureException {
        getLog().info("asadmin-glassfish-plugin help");
        displayCopyrightNotice();
    }


    protected final void displayCopyrightNotice() {
        getLog().info("asadmin-glassfish-plugin  Copyright (C) 2008 Paul Merlin");
        getLog().info("This program comes with ABSOLUTELY NO WARRANTY; for details type `mvn asadmin:help'.");
        getLog().info("This is free software, and you are welcome to redistribute it");
        getLog().info("under certain conditions; type `mvn asadmin:help' for details.");
    }


}
